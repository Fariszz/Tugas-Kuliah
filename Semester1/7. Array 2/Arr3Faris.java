package Arrray2Percobaan;
import java.util.Scanner;

public class Arr3Faris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);

        System.out.print("Masukkan baris : ");
        int baris = inputFaris.nextInt();
        System.out.print("Masukkan Kolom :  ");
        int kolom = inputFaris.nextInt();

        int [][] nilai=new int [baris][kolom];

        for (int i=0; i<nilai.length; i++){
            for (int j=0; j < nilai[0].length; j++){
                System.out.print("Masukkan nilai ke-["+i+"]["+j+"] ");
                nilai[i][j]=inputFaris.nextInt();
            }
            System.out.println("------------------------");
        }

        for (int i=0; i<nilai.length; i++){
            for (int j=0; j<nilai[0].length; j++){
                System.out.print(nilai[i][j]+" ");
            }
            System.out.println();
        }
    }
}
