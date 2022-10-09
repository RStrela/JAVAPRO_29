package strela.homeworks.homeworks7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterHelper {
    static String ChekingHumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("((\\+?380)([0-9]{9}))$");
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Ваш номер " + phoneNumber + " правильный");
        } else {
            System.out.println("Ваш номер " + phoneNumber + " неправильный");
            return phoneNumber;
        }
        return phoneNumber;
    }
            static String ChekingEmail(String email) {
                Pattern pattern = Pattern.compile("^((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");
                Matcher matcher = pattern.matcher(email);
                if (matcher.matches()) {
                    System.out.println("Ваш номер " + email + " правильный");
                } else {
                    System.out.println("Ваш номер " + email + " неправильный");
                    return email;
                }
                return email;
            }
     static String ChekingDate(String date) {
             try {
                 Calendar calendar = new GregorianCalendar();
                 SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
                 df.setLenient(false);
                 calendar.setTime(df.parse(date));
                 System.out.println("Правильно " + date);
             }
             catch (Exception e) {
                 System.out.println("Неправильно " + date);
             }
             return  date;
    }
}
