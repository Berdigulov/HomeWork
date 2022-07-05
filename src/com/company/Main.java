package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String end;
        final int NUM = 12;


        String word = "Июль";
        end = NUM + word;
        System.out.print(end + " ");
        System.out.print(NUM + " ");
        System.out.println(word);


        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        }else{
            System.out.println("Вы сохранили ноль");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = in.nextLine();
        Scanner sc = new Scanner(System.in);
        String phase1 = sc.nextLine();
        System.out.print("Приветствуем" + phase1);


}}
