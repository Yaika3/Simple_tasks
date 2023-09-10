import java.util.Scanner;

public class Main {
    public static void main(String[] args){
// Простая работа через консоль : Вопрос - ответ
    Scanner in = new Scanner(System.in);
    System.out.print("Если вы пользуетесь Android нажмите 1, Если вы пользуетесь OS нажмите 0 ");
    int client = in.nextInt();

    int clientOS = 0;
    int clientAndroid = 1;
    if (client == 0){
        System.out.println("Установите версию приложения для iOS по ссылке");}
    if (client == 1){
        System.out.println("Установите версию приложения для Android по ссылке");}
        in = new Scanner(System.in);
    System.out.print("Год выпуска ващего телефона? ");
    int Version = in.nextInt();
    if (Version < 2022 && Version >= 2015) ; {
            System.out.println("приложение будет работать корректно.");
            if (Version < 2015) {
                System.out.println("Но установите облегченную версию приложения по ссылке");}}

//Работа с запросом и сравнением мобильного номера
        String phone = "800+555-35 35";
        phone = phone.replace ("-" , "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");

        if (phone.length() == 10) {
            phone = "+7" + phone;
        }else if (phone.length() > 11){
            throw new RuntimeException("Телефон слишком длинный");
        }else if (phone.length()< 10){
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '8') {
            throw new RuntimeException("среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "+78005553535";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }

        //Работа с ФИО
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника "+fullName);
        //
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //
        String name3 = "Иванов Семён Семёнович";
        name3 = name3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника " + name3);

    }

    //Задачка про високосный год
    int year = 2020;
        if  ( year % 4==0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println("год является високосным");}

        else System.out.println("год не является високосным");


        //Простая работа указанием дистанции
        int deliveryDistance = 95;
        if (deliveryDistance >=20 && deliveryDistance < 60){
            System.out.println("Доставка займет 2 дня");}
        if (deliveryDistance >60 && deliveryDistance < 100){
            System.out.println("Доставка займет 3 дня");}
        if (deliveryDistance > 100){
            System.out.println("Доставка невозможна");}
        //Простая работа со switch
        int monthNumber = 12;
        switch (monthNumber){
            case 1:System.out.println("принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("принадлежит к сезону зима");
                break;
            case 3:System.out.println("принадлежит к сезону зима");
                break;
            case 4:System.out.println("принадлежит к сезону весна");
                break;
            case 5:System.out.println("принадлежит к сезону весна");
                break;
            case 6:System.out.println("принадлежит к сезону весна");
                break;
            case 7:System.out.println("принадлежит к сезону лето");
                break;
            case 8:System.out.println("принадлежит к сезону лето");
                break;
            case 9:System.out.println("принадлежит к сезону лето");
                break;
            case 10:System.out.println("принадлежит к сезону осень");
                break;
            case 11:System.out.println("принадлежит к сезону осень");
                break;
            case 12:System.out.println("принадлежит к сезону осень");
                break;
            case 13:
                System.out.println("Error");
                break;
        }


        String phone = "800+555-35 35";
        phone = phone.replace ("-" , "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");

        if (phone.length() == 10) {
            phone = "+7" + phone;
        }else if (phone.length() > 11){
            throw new RuntimeException("Телефон слишком длинный");
        }else if (phone.length()< 10){
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '8') {
            throw new RuntimeException("среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "+78005553535";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }

        //task 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника "+fullName);
        //task 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //task 3
        String name3 = "Иванов Семён Семёнович";
        name3 = name3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника " + name3);

    }






}}