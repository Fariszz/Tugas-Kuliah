package Array2Tugas;
import java.util.Scanner;

public class tugas4Faris{
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);
        String namaMHS[][];
        float nilaiMHS[][];

        System.out.print("Masukan jumlah baris = ");
        int baris = inputFaris.nextInt();
        System.out.print("Masukan jumlah kolom = ");
        int kolom = inputFaris.nextInt();

        namaMHS = new String[baris][kolom];
        nilaiMHS = new float[baris][kolom];

        for (int i = 0; i < namaMHS.length; i++){
            for (int j = 0; j < namaMHS[0].length; j++){
                System.out.print("Masukkan Nama Mahasiswa pada  ("+ i + "," + j + ") : ");
                namaMHS[i][j] = inputFaris.next();
            }
            System.out.println();
        }

        System.out.println("=========================");
        System.out.println("Menampilkan Tempat duduk");

        for (int i =0; i < namaMHS.length; i++){
            for (int j = 0; j < namaMHS[0].length;j++){
                System.out.print("(" + i + ", " + j + " )" );
                System.out.print(namaMHS[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("\n========================");
        for(int i =0;i < nilaiMHS.length; i++){
            for (int j = 0; j < nilaiMHS[0].length; j++){
                System.out.print("Msukkan Nilai Mahasiswa pada  ("+ i + "," + j + ") : ");
                nilaiMHS[i][j] = inputFaris.nextFloat();
            }
            System.out.println();
        }

        System.out.println("========================");
        System.out.println("Menampilkan Nilai");
        for (int i =0; i < nilaiMHS.length; i++){
            for (int j = 0; j < nilaiMHS[0].length;j++){
                System.out.print("(" + i + ", " + j + " )" );
                System.out.print(nilaiMHS[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println("================================");
        for (int i=0;i < nilaiMHS.length; i++){
            for (int j = 0; j < nilaiMHS[0].length; j++){
                System.out.print("(" + namaMHS[i][j] + " = " + nilaiMHS[i][j] + ")" + "\t");
            }
        }
        System.out.println("\n==========================");
        float modus = nilaiMHS[0][0];
        System.out.println("Nilai modus pada barisan palingan depan dan nama mahasiswa : ");
        for (int i = 0; i < nilaiMHS.length; i++) {
            if (nilaiMHS[0][1] == modus) {
                System.out.print("(" + 0 + "," + i + ")");
                System.out.print(nilaiMHS[0][1] + " ");
                System.out.print(namaMHS[0][1] + " ");
            }
        }
        System.out.println();

        float minimum = nilaiMHS[0][0];
        int lokasiBaris = 0;
        int lokasiKolom = 0;
        for (int i = 0; i < nilaiMHS.length; i++) {
            for (int j = 0; j < nilaiMHS[i].length; j++) {
                if (minimum > nilaiMHS[i][j]) {
                    minimum = nilaiMHS[i][j];
                    lokasiBaris = i;
                    lokasiKolom = j;
                }
            }
        }
        System.out.println("\n Nilai minimum berada di baris "+ lokasiBaris + " Kolom " + lokasiKolom + ", Nilai Terendah =  " + minimum);

        float maximum = nilaiMHS[0][0];
        int lokasiBaris2 = 0;
        int lokasiKolom2 = 0;
        for (int i = 0; i < nilaiMHS.length; i++) {
            for (int j = 0; j < nilaiMHS[i].length; j++) {
                if (maximum < nilaiMHS[i][j]) {
                    maximum = nilaiMHS[i][j];
                    lokasiBaris2 = i;
                    lokasiKolom2 = j;
                }
            }
        }
        System.out.println("\n Nilai maximum berada di baris "+ lokasiBaris2 + " Kolom " + lokasiKolom2 + ", Nilai Tertinggi =  " + maximum);

    }
}
