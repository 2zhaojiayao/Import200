package com.bigdata.ant.utils;

import java.util.Calendar;
import java.util.Date;

public class IncreaseTimeUtil {
	/**
	 * 
	* @Title: addDateMinut  
	* @Description: TODO(这里用一句话描述这个方法的作用) 给要求的时间加几个小时
	* @param:@param date
	* @param:@param hour
	* @param:@return (参数)
	* @return:String(返回类型)
	*
	 * @param date
	 * @param hour
	 * @return
	 */
	public static Date addDateMinut(Date date, int hour){   
        if (date == null)   
            return null;   
        Calendar cal = Calendar.getInstance();   
        cal.setTime(date);   
        cal.add(Calendar.HOUR, hour);// 24小时制   
        date = cal.getTime();   
        return date;   
    }
}
