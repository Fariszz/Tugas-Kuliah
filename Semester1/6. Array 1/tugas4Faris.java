package Array1Tugas;
import java.util.Scanner;

public class tugas4Faris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);

        System.out.print("Masukkan jumlah Array : ");
        int banyak = inputFaris.nextInt();

        int[] nilaiArray = new int[banyak];

        //  memasukkan array
        for (int i = 0; i < nilaiArray.length; i++){
            System.out.print("Masukkan Array ke - " + i + " : " );
            nilaiArray[i] = inputFaris.nextInt();
        }
        for (int i = 0; i < nilaiArray.length; i++) {
            if (nilaiArray[i] % 2 == 0) {
                System.out.println(" Angka genap : " + nilaiArray[i]);
            }
        }
        for (int i = 0; i < nilaiArray.length; i++){
            if (nilaiArray[i]%2 != 0){
                System.out.println("Angka Ganjil : " + nilaiArray[i]);
            }
        }
    }
}
