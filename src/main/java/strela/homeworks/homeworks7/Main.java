package strela.homeworks.homeworks7;

import static strela.homeworks.homeworks7.StringHelper.GoodWork;
import static strela.homeworks.homeworks7.RegisterHelper.ChekingHumber;
import static strela.homeworks.homeworks7.RegisterHelper.ChekingEmail;
import static strela.homeworks.homeworks7.RegisterHelper.ChekingDate;

public class Main {

    public static  void main(String[] args) {
        GoodWork("ROMA             STRELA", new char[]{'a', 'b', 'c', 'd'});
        ChekingHumber("+380637015757");
        ChekingEmail("qwerty....@gmail.com");
        ChekingDate("24.12.1996");
    }
}
