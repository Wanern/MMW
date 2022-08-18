package com.wanern.mmw.common.utils;

/**
 * Created by Ale on 2022/7/30
 */
public interface IReplaceService {

    /**
     * 正则替换
     * @param replace 正则对象
     * @param val     需替换的值
     * @param format  自定义替换格式
     * @return String
     */
    String replace(Replace replace, String val, String format);
}
