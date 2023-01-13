package com.zixieqing.o1classadapter.impl;

import com.zixieqing.ATMContext;
import com.zixieqing.ATMState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>@description  : 该类功能  具体状态：准备状态
 * 具体状态：1、实现Context的一个状态的相关行为逻辑
 * 2、在需要时进行状态切换
 * 状态切换可以是本状态中的不同行为切换，也可以是切换到不同具体状态者
 * </p>
 * <p>@package      : com.zixieqing.o1class$adapter.impl</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ReadyState implements ATMState {

    private Logger logger = LoggerFactory.getLogger(ReadyState.class);

    /**
     * 依赖：保留状态所属者Context的引用，作用：方便对其进行操作
     * 接口ATMState 是对状态进行了抽象
     * 实现类（ReadyState或其他实现类）是具体的状态
     * 这些具体状态者（实现类）都只是状态本身而已，而状态所属者是Context，最后状态是要回到所属者身边的
     * 如果这个具体状态者中没有 对 状态所属者Context进行相应操作，那：具体状态者 和 状态所属者就是割裂 / 分开的
     */
    private ATMContext atmContext;

    public ReadyState(ATMContext atmContext) {
        this.atmContext = atmContext;
    }

    @Override
    public void insertCard() {
        logger.info("完成插卡");
    }

    @Override
    public void submitPwd() {
        logger.info("正在进行密码校验............");
        if ("123456".equals(atmContext.getPwd())) {
            logger.info("密码校验成功");
        } else {
            logger.info("密码不正确");
            // 状态切换：退卡 / 重新进入准备状态..........
            checkOut();
        }
    }

    @Override
    public void getCash() {
        // 如果ATM中没钱了，那就不能再提供服务
        if (atmContext.getATMBalance() == 0) {
            logger.info("无法使用服务，请去另外机子进行业务办理");

            // 弹卡
            checkOut();

            /*
                状态切换
                注意这里：这里没有用new，而是用的atmContext的setter，这也是前面说保留atmContext引用的好处之一
                好处：降低耦合（迪米特原则：最少知道原则），获取弹性
             */
            atmContext.setCurrState(atmContext.getNoServiceState());
        } else {
            if (atmContext.getMoney() <= atmContext.getATMBalance() && atmContext.getMoney() <= atmContext.getBalance()) {
                // 出钞、减少用户的账户余额
                logger.info("出钞￥：{}", atmContext.getMoney());
                atmContext.setBalance(atmContext.getBalance() - atmContext.getMoney());

                // 减少ATM中的钞票金额
                atmContext.setATMBalance(atmContext.getATMBalance() - atmContext.getMoney());

                // 打印发票、回到准备状态...........

                // 弹卡
                checkOut();
            } else {
                logger.info("余额不足");
                checkOut();
            }
        }
    }

    @Override
    public void queryBalance() {
        logger.info("账户余额为：{}", atmContext.getBalance());
    }

    @Override
    public void checkOut() {
        logger.info("退卡成功");
    }
}
