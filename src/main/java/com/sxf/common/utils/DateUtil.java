package com.sxf.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	
	public static Date randomDate(Date d1,Date d2) {
		//开始的毫秒数
		long l1 = d1.getTime();
		//结束开始的毫秒数
		long l2 = d2.getTime();
		long l3 = (long) ((Math.random()*(l2-l1 +1))+l1);
		
	
		return new Date(l3);
		
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
//		Calendar c = Calendar.getin
		Date date2 = new Date("2010/01/01");
		
		Date date = DateUtil.randomDate(date2, new Date());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}
}
