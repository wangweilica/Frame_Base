/**
 * 题库
 */
package com.zkhy.contest.web.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.util.Assert;

/**
 * 概要：字符串处理通用类
 * @author Yachen ZHU
 * @version 1.0.0 2014-2-1
 */
public class StringUtil {

	/**
	 * 空字符串
	 */
	public static final String STR_EMPTY = "";

	/**
	 * 省略号
	 */
	public static final String STR_APOSTROPHE = "……";
	

	/**
	 * 双引号
	 */
	public static final String STR_DOUBLE_QUOTATION = "\"";
	

	/**
	 * 单引号
	 */
	public static final String STR_SINGLE_QUOTATION = "'";
	

	/**
	 * 回车符 
	 */
	public static final String STR_ENTER = "\n";
	

	/**
	 * 空格符
	 */
	public static final String STR_WHITESPACE = " ";
	
	/**
	 * 分号符
	 */
	public static final String STR_SEPRATOR = "&";
	
	/**
	 * 数字零 0
	 */
	public static final int ZERO = 0;
	
	/**
	 * false
	 */
	public static final String FALSE = "false";
	
	/**
	 * 字符串是否为空
	 * @param str 字符串
	 * @return 空--true  非空--false
	 */
    public static boolean isNullString(String str) {
        return (str == null || STR_EMPTY.equals(str.trim()));
    }
    
    
    /**
     * 字符串转Long
     * @param str
     * @return
     */
    public static long strToLong(String str) {
    	if(isNullString(str)) {
    		return 0L;
    	}
    	
    	return Long.parseLong(str);
    }
    
    /**
     * 字符串转float
     * @param str
     * @return
     */
    public static float strToFloat(String str) {
    	if(isNullString(str)) {
    		return (float) 0.0;
    	}
    	
    	return Float.parseFloat(str.trim());
    }
    
    /**
     * 比较字符串相同
     * @param a
     * @param b
     * @return
     */
    public static boolean strComp(String a, String b) {
    	if(isNullString(a)) {
    		if(isNullString(b)) {
    			return true;
    		}
    	}
    	
    	return a.trim().equals(b.trim());
    }
    
    
    /**
     * 比较字符串相同，不考虑大小写
     * @param a
     * @param b
     * @return
     */
    public static boolean strCompIgnoreCase(String a, String b) {
    	if(isNullString(a)) {
    		if(isNullString(b)) {
    			return true;
    		}
    	}
    	
    	return a.trim().equalsIgnoreCase(b.trim());
    }
    
    
    /**
     * 截断太长的字符串，在后面添加省略号
     * @param str
     * @param length
     * @return
     */
    public static String representTooLongStr(String str, int length) {
    	if(isNullString(str)) {
    		return STR_EMPTY;
    	}
    	
    	
    	if(str.length() <= length) {
    		return str;
    	}
    	
    	return str.substring(0, length-1).concat(STR_APOSTROPHE);
    }
    
    
    /**
     * 根据符号分割字符串
     * @param source
     * @param symbol
     * @return 返回分割后的列表
     */
    public static ArrayList<String> splitStringBySymbol(String source, String symbol) {
    	ArrayList<String> result = new ArrayList<String>();
    	
		String[] origin = source.split("\\".concat(symbol));
		
		for(int i=0; i<origin.length; i++) {
			if(!isNullString(origin[i])) {
				//去除字符串两端的空格
				result.add(origin[i].trim());
			}
		}
		return result;
    }
    
    /**
     * 根据符号分割字符串
     * @param source
     * @param symbol
     * @param size  取前size个元素
     * @return 返回分割后的列表
     */
    public static ArrayList<String> splitStringBySymbolLimit(String source, String symbol, int size){
    	ArrayList<String> result = new ArrayList<String>();
    	ArrayList<String> list = null;
    	
    	try {
			Assert.notNull(source);
			list = splitStringBySymbol(source, symbol);
			if(list.size() >= size){
	    		for(int i = 0; i<size; i++){
	    			result.add(list.get(i));
	    		}
	    		return result;
	    	}
		} catch (Exception e) {
			return null;
		}
    	return list;
    }
    
    public static boolean isNotNullIntArray(int[] intArray){
    	return (intArray !=null && intArray.length > ZERO);
    }
    
    /**
	 * 判断对象，集合，数组是否为空
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isNullOrEmpty(Object obj) {
		if (obj == null)
			return true;

		if (obj instanceof CharSequence)
			return ((CharSequence) obj).length() == 0;

		if (obj instanceof Collection)
			return ((Collection<?>) obj).isEmpty();

		if (obj instanceof Map)
			return ((Map<?, ?>) obj).isEmpty();
		
		if (obj instanceof Object[]) {
			Object[] object = (Object[]) obj;
			if (object.length == 0) {
				return true;
			}
		}
		
		return false;
	}
	
	  /**
     * 处理是空串的情况
     * @param str
     * @return
     */
    public static String correctNullStr(String str) {
    	if(isNullString(str)) {
    		return STR_EMPTY;
    	}
    	return str;
    }
    
}
