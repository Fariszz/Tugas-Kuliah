package com.company;

import java.util.Scanner;
import java.util.Random;
public class quizFaris {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner inputFaris = new Scanner(System.in);
        char menu = 'y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("\nTebak angka (1-10): ");
                int answer = inputFaris.nextInt();
                inputFaris.nextLine();
                success = (answer == number);
                if (answer > number) {
                    System.out.print("Input anda lebih besar dari pada jawaban");
                }else{
                    System.out.print("Input anda lebih kecil dari pada jawaban");
                }
            }while(!success);
            System.out.print("\nApakah Anda ingin mengulang permainan(Y/y)?");
            menu = inputFaris   .nextLine().charAt(0);
        }while(menu=='y' || menu=='Y');
    }
}
