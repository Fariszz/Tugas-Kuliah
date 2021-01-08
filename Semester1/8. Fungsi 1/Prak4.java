package fungsi1;
import java.util.Scanner;

public class Prak4 {
    static int Kali(int C, int D){
        int H;
        H = (C + 10) % (D + 19);
        return H;
    }
    static  int Kurang(int A, int B){
        int X;
        A = A + 7;
        B = B + 4;
        X = Kali(A, B);
        return X;
    }
    static void pengecekan(int nilai1, int nilai2){
        if (nilai1 < 0 || nilai2 < 0){
            System.out.println("Minimal Input angka adalah 0");
        }
    }
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);
        int nilai1,nilai2;

        System.out.print("Masukkan nilai 1 : ");
        nilai1 = inputFaris.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nilai2 = inputFaris.nextInt();

        pengecekan(nilai1,nilai2);
        int hasil = Kurang(nilai1,nilai2);
        System.out.println("Hasil akhir adalah " + hasil);
    }
}
