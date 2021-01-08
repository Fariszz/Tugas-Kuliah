package fungsi1Tugas;
import java.util.Scanner;

public class tugas4Faris {
    static int inputNilai(int value){
        Scanner inputFaris = new Scanner(System.in);
        System.out.print("Masukkan Nilai Mahasiswa ke-"+ (value+1) + " : ");
        int nilai = inputFaris.nextInt();
        return nilai;
    }
    static int totalNilai(int... hasil){
        int jumlah = 0;
        for (int i = 0; i < hasil.length;i++){
            jumlah += hasil[i];
        }
        int rata = jumlah / hasil.length;
        return rata;
    }
    public static int nilaiMax(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-1];
    }
    public static int nilaiMin(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }
    public static void main(String args[]){
        int[] nilai = new int[10];
        for (int i = 0; i < nilai.length;i++){
            nilai[i] = inputNilai(i);
        }
        System.out.println("rata-rata Nilai mahasiswa adalah " + totalNilai(nilai));
        System.out.println("Nilai Tertinggi adalah : "+ nilaiMax(nilai,nilai.length));
        System.out.println("Nilai Terendah adalah : "+ nilaiMin(nilai,nilai.length));
    }
}