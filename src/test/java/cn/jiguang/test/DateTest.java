package cn.jiguang.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTest {
    

    @Test
    public void test01() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String dateStr = "20180131";
        Date date = dateFormat.parse(dateStr);
        System.out.println(date);
        System.out.println("时间Long型=" + date.getTime());
    }
    
    @Test
    public void testDateUtils() throws ParseException{
        String dateStr = "20180131";
        Date date = DateUtil.format(dateStr,"yyyyMMdd");
        Long endTime = date.getTime();
        System.out.println(endTime);
        
        StringBuffer strBuffer = new StringBuffer(dateStr);
        strBuffer.setCharAt(6, '0');
        strBuffer.setCharAt(7, '1');
        String string = strBuffer.toString();
        Date date2 = DateUtil.format(string,"yyyyMMdd");
        long startTime = date2.getTime();
        System.out.println(startTime);
        
        String format = DateUtil.format(date, "yyyyMMdd");
        System.out.println(format);
      
    }
    
    

}
