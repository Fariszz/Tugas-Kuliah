package com.company;

import java.util.Scanner;

public class starFaris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = inputFaris.nextInt();

        for (int i = 1;i < N ; i++) {
            System.out.print("*");
        }
    }
}
