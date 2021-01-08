package fungsi2Tugas;
import java.util.Scanner;;

public class tugas4Faris {
    public static void main(String[] args) {
        Scanner inputFaris  = new Scanner(System.in);
        int banyak = 0;
        System.out.print("Masukkan Bulan  ");
        int bulan = inputFaris.nextInt();
        for (int i = 0; i < bulan; i++) {
             banyak = fiboRekursif(i+1);
        }
        System.out.println("Jadi total Pasangan adalah " + banyak);
    }

    public static Integer fiboRekursif(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fiboRekursif(n - 1) + fiboRekursif(n - 2);
    }
}
