package com.zixieqing;

import com.zixieqing.o1classadapter.impl.NoServiceState;
import com.zixieqing.o1classadapter.impl.ReadyState;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>@description  : 该类功能  Context上下文对象（这个Context是核心）
 * 状态所属者：1、维护具体状态者实例；
 * 2、也可以有它自己的特有状态；
 * 3、将状态改变时其对应的行为交给对应的状态对象，即：状态改变时让其走对应的逻辑（供外部调用的）
 * 上面2、3根据情况决定可有可无
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

@Data
@ToString
@Accessors(chain = true)
public class ATMContext {

    // 假设此Context对象有如下的独有状态（实质是：老衲待会儿测试需要，一次性写在这里了）
    /**
     * 密码
     */
    private String pwd;

    /**
     * 用户取款金额
     */
    private int money;

    /**
     * 用户的账户余额（假设为int类型）
     */
    private int balance;

    /**
     * ATM机中的钞票余额
     */
    private int ATMBalance;

    // 下面这些就是这个Context所维护的具体状态者实例
    /**
     * 当前状态
     */
    private ATMState currState;
    /**
     * 准备状态
     */
    private ATMState readyState;
    /**
     * 无服务状态
     */
    private ATMState noServiceState;

    /**
     * 初始化所有状态
     *
     * @param pwd        密码
     * @param money      用户取款金额
     * @param balance    用户的账户余额
     * @param ATMBalance ATM机中的钞票余额
     */
    public ATMContext(String pwd, int money, int balance, int ATMBalance) throws Exception {
        this.pwd = pwd;
        this.money = money;
        this.balance = balance;
        this.ATMBalance = ATMBalance;

        this.readyState = new ReadyState(this);
        this.noServiceState = new NoServiceState(this);
        if (this.getATMBalance() > 0) {
            this.currState = readyState;
        } else if (this.getATMBalance() < 0) {
            this.currState = noServiceState;
        } else {
            throw new Exception();
        }
    }

    // 下面这些就是这个Context在其状态改变时将具体行为委托给具体状态对象（可以直接供外部调用）

    /**
     * 转换到插卡行为
     */
    public void insertCard() {
        this.currState.insertCard();
    }

    /**
     * 提交密码
     */
    public void submitPwd() {
        this.currState.submitPwd();
    }

    /**
     * 取款
     */
    public void getCash() {
        this.currState.getCash();
    }

    /**
     * 查询余额
     */
    public void queryBalance() {
        this.currState.queryBalance();
    }

    public void checkOut() {
        this.currState.checkOut();
    }
}
