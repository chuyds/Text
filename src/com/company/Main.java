package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] a;              //先声明
        a = new int [10];      //再定义
//        int b[] = new int [10];   //声明的同时定义
//        for (int i = 0; i < 10; i ++ ) {
//            a[i] = i + 1;
//        }
//        for (int i = 0; i  < 10; i ++ ) {
//            System.out.println(a[i]);
//        }
//        int num = 0;
//        for (int e : a) {
//            System.out.print("a[" + num ++ + "]" + " = " + e + "     " );
//        }
//        System.out.println("hhhhh");
//        System.out.println(a.length + b.length + "lengh");
//        System.out.println("lengh：" + a.length + b.length);
//        System.out.println("lengh2："+ b.length);

       /* int [][] c = new int [8][8];
        for(int i = 0; i < 8; i ++ ) {
            for (int j = 0; j <= i; j ++ ) {
                if (j == 0)  c[i][j] = 1;
                else  c[i][j] = c[i - 1][j] + c[i - 1][j - 1];
            }
        }
        for (int i = 0; i < 8; i ++ ) {
            for (int j = 0; j <= i; j ++ ) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }*/

        Person p1 = new Person();
        Person p2 = new Person(12, 15);
        Person p3 = new Person(12, 15, "于得水");
        p1.printString();
        p2.printString();
        p3.printString();

    }
}
