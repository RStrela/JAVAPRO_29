package strela.homeworks.homeworks1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //  2.Примитивы

        byte age = 27;
        short year = 2022;
        long phoneNumber = 382637015757l;
        float price = 3.99f;
        char classLetter = 'A';
        boolean m = true;
        String name = "Andrey";
        String surname = new String("Ocipov");
        int x = 10, y = 50, z = 5;
        double q = 15.5, w = 20.7, j = 5.7;
        // 3.Арифметицеские операции
        System.out.println("3.Арифметицеские операции");
        int scrip = x + y;
        int subtraction = x - z;
        int multiplication = z * z;
        int division = y / x;
        int remainder = x % y;

        double scrip1 = q + j;
        double subtraction1 = w - q;
        double multiplication1 = j * w;
        double division1 = w / q;
        double remainder1 = w % j;
        // Вывод
        System.out.println("Интовый = " + scrip + ", " + subtraction + ", " + multiplication + ", " + division + ", " + remainder);
        System.out.println("Дабл = " + scrip1 + ", " + subtraction1 + ", " + multiplication1 + ", " + division1 + ", " + remainder1);
        // 4. Арифметическими операциями с присвоением
        System.out.println("4.Арифметическими операциями с присвоением");
        int a = 5;
        int b = 2;
        int c = 5;
        int d = 10;
        int e = 15;
        int f = 50;
        int g = 25;
        a += 3;
        b *= 2;
        c += a * b;
        d /= 5;
        z += e + a / d;
        x /= 1;
        y %= x + 2;
        f += x / z + b;
        g %= d * c / a;
        w %= j + z;
        System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + z + ", " + x + ", " + y + ", " + f + ", " + g + ", " + w);
        // 5. Логические операторы
        System.out.println("5.Логические операторы");
        int a1 = 6;
        int b1 = 3;
        int c1 = 4;
        boolean t1 = a1 > b1;
        boolean t2 = c1 == a1;
        boolean t3 = a1 < b1;
        boolean t4 = (a1 < b1) && (a1 > c1);
        boolean t5 = (a > b) || (a > c);
        System.out.println(t1 + ", " + t2 + ", " + t3 + ", " + t4 + ", " + t5);
        // 6. Создать переменуую используя инкремент и декремент
        System.out.println("6.Создать переменуую используя инкремент и декремент");
        int x1 = 1;
        System.out.println(x1);
        x1--;
        System.out.println(x1);
        x1++;
        System.out.println(x1);
        System.out.println(x1);
        System.out.println(x1);
        x1++;
        System.out.println(x1);
        x1--;
        System.out.println(x1);
        System.out.println(x1);
        // 7. Создать одномерный массив любого размера, Записать в него 10 примитивов
        System.out.println("7.Создать одномерный массив любого размера, Записать в него 10 примитивов");
        int days[] = new int[10];
        days[0] = 356;
        days[1] = 323;
        days[2] = 1235;
        days[3] = 424;
        days[4] = 8643;
        days[5] = 4377;
        days[6] = 34236;
        days[7] = 321356;
        days[8] = 7895;
        days[9] = 4679;

        System.out.println(Arrays.toString(days));

    }
}

