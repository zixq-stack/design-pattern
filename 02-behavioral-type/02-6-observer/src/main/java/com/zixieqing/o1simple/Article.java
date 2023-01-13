package com.zixieqing.o1simple;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>@description  : 该类功能  文章
 * </p>
 * <p>@package      : com.zixieqing.o1simple</p>
 * <p>@author       : ZiXieqing</p>
 */

@Data
@ToString
@Accessors(chain = true)
public class Article {

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String context;

    /**
     * 发布人编号
     */
    private Long publisherId;

    /**
     * 发布时间
     */
    private Date createTime;

    /**
     * 文章所属标签
     */
    private String articleLabel;

}
