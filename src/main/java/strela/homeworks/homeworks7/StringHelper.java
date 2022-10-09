package strela.homeworks.homeworks7;

public class StringHelper {

    static String GoodWork(String str, char str1[]) {
        if (str1 != null) {
           // System.out.println("go");
        } else {
            System.out.println("Массив null");
            System.exit(0);
        }
        String string = String.copyValueOf(str1);

        if (str == null) {
            System.out.println("Первая строка пустая");
            System.exit(0);
        } else if (str1 == null){
            System.out.println("Вторая строка пустая");
            System.exit(0);
        }
        String str2 = str.toLowerCase();
        String str3 = string.toUpperCase();

        String str4 = str2.replaceAll("\\s+","");
        String str5 = str3.replaceAll("\\s+","");

        String str6= str4 +  " " + str5 ;

        int length1 =str6.length();

        System.out.println(str6.charAt(length1 / 2));
        return str;


    }
}

