package Array1Tugas;
import java.util.Scanner;

public class tugas1Faris {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.print("Masukkan Bulan ke- " );
        int angka = input.nextInt();

        System.out.println(bulan[angka - 1]);
    }
}
