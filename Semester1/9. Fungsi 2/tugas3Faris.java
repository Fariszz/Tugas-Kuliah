package fungsi2Tugas;
import java.util.Scanner;

public class tugas3Faris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);
        System.out.print("Masukkan Angka ");
        int angka = inputFaris.nextInt();

        if (cekPrima(angka, 2)){
            System.out.println(angka + " adalah Bilangan Prima");
        }else{
            System.out.println(angka + " Bukan bilnagan Prima");
        }
    }
    static boolean cekPrima(int x, int y){
        if (x <= 2){
            return (x == 2)?true:false;
        }
        if (x % 2 == 0) {
            return false;
        }
        if (y * y >  x){
            return true;
        }

        return cekPrima(x, y+1);
    }
}
