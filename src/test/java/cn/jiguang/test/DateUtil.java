package cn.jiguang.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by QingyuanZhang on 1/18/16.
 */
public class DateUtil {


    /**
     * default format yyyy-MM-dd
     **/
    public static Date format(String dateStr) throws ParseException {
        return format(dateStr, "yyyy-MM-dd");
    }

    public static Date format(String dateStr, String format) throws ParseException {
        DateFormat fmt = new SimpleDateFormat(format);
        return fmt.parse(dateStr);
    }

    public static String format(Date date, String format) {
        DateFormat fmt = new SimpleDateFormat(format);
        return fmt.format(date);
    }

    public static Date getMonthAgoDate(int num) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, num);
        return calendar.getTime();
    }

}
