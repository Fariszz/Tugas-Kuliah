package fungsi2Tugas;
import java.util.Scanner;

public class tugas2Faris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int angka = inputFaris.nextInt();

        System.out.println(faktorRekursif(angka));
    }
    static int faktorRekursif(int x){
        if (x == 0 || x == 1){
            return 1;
        }else{
            return x + faktorRekursif(x - 1);
        }
    }
}
