package Array1Tugas;
import java.util.Scanner;

public class tugas5Faris {
    public static void main(String[] args) {
        int total = 0;
        Scanner inputFaris = new Scanner(System.in);
        System.out.print("Masukkan banyak data : ");
        int data = inputFaris.nextInt();
        int[] geometri = new int[data];

        for (int i = 0; i < geometri.length; i++){
            System.out.print("Masukkan Nilai ke " + (i + 1) + " : ");
            geometri[i] = inputFaris.nextInt();
        }
        System.out.println("\nBilangan : ");
        for (int i = 0; i < geometri.length; i++){
            System.out.print( geometri[i] + " ");
        }
        for(int i=0; i<geometri.length; i++){
            total+= geometri[i];
        }
        System.out.println("\nTotal dari nilai Array : " + total);
    }
}
