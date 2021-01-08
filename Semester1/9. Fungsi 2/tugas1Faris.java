package fungsi2Tugas;
import java.util.Scanner;

public class tugas1Faris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = inputFaris.nextInt();

        System.out.println("menampilkan Angka dengan fungsi iteratif");
        tampilkan(angka);

        System.out.println("\nMenampilkan Angka dengan funsgi rekursif ");
        tampilkanRekursif(angka);

    }
    static  int tampilkan(int x){
        for (int i = x; i >= 0; i--){
            System.out.print(i + " ");
        }
        return x;
    }
    static int tampilkanRekursif(int y){
        if (y == 0){
            System.out.print(y + " ");
            return 0;
        }else{

            System.out.print(y + " ");
            return tampilkanRekursif(y-1);
        }
    }
}
