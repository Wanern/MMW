package com.wanern.mmw.common.utils;

/**
 * Created by Ale on 2022/7/30
 */
public enum Regex {

    /**
     * 邮箱地址
     */
    Email("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"),


    /**
     * 英特尔网址
     */
    InternetURL("((http[s]{0,1})://)(([a-zA-Z0-9\\._-]+\\.[a-zA-Z]{2,6})|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}))(:[0-9]{1,4})*(/[a-zA-Z0-9\\&%_\\./-~-]*)?"),


    /**
     * 11位手机号
     */
    Phone("^((13[0-9])|(14[0|5|6|7|9])|(15[0-3])|(15[5-9])|(16[6|7])|(17[2|3|5|6|7|8])|(18[0-9])|(19[1|8|9]))\\d{8}$"),


    /**
     * Base64编码格式
     */
    Base64("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$"),


    /**
     * 用户名特殊符号控制，只允许大小写字母开头+数字或下划线，长度为4-8位
     */
    UserName("^[a-zA-Z]\\w{3,7}$"),


    /**
     * 正数
     */
    Digital("[0-9]*");


    private String regex;

    public String getRegex() {
        return regex;
    }

    Regex(String regex) {
        this.regex = regex;
    }
}
