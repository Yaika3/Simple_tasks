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



        //Задачка про високосный год
    int year = 2020;
        if  ( year % 4==0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println("год является високосным");}

        else System.out.println("год не является високосным");


        //Простая работа указанием дистанции через switch
        int deliveryDistance = 95;
        if (deliveryDistance >=20 && deliveryDistance < 60){
            System.out.println("Доставка займет 2 дня");}
        if (deliveryDistance >60 && deliveryDistance < 100){
            System.out.println("Доставка займет 3 дня");}
        if (deliveryDistance > 100){
            System.out.println("Доставка невозможна");}
        //task 4
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





    }}