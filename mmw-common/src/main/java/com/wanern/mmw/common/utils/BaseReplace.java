package com.wanern.mmw.common.utils;

/**
 * Created by Ale on 2022/7/30
 */
public class BaseReplace {


    private BaseReplace() {
    }


    /**
     * 基础替换
     * @param replace 替换正则
     * @param val     替换对象
     * @param format  替换格式
     * @param service 替换接口
     * @return String
     */
    private static String replace(Replace replace, String val, String format, IReplaceService service) {
        format = ESUtils.trim(format);
        format = "".equals(format) ? "****" : format;
        return service.replace(replace, val, format);
    }


    /**
     * 身份证与手机号替换
     * @param replace 替换正则
     * @param val     替换对象
     * @param format  替换格式
     * @return String
     */
    public static String replacePhone(Replace replace, String val, String format) {
        if (!ESUtils.isRegex(Regex.Phone, val)) {
            return "";
        }
        return replace(replace, val, format, (r, v, f) -> v.replaceAll(r.getRegex(), ESUtils.j("$1", f, "$2")));
    }

    /**
     * 生份证信息替换
     * TODO: 后续实现
     * @param replace
     * @param val
     * @param format
     * @return
     */
    public static String replaceIDCard(Replace replace, String val, String format) {
        //return !ESUtil.isRegex(Regex., val) ? ""
        return "";
    }
}
