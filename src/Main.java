import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void defineYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

    public static void detectOsAndYear(int os, int phoneYear) {
        int currentYear = LocalDate.now().getYear();
        if (os == 1 && phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android.");
        } else if (os == 1 && phoneYear == currentYear) {
            System.out.println("Установите приложение для Android.");
        } else if (os == 0 && phoneYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS.");
        } else if (os == 0 && phoneYear == currentYear) {
            System.out.println("Установите приложение для IOS.");
        } else {
            System.out.println("Данные ошибочные. Проверьте год выпуска вашего устройства " +
                    "и ОС.");
        }
    }

    public static int getDeliveryTime(int km) {
        System.out.println("Введите расстояние до места доставки.");
        Scanner deliveryDistance = new Scanner(System.in);
        int distance = deliveryDistance.nextInt();
        if (distance <= 20) {
            return 1;
        } else if (distance <= 40) {
            return 2;
        } else if (distance <= 60) {
            return 3;
        } else if (distance <= 100) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("task 1");
        System.out.println("Введите год:");
        Scanner yearNumber = new Scanner(System.in);
        int year = yearNumber.nextInt();
        defineYear(year);
        System.out.println();
        System.out.println("task 2");
        System.out.println("Введите OC: 1 - для Android, 0 - для IOS:");
        Scanner os = new Scanner(System.in);
        int osYear = os.nextInt();
        System.out.println("Введите год выпуска своего устройства:");
        Scanner phoneDate = new Scanner(System.in);
        int phoneYear = phoneDate.nextInt();
        detectOsAndYear(osYear, phoneYear);
        System.out.println();
        System.out.println("task 3");
        int distance = 0;
        int days = getDeliveryTime(distance);
        if (days > 0) {
            System.out.println("Понадобится дней: " + days + ".");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}






