package Tugas;

import java.util.Scanner;
import java.util.Scanner;

public class tugas3Faris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);
        System.out.print("Masukkan banyak N : ");
        int barisKolom = inputFaris.nextInt();

        for (int i =1; i <= barisKolom; i++) {
            for (int j = 1 ; j <= barisKolom ; j++) {
                if (i == 1 || i == barisKolom || j == 1 || j == barisKolom) {
                    System.out.print(barisKolom);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
