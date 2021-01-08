package Array2Tugas;
import java.util.Scanner;

public class tugas2Faris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);

        int lokasiBaris = 0 , lokasiKolom = 0;

        System.out.print("Masukkan baris : ");
        int baris = inputFaris.nextInt();
        System.out.print("Masukkan kolom : ");
        int kolom = inputFaris.nextInt();

        int[][] array2D = new int[baris][kolom];

        for (int i = 0; i <array2D.length; i++){
            for(int j = 0; j  < array2D[0].length;j++){
                System.out.print("Masukkan array ke-[ " + i + " ][ " + j + " ] : ");
                array2D[i][j] = inputFaris.nextInt();
            }
            System.out.println("-----------------");
        }
        System.out.println("Menu");
        System.out.println("1.Nilai MIN");
        System.out.println("2.Nilai  MIN,jumlah, lokasi ");
        System.out.println("3.Kondisi ADA");

        System.out.print("masukkan pilihan : ");
        int pilihan = inputFaris.nextInt();

        switch(pilihan) {
            case 1:
                int minimum = array2D[0][0];
                for (int i = 0; i < array2D.length; i++) {
                    for (int j = 0; j < array2D[0].length; j++) {
                        if (array2D[i][j] < minimum) {
                            minimum = array2D[i][j];
                        }
                    }
                }
                System.out.println("Nilai minimum adalah " + minimum);
                break;  

            case 2:
                int minimal = array2D[0][0];
                for (int i = 0; i < array2D.length; i++) {
                    for (int j = 0; j < array2D[0].length; j++) {
                        if (array2D[i][j] < minimal) {
                            minimum = array2D[i][j];
                        }
                    }
                }
                System.out.println("Nilai minimum adalah " + minimal);
                int jumlah = 0;
                for (int i = 0; i < array2D.length; i++) {
                    for (int j = 0; j < array2D[0].length; j++) {
                        if (array2D[i][j] == minimal) {
                            jumlah++;
                            lokasiBaris = i + 1;
                            lokasiKolom = j + 1;
                            System.out.println("Nilai minimum adalah " + minimal+ " Jumlah  : " + jumlah);
                            System.out.println("Berada di baris " + lokasiBaris + " Kolom " + lokasiKolom);
                        }
                    }
                }
                    break;
            case 3 :
                for (int i = 0; i < array2D.length; i++) {
                    for (int j = 0; j < array2D[0].length; j++) {
                        if (array2D[i][j] == 50) {
                            System.out.println("ADA");
                            return;
                        }
                    }
                    System.out.println("TIDAK ADA");
                    break;
                }
        }
    }
}
