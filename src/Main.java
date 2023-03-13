import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 900000000;
        float e = 1.5f;
        double f = 2.999;
        System.out.println("Значение переменной " + "a " + "с типом " + "byte " + "равно " + a);
        System.out.println("Значение переменной " + "b " + "с типом " + "short " + "равно " + b);
        System.out.println("Значение переменной " + "c " + "с типом " + "int " + "равно " + c);
        System.out.println("Значение переменной " + "d " + "с типом " + "long " + "равно " + d);
        System.out.println("Значение переменной " + "e " + "с типом " + "float " + "равно " + e);
        System.out.println("Значение переменной " + "f " + "с типом " + "double " + "равно " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short e = 569;
        short f = -159;
        int g = 27897;
        byte h = 67;
        System.out.println(a + " " + b + " " + c + " " + e + " " + f + " "  + g + " " + h);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte peopleLyda = 23;
        byte peopleAnna = 27;
        byte peopleKate = 30;
        short listPaper = 480;
        int allPeople = peopleAnna + peopleKate + peopleLyda;
        int paperOnePeople = listPaper / allPeople;
        System.out.println("На каждого ученика рассчитано " + paperOnePeople + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int bottle = 16;
        int time = 2;
        int time1Bottle = 20;
        int timeDayBottle = 24 * 60;
        int timeThreeDayBottle = timeDayBottle * 3;
        int timeMothBottle = timeDayBottle * 31;
        int capacity = bottle / time;
        int produced1Bottle = time1Bottle * capacity;
        int producedDayBottle = timeDayBottle * capacity;
        int producedThreeDayBottle = timeThreeDayBottle * capacity;
        int producededMothBottle = timeMothBottle * capacity;
        System.out.println("За " + time1Bottle + " минут машина произвела " + produced1Bottle + " штук бутылок");
        System.out.println("За " + timeDayBottle + " минут машина произвела " + producedDayBottle + " штук бутылок");
        System.out.println("За " + timeThreeDayBottle + " минут машина произвела " + producedThreeDayBottle + " штук бутылок");
        System.out.println("За " + timeMothBottle + " минут машина произвела " + producededMothBottle + " штук бутылок");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int paint = 120;
        int classPaintWhite = 2;
        int classPaintBrown = 4;
        int classes = paint / (classPaintBrown + classPaintWhite);
        int paintWhite = classPaintWhite * classes;
        int paintBrown = classPaintBrown * classes;
        System.out.println("На ремонт школы, в которой " + classes + " классов, необходимо " + paintWhite + " банок белой краски и " + paintBrown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int banana = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 2 * 100;
        int eggs= 4 * 70;
        int weightBreakfast = banana + milk + iceCream + eggs;
        float weightBreakfastKg = weightBreakfast / 1000f;
        System.out.println("Вес завтрака " + weightBreakfast + " гр или " + weightBreakfastKg + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int m = 7 * 1000;
        double diet1 = 250;
        double diet2 = 500;
        double dayDiet1 = m / diet1;
        double dayDiet2 = m / diet2;
        double dietAverage = (diet1 + diet2) / 2;
        double dayDietAverage = m / dietAverage;
        System.out.println("Дней для похудения при первой диете: " + dayDiet1);
        System.out.println("Дней для похудения при второй диете: " + dayDiet2);
        System.out.printf(Locale.US, "Среднее количество дней для похудения %.2f%n", dayDietAverage);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int payMary = 67760;
        int payDenis = 83690;
        int payKris = 76230;
        int risePayMary = payMary + (payMary / 100 * 10);
        int risePayDenis = payDenis + (payDenis / 100 * 10);
        int risePayKris = payKris + (payKris / 100 * 10);
        int payMaryYearDifference = risePayMary * 12 - payMary * 12;
        int payDenisYearDifference = risePayDenis * 12 - payDenis * 12;
        int payKrisYearDifference = risePayKris * 12 - payKris * 12;
        System.out.println("Маша теперь получает " + risePayMary + " рублей в месяц и годовой доход вырос на " + payMaryYearDifference + " рублей");
        System.out.println("Денис теперь получает " + risePayDenis + " рублей в месяц и годовой доход вырос на " + payDenisYearDifference + " рублей");
        System.out.println("Кристина теперь получает " + risePayKris + " рублей в месяц и годовой доход вырос на " + payKrisYearDifference + " рублей");
    }

}