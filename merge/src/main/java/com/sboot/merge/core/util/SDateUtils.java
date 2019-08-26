package com.sboot.merge.core.util;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName SDateUtils
 * @description 时间工具类
 * @author hellozhaoxudong@163.com
 * @date 2019/5/16 17:58
 */
public class SDateUtils {

    /**
     *  日期格式
     */
    public static final String DATEFORMAT_YYYYMMDD = "yyyy-MM-dd";

    public static final String DATEFORMAT_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";


    /**
     * StringToDate : 时间字符串转时间
     *
     * @author hellozhaoxudong@163.com
     * @version 1.0
     * @date 2019/5/26 15:24
     * @param dateStr 时间字符串
     * @param dateFormat 时间格式
     * @return java.util.Date
     * @since JDK 1.8
     */
    public static Date stringToDate(String dateStr, String dateFormat){
        if(StringUtils.isBlank(dateStr) || StringUtils.isBlank(dateFormat)){
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        try {
            Date date = sdf.parse(dateStr);
            return date;
        }catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * gainCurrentYear : 获取当前年份
     *
     * @author hellozhaoxudong@163.com
     *
     * @date 2019/5/20 17:25
     * @param
     * @return int
     * @since JDK 1.8
     */
    public static int gainCurrentYear(){
        Calendar cale = Calendar.getInstance();
        return cale.get(Calendar.YEAR);
    }

    /**
     * gainCurrentDayOfWeek : 获取当前是星期几
     *
     * @author hellozhaoxudong@163.com
     * @date 2019/5/16 18:06
     * @param
     * @return int
     */
    public static int gainCurrentDayOfWeek(){
        Calendar calendar = Calendar.getInstance();
        int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if(dayOfweek < 0){
            dayOfweek = 7;
        }

        return dayOfweek;
    }

    /**
     * gainDateDayOfWeek : 获取指定日期是星期几
     *
     * @author hellozhaoxudong@163.com
     * @date 2019/5/16 18:06
     * @param
     * @return int
     */
    public static int gainDateDayOfWeek(Date date){
        if(null == date){
            return 0;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if(dayOfweek < 0){
            dayOfweek = 7;
        }

        return dayOfweek;
    }


    /**
     * gainAfterCountDate : 获取指定日期之后的X天之后的日期
     *
     * @author hellozhaoxudong@163.com
     * @date 2019/5/20 17:44
     * @param date  指定日期
     * @param count 向后数的天数
     * @return java.util.Date
     */
    public static Date gainAfterCountDate(Date date, int count){
        if (null == date){
            date = new Date();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, count);

        return calendar.getTime();
    }
}
