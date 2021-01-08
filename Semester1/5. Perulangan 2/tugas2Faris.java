package Tugas;  
import java.util.Scanner;

public class tugas2Faris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);
        System.out.print("Masukkan banyak N : ");
        int barisKolom = inputFaris.nextInt();

        for (int i = 1; i <= barisKolom ; i++) {
            for (int j = barisKolom; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
