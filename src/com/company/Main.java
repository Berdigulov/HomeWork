package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String end;
        final int NUM = 12;


        String word = "����";
        end = NUM + word;
        System.out.print(end + " ");
        System.out.print(NUM + " ");
        System.out.println(word);


        if (NUM < 0) {
            System.out.println("�� ��������� ������������� �����");
        } else if (NUM > 0) {
            System.out.println("�� ��������� ������������� �����");
        }else{
            System.out.println("�� ��������� ����");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("������� ���� ���:");
        String name = in.nextLine();
        Scanner sc = new Scanner(System.in);
        String phase1 = sc.nextLine();
        System.out.print("������������" + phase1);


}}
