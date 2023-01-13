package com.zixieqing;

import com.zixieqing.o1simple.Article;
import com.zixieqing.o1simple.IBlogger;
import com.zixieqing.o1simple.impl.QFan;
import com.zixieqing.o1simple.impl.XFan;
import com.zixieqing.o1simple.impl.Zixieqing;

import java.util.Date;

/**
 * <p>@description  : 该类功能  测试
 * </p>
 * <p>@package      : com.zixieqing</p>
 * <p>@author       : ZiXieqing</p>
 */

public class ApiTest {
    public static void main(String[] args) {
        IBlogger blogger = new Zixieqing();

        // 让指定粉丝能收到通知
        QFan qFan = new QFan();
        XFan xFan = new XFan();
        blogger.add(qFan);
        blogger.add(xFan);

        // 博主开始写文章
        Article article = new Article();
        String context = "设计莫斯一共有23种，分为创建型、行为型、结构型，这三类其实就是不同层别的架构，" +
                "如：创建型就是专门用于new实例的架构；即：对象，而行为型体现在行为上，也就是所谓的方法，" +
                "变来变去其实本质就是对类中方法的架构" +
                "学完全部设计模式之后，感受就会起来了，然后只需要知晓每个设计模式解决的场景是什么，" +
                "最后开发中遇到对应的设计模式场景就套用，然后思路就出来，也熟练了";
        article.setTitle("设计模式")
                .setPublisherId(System.nanoTime())
                .setContext(context)
                .setArticleLabel("设计")
                .setCreateTime(new Date());

        // 将文章推给粉丝
        blogger.notice(article);


        System.out.println("=============华丽的分隔符===============");

        // blogger.remove(xFan);
        article.setTitle("爱码有道")
                .setPublisherId(System.nanoTime())
                .setContext("正式开发时还是遵循开发规范比较好")
                .setArticleLabel("代码整洁")
                .setCreateTime(new Date());

        // 将文章推给粉丝
        blogger.notice(article);
    }
}
