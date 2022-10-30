import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//task 1
    Scanner in = new Scanner(System.in);
    System.out.print("Если вы пользуетесь Android нажмите 1, Если вы пользуетесь OS нажмите 0 ");
    int client = in.nextInt();

    int clientOS = 0;
    int clientAndroid = 1;
    if (client == 0){
        System.out.println("Установите версию приложения для iOS по ссылке");}
    if (client == 1){
        System.out.println("Установите версию приложения для Android по ссылке");}
// task 2
        in = new Scanner(System.in);
    System.out.print("Год выпуска ващего телефона? ");
    int Version = in.nextInt();
    if (Version < 2022 && Version >= 2015) ; {
            System.out.println("приложение будет работать корректно.");
            if (Version < 2015) {
                System.out.println("Но установите облегченную версию приложения по ссылке");}}



        //task 3 Тут не много не понял с формулой,но с инетом вроде разобрался.
    int year = 2020;
        if  ( year % 4==0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println("год является високосным");}

        else System.out.println("год не является високосным");


        //task 3  не понимаю как решить с прибавлением км и временем суток.
        int deliveryDistance = 95;
        int day = 20;
        if (day >=20 && day < 60){
            System.out.println("Доставка займет 2 дня");}
        if (day >60 && day < 100){
            System.out.println("Доставка займет 3 дня");}


        //task 4



    }}