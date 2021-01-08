package fungsi1Tugas;
import java.util.Scanner;

public class tugas2Faris {
    static double luas(double panjang){
        double luasLingkaran = (panjang * panjang) * 3.14;
        return luasLingkaran;
    }
    static double keliling(double panjang){
        double kelilingLingkaran = 2 * 3.14 * panjang;
        return kelilingLingkaran;
    }
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran : ");
        double jari = inputFaris.nextInt();
        luas(jari);
        keliling(jari);

        System.out.println("Luas Lingkaran adalah " + luas(jari));
        System.out.println("Keliling Lingkaran adalah " + keliling(jari));
    }
}
