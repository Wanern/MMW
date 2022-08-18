package com.wanern.mmw.common.utils;

/**
 * Created by Ale on 2022/7/30
 */
public enum Replace {

    /**
     * 11位号码替换
     */
    Phone("(\\d{3})\\d{4}(\\d{4})"),


    /**
     * 生份证信息替换
     */
    IDCard("(\\d{4})\\d{10}(\\w{4})");


    String regex;

    public String getRegex() {
        return regex;
    }

    Replace(String regex) {
        this.regex = regex;
    }
}


