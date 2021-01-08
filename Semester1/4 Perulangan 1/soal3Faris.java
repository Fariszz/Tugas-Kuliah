import java.util.Scanner;

public class soal3Faris{

    public static void main (String[] args){


        // menghitung nilai deret fibonacci ke-n
        int f_n, f_n_1, f_n_2, n, jumlah;

        Scanner inputFaris = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - :");
        n = inputFaris.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;
        jumlah = 1;

        for(int i = 0; i <= n; i++){
                System.out.println("nilai ke - "+ f_n + " + " + f_n_2 + " = " + jumlah);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            jumlah = f_n_2 + f_n;
        }

    }
}
