package Array2Tugas;
import java.util.Scanner;

public class tugas3fFaris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);

        int[][] array2D = new int[3][5];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("Masukkan array ke-[ " + i + " ][ " + j + " ] : ");
                array2D[i][j] = inputFaris.nextInt();
            }
            System.out.println("------------");
        }
        int minimumKolom0 = array2D[0][0];
        int minimumKolom1 = array2D[0][0];
        int minimumKolom2 = array2D[0][0];
        int minimumKolom3 = array2D[0][0];
        int minimumKolom4 = array2D[0][0];

        //sebnayak i pada kolom 0
        for (int i = 0; i < 3; i++){
            if (array2D[i][0] > minimumKolom0){
                minimumKolom0 = array2D[i][0];
            }
            if (array2D[i][1] > minimumKolom0){
                minimumKolom1 = array2D[i][1];
            }
            if (array2D[i][2] > minimumKolom0){
                minimumKolom2 = array2D[i][2];
            }
            if (array2D[i][3] > minimumKolom0){
                minimumKolom3 = array2D[i][3];
            }
            if (array2D[i][4] > minimumKolom0){
                minimumKolom4 = array2D[i][4];
            }
        }


        int minimumBaris0 = array2D[0][0];
        int minimumBaris1 = array2D[0][0];
        int minimumBaris2 = array2D[0][0];
        for (int j = 0; j < 5; j++){
            if (array2D[0][j] > minimumBaris0){
                minimumBaris0 = array2D[0][j];
            }
            if (array2D[1][j] > minimumBaris0){
                minimumBaris1 = array2D[1][j];
            }
            if (array2D[2][j] > minimumBaris0){
                minimumBaris2 = array2D[2][j];
            }
        }
        System.out.println("Nilai terbesar pada kolom ke - 0 = " + minimumKolom0);
        System.out.println("Nilai terbesar pada kolom ke - 1 = " + minimumKolom1);
        System.out.println("Nilai terbesar pada kolom ke - 2 = " + minimumKolom2);
        System.out.println("Nilai terbesar pada kolom ke - 3 = " + minimumKolom3);
        System.out.println("Nilai terbesar pada kolom ke - 3 = " + minimumKolom4);
        System.out.println(" ");
        System.out.println("Nilai terbsesar pada baris ke - 0 = " + minimumBaris0);
        System.out.println("Nilai terbsesar pada baris ke - 1 = " + minimumBaris1);
        System.out.println("Nilai terbsesar pada baris ke - 2 = " + minimumBaris2);

    }
}
