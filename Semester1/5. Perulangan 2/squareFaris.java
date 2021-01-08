package com.company;

import java.util.Scanner;
public class squareFaris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = inputFaris.nextInt();

        for (int iOuter = 0;iOuter <= N ; iOuter++) {
            for (int i = 1; i <= N ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
