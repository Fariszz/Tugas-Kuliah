package Array1Tugas;
import java.util.Scanner;

public class Pengayaan2Faris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");
        int total = inputFaris.nextInt();
        int [] array = new int [total];
        int temp;

        for(int i=0; i<total; i++){
            System.out.print("Array ke "+i+": ");
            array[i]=inputFaris.nextInt();
        }
        System.out.print("Hasil pengurutan: ");

        for (int i = 0; i < total; i++){
            for (int j = total-1; j>i; j--){
                if (array[j] < array[j-1]){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
        for (int j = 0; j < total; j++){
            System.out.print(array[j]);
            System.out.print(" ");
        }
    }
}
