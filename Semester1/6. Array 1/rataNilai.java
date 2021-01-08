package Array1Perocbaan;
import java.util.Scanner;

public class rataNilai {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);
        int panjangLulus=0;
        double rataLulus,rataTidakLulus;

        System.out.print("Masukkan banyak data : ");
        int banyak = inputFaris.nextInt();

        int[] nilaiMHS = new int[banyak];

        int total = 0, totalTidak = 0;
        double rata,rata1,rata2;
        for(int i=0; i<nilaiMHS.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMHS[i]=inputFaris.nextInt();
        }
        for(int i=0; i<nilaiMHS.length; i++){
            if (nilaiMHS[i] > 70) {
                total += nilaiMHS[i];
                panjangLulus++;
            }else{
                totalTidak += nilaiMHS[i];
            }
        }

        rataLulus = total / panjangLulus;
        rataTidakLulus = totalTidak / (nilaiMHS.length - panjangLulus);

        System.out.println("Nilai rata - rata yang lulus = "  + rataLulus);
        System.out.printf("Nilai rata-rata yang tidak lulus =" + rataTidakLulus );
    }
}
