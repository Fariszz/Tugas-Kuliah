package fungsi2;
import java.util.Scanner;

public class percobaan3Faris {
    static double hitungBunga(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return 1.11 * hitungBunga(saldo, tahun - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scFaris = new Scanner(System.in);
        System.out.print("Jumlah saldo awal: ");
        double saldoAwal = scFaris.nextDouble();
        System.out.print("Lamanya menabung (tahun): ");
        int tahun  = scFaris.nextInt();
        System.out.print("Jumlah uang setelah " + tahun + " tahun: ");
        System.out.println(hitungBunga(saldoAwal, tahun));
    }
}
