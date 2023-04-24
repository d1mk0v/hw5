public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("Выберете операционную систему");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviesYear = 2013;
        int clientOS = 0;

        if (clientDeviesYear < 2015){
            if (clientOS == 0)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else if (clientOS == 1)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviesYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else
                System.out.println("Выберете операционную систему");
    }
    public static void task3(){
        System.out.println("Задача 3");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println(year + " год яаляется високосным");
        } else
            System.out.println(year + " год не является високосным");
    }

    public static void task4(){
        System.out.println("Задача 4");

        int deliveryDistance = 101;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else
            System.out.println("Доставки нет");
    }

    public static void task5(){
        System.out.println("Задача 5");

        int monthNumber = -13;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + " месяц (он же январь) принадлежит к сезону зима");
                break;
            case 2:
                System.out.println(monthNumber + " месяц (он же февраль) принадлежит к сезону зима");
                break;
            case 3:
                System.out.println(monthNumber + " месяц (он же март) принадлежит к сезону весна");
                break;
            case 4:
                System.out.println(monthNumber + " месяц (он же апрель) принадлежит к сезону весна");
                break;
            case 5:
                System.out.println(monthNumber + " месяц (он же май) принадлежит к сезону весна");
                break;
            case 6:
                System.out.println(monthNumber + " месяц (он же июнь) принадлежит к сезону лето");
                break;
            case 7:
                System.out.println(monthNumber + " месяц (он же июль) принадлежит к сезону лето");
                break;
            case 8:
                System.out.println(monthNumber + " месяц (он же август) принадлежит к сезону лето");
                break;
            case 9:
                System.out.println(monthNumber + " месяц (он же сентябрь) принадлежит к сезону осень");
                break;
            case 10:
                System.out.println(monthNumber + " месяц (он же октябрь) принадлежит к сезону осень");
                break;
            case 11:
                System.out.println(monthNumber + " месяц (он же ноябрь) принадлежит к сезону осень");
                break;
            case 12:
                System.out.println(monthNumber + " месяц (он же декабрь) принадлежит к сезону зима");
                break;
            default:
                System.out.println("Введите корректный номер месяца");
        }
    }
}