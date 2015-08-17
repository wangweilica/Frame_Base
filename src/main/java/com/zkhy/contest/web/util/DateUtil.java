/**
 * 题库
 */
package com.zkhy.contest.web.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
  * @author wangwei
  * @version:1.0.0
  * @date 2014-4-11
  */
public class DateUtil {

	public static final String DATE_PARSE_TYPE_DAY_TIME_SECOND_STR = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * 空字符串
	 */
	private static final String EMPTY_STR = "";
	
	/**
     * 字符串转Date,精确到日
     * @param dateStr
     * @return
     */
    public static Date strToDate(String dateStr) {    	
    	
    	if(StringUtil.isNullString(dateStr)) {
    		return null;
    	}

    	SimpleDateFormat sdf = new SimpleDateFormat(DATE_PARSE_TYPE_DAY_TIME_SECOND_STR);
    	Date date = null;
		try {
			date = (Date) sdf.parseObject(dateStr);
		} catch (ParseException e) {
			return null;
		}
    	return date;
    }
    
    /**
     * Date转字符串
     * @param date
     * @return
     */
    public static String dateToStr(Date date, String format) {
    	if(date == null) {
    		return EMPTY_STR;
    	}
    	
    	String dateStr = null;
    	
    	SimpleDateFormat sdf = new SimpleDateFormat(format);
    	dateStr = sdf.format(date);
    	
    	return StringUtil.correctNullStr(dateStr);
    }
    
    /**
     * Date转字符串, 精确到秒
     * @param date
     * @return
     */
    public static String dateToStr(Date date) {
    	return dateToStr(date, DATE_PARSE_TYPE_DAY_TIME_SECOND_STR);
    }
    
    /**
     * 获取当前时间
     * @return
     */
    public static Date getCurrentTime() {
    	return new Date(System.currentTimeMillis());
    }
}
