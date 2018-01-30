package cn.jiguang.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/**
 * 正则表达式测验<br>
 * Created by zengxc on 2018年1月29日.
 */
public class RegularExpressions {
    
 // 时间格式正则校验, yyyyMMdd
    private Pattern datePattern = Pattern.compile("(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})"
                                            + "(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))"
                                            + "|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])"
                                            + "|((0[48]|[2468][048]|[3579][26])00))-02-29)");

    
    @Test
    public void dateCompareTo() {
        
       String dateStr =  "(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})"
                        + "(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))"
                        + "|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])"
                        + "|((0[48]|[2468][048]|[3579][26])00))-02-29)";
       
       //手机号格式（正则表达式）
       Pattern datePattern=Pattern.compile(dateStr);
       Boolean isTure = datePattern.matcher("20180131").matches();
       
       System.out.println(isTure);
       
       String date = "20180128";
       String day = date.substring(6, 8);
       if (Integer.parseInt(day) > 31 || Integer.parseInt(day) < 28) {
           System.out.println("错了");
       }
    }
    
    @Test
    public void strTest(){
        List<String> dtList = new ArrayList<String>();
        dtList.add("20180102");
        dtList.add("20180131");
        dtList.add("20180222");
        dtList.add("20180330");
        String day= null;
        for (String dt : dtList) {
            if (!datePattern.matcher(dt).matches()) {
            }
             day = dt.substring(6, 8);
            System.out.println(day);
            // 日时间须为月尾最后一天, 28、29、30、31之一
            if (Integer.parseInt(day) > 31 || Integer.parseInt(day) < 28) {
            }
        }
        
    }
    
    @Test
    public void testCalendar(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        
        Calendar calendar = Calendar.getInstance();
        String format = dateFormat.format(calendar.getTime());
        System.out.println(format);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MONTH, -1);
        long gte = calendar.getTimeInMillis();
        System.out.println(gte);
        
    }
    
    @Test
    public void testCalendar02(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        
        //获取前月的第一天
        Calendar   cal_1=Calendar.getInstance();//获取当前日期 
        String format = dateFormat.format(cal_1.getTime());
        System.out.println("------当前日期------" + format);
        
        cal_1.add(Calendar.MONTH, -1);
        String format2 = dateFormat.format(cal_1.getTime());
        System.out.println("------改变日期------" + format);
        
        cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
        String firstDay = dateFormat.format(cal_1.getTime());
        System.out.println("-----1------firstDay:"+firstDay);
        //获取前月的最后一天
        Calendar cale = Calendar.getInstance();   
        cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天 
        String lastDay = dateFormat.format(cale.getTime());
        System.out.println("-----2------lastDay:"+lastDay);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
