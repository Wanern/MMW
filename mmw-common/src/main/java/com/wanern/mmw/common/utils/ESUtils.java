package com.wanern.mmw.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 通用工具类
 * Created by Ale on 2022/8/9
 */
public class ESUtils {


    private final static Logger logger = LoggerFactory.getLogger(ESUtils.class);


    private ESUtils() {
    }


    /**
     * 字符串去除两端空格
     * @param val
     * @return
     */
    public static String trim(Object val) {
        return val != null ? val.toString().trim() : "";
    }


    /**
     * 字符串验证
     * @param val
     * @return
     */
    public static boolean isEmpty(Object val) {
        return val == null || "".equals(trim(val));
    }


    /**
     * 字符串拼接
     * @param objects
     * @return
     */
    public static String j(Object... objects) {
        return join(50, objects);
    }

    private static String join(int capacity, Object... objects) {
        if (objects.length <= 0) return "";
        StringBuffer s = new StringBuffer(capacity <= 0 ? 1024 : capacity);
        Object[] data = objects;
        for (int i = 0; i < objects.length; ++i) {
            Object o = data[i];
            if (o != null && o.getClass() == Object[].class) {
                Object[] obj = (Object[]) o;
                int length = obj.length;
                for (int j = 0; j < length; ++j) {
                    Object p = obj[j];
                    if (p != null && p.getClass() == Object[].class) {
                        s.append(join(1024, p));
                    } else {
                        s.append(p != null ? p : "");
                    }
                }
            } else {
                s.append(o != null ? o : "");
            }
        }
        return s.toString();
    }


    /**
     * val是否存在后面字符串数组中
     * @param val
     * @param values
     * @return
     */
    public static boolean inStr(String val, String... values) {
        val = trim(val);
        if ("".equals(val)) return false;
        String[] data = values;
        for (int i = 0; i < values.length; ++i) {
            String s = data[i];
            if (val.equals(trim(s))) {
                return true;
            }
        }
        return false;
    }


    /**
     * 判断当前数据是否在后面参数列表，忽略大小写比较
     * @param val
     * @param values
     * @return
     */
    public static boolean inStrIgnoreCase(String val, String... values) {
        val = trim(val);
        if ("".equals(val)) return false;
        String[] data = values;
        for (int i = 0; i < values.length; ++i) {
            String s = data[i];
            if (val.equalsIgnoreCase(trim(s))) {
                return true;
            }
        }
        return false;
    }


    /**
     * 当前日期
     * @return
     */
    public static LocalDate currentDate() {
        return LocalDate.now(ZoneId.systemDefault());
    }


    /**
     * 当前时间
     * @return
     */
    public static LocalDateTime currentDateTime() {
        return LocalDateTime.now(ZoneId.systemDefault());
    }


    /**
     * 日期格式化
     * 默认格式: yyyy-MM-dd
     * @param date
     * @return
     */
    public static String dateFormat(LocalDate date) {
        return dateFormat(date, "");
    }


    /**
     * 自定义日期格式化
     * 默认格式: yyy-MM-dd
     * @param date
     * @param format
     * @return
     */
    public static String dateFormat(LocalDate date, String format) {
        format = trim(format);
        if ("".equals(format)) {
            return date.format(DateTimeFormatter.ofPattern("yyy-MM-dd"));
        }
        return date.format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * 日期格式化
     * 默认格式: yyyy-MM-dd HH:mm:ss
     * @param dateTime
     * @return
     */
    public static String dateTimeFormat(LocalDateTime dateTime) {
        return dateTimeFormat(dateTime, "");
    }

    /**
     * 自定义日期格式化
     * 默认格式: yyyy-MM-dd HH:mm:ss
     * @param dateTime
     * @param format
     * @return
     */
    public static String dateTimeFormat(LocalDateTime dateTime, String format) {
        format = trim(format);
        if ("".equals(format)) {
            return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        }
        return dateTime.format(DateTimeFormatter.ofPattern(format));
    }


    /**
     * 字符串转日期
     * @param date
     * @return
     */
    public static LocalDate formatDate(String date) {
        date = trim(date);
        if ("".equals(date)) {
            return currentDate();
        }
        LocalDate parse;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            parse = LocalDate.parse(date, formatter);
        } catch (Exception e) {
            return currentDate();
        }
        return parse;
    }

    /**
     * 字符串转当前时间
     * @return
     */
    public static LocalDateTime formatDateTime(String dateTime) {
        dateTime = trim(dateTime);
        if ("".equals(dateTime)) {
            return currentDateTime();
        }
        LocalDateTime localDateTime;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            localDateTime = LocalDateTime.parse(dateTime, formatter);
        } catch (Exception e) {
            return currentDateTime();
        }
        return localDateTime;
    }

    /**
     * date 转 localDate
     * @param date
     * @return
     */
    public static LocalDate dateToLocalDate(Date date) {
        if (isEmpty(date)) {
            return currentDate();
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * date 转 localDateTime
     * @param date
     * @return
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        if (isEmpty(date)) {
            return currentDateTime();
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }


    /**
     * 比率转换
     * @param divisor
     * @param dividend
     * @param fractionDigits
     * @return
     */
    public static String computeRatio(double divisor, double dividend, int fractionDigits) {
        if (dividend == 0.0) {
            return "0";
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(fractionDigits);
        return numberFormat.format((float) divisor / (float) dividend * 100);
    }


    /**
     * 正则匹配
     * @param regex  正则表达式 -> RegexEnum
     * @param target 匹配目标
     * @return
     */
    public static boolean regexMatches(String regex, String target) {
        regex = trim(regex);
        target = trim(target);
        if (isEmpty(regex) || isEmpty(target)) {
            return false;
        }
        return Pattern.compile(regex).matcher(target).matches();
    }


    public static String numberFill(String str) {
        if (isEmpty(str)) {
            return "000000";
        }
        int len = 6;
        int strLen = str.length();
        if (str.length() >= len) {
            return str;
        }
        int mantissa = len - strLen;
        String s = "";
        if (mantissa > 0) {
            for (int i = 0; i < mantissa; i++) {
                s = j("0", s);
            }
        }
        if (isEmpty(s)) {
            return str;
        }
        return j(s, str);
    }


    public static String MD5Encoding(String data) {
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            logger.error("The Md5 encoding is abnormal");
            return "";
        }
        char[] charArray = data.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            byteArray[i] = (byte) charArray[i];
        }
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }



    /**
     * 默认替换
     * @param replace 替换正则
     * @param val     替换值
     * @return String
     */
    public static String replace(Replace replace, String val) {
        return replace(replace, val, "");
    }


    /**
     * 正则替换，自定义格式(内部已验证需替换对象是否符合正则条件)
     * @param replace 替换正则
     * @param val     替换对象(不为空，否则返回空字符)
     * @param format  自定义格式
     * @return String
     */
    public static String replace(Replace replace, String val, String format) {
        val = ESUtils.trim(val);
        if ("".equals(val)) return "";
        switch (replace) {
            case Phone:
                return BaseReplace.replacePhone(replace, val, format);
            case IDCard:
                return BaseReplace.replaceIDCard(replace, val, format);
            default:
                return "";
        }
    }

    /**
     * 正则验证
     * @param regex 表达式
     * @param str   验证值
     * @return boolean
     */
    public static boolean isRegex(Regex regex, String str) {
        return isEmpty(str) ? false : Pattern.compile(regex.getRegex()).matcher(str).matches();
    }


    public static void main(String[] args) {
        LocalDate localDate = formatDate("2021-06-21");
        System.out.println(localDate);


        System.out.println();
    }
}
