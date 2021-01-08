package fungsi1Tugas;
import java.util.Scanner;

public class tugas1Faris {
    static int max3(int bil1, int bil2, int bil3){
        int[] arrayMax = {bil1,bil2,bil3};
        int max = arrayMax[0];
        for (int i =0; i < arrayMax.length; i++){
            if (arrayMax[i] > max){
                max = arrayMax[i];
            }
        }
        System.out.println("Nilai Maximum adalah " + max);
        return max;
    }
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner((System.in));

        System.out.print("Masukkan Bilangan 1 : ");
        int bil1 = inputFaris.nextInt();
        System.out.print("Masukkan Bilangan 2 : ");
        int bil2 = inputFaris.nextInt();
        System.out.print("Masukkan Bilangan 3 : ");
        int bil3 = inputFaris.nextInt();

        max3(bil1,bil2,bil3);
    }
}
