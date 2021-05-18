package utils;
import java.util.Calendar;

import static org.apache.commons.lang3.StringUtils.right;

public class TimeUtils {

    private  String year;
    private  String month;
    private  String day;
    private  String hour;
    private  String min;
    private  String sec;
    private  String mill;

    public TimeUtils(){
        year  = right("0"+ Calendar.getInstance().get(Calendar.YEAR),4);
        month = right("0"+ Calendar.getInstance().get(Calendar.MONTH),2);
        day   = right("0"+ Calendar.getInstance().get(Calendar.DAY_OF_MONTH),2);
        hour  = right("0"+ Calendar.getInstance().get(Calendar.HOUR),2);
        min   = right("0"+ Calendar.getInstance().get(Calendar.MINUTE),2);
        sec   = right("0"+ Calendar.getInstance().get(Calendar.SECOND),2);
        mill  = right("0"+ Calendar.getInstance().get(Calendar.MILLISECOND),2);
    }

    public String getUniqueValue(){
        String uniqueValue;
        uniqueValue = year + month + day + hour + min + sec + mill;
        return uniqueValue;
    }

    public String getCurrentYear() {
        return year;
    }

    public String getCurrentMonth() {
        return month;
    }

    public String getCurrentDay() {
        return day;
    }

    public String getCurrentHour() {
        return hour;
    }

    public String getCurrentMinutes() {
        return min;
    }

    public String getCurrentSeconds() {
        return sec;
    }

    public String getCurrentMilliSec() {
        return mill;
    }
}
