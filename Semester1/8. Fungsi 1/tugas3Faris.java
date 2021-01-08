package fungsi1Tugas;
import java.util.Scanner;

public class tugas3Faris {

    static double inputNilai(double value){
        Scanner inputFaris = new Scanner(System.in);
        System.out.print("Masukkan Nilai Mahasiswa ke-"+ (value+1) + " : ");
        double nilai = inputFaris.nextDouble();
        return nilai;
    }
    static double totalNilai(double... hasil){
        double jumlah = 0;
        for (int i = 0; i < hasil.length;i++){
            jumlah += hasil[i];
        }
        double rata = jumlah / hasil.length;
        return rata;
    }
    public static void main(String[] args) {
        double[] nilai = new double[10];
        for (int i = 0; i < nilai.length;i++){
            nilai[i] = inputNilai(i);
        }

        System.out.println("Rata - rata nilai Mahasiswa adalah " + totalNilai(nilai));
    }
}
