package src.ch060;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static void main(String[] args) {
        Date d = stringToDate("2021-01-01", "yyyy-MM-dd");
        System.out.println(d);

        String s = dateToString(new Date(), "yyyy-MM-dd");
        System.out.println(s);
    }

    public static Date stringToDate(String date, String format){
        SimpleDateFormat f = new SimpleDateFormat(format);
        Date d = new Date();
        try{
            d = f.parse(date);
        }catch (ParseException e){
            throw new RuntimeException();
        }finally {
            return d;
        }
    }

    public static String dateToString(Date date, String format){
        SimpleDateFormat fm = new SimpleDateFormat(format);
        return fm.format(date);
    }

}
