public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

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

    }
}