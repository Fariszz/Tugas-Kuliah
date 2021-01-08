package Array1Tugas;
import java.util.Scanner;

public class pengayaan1Faris {
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");
        int banyak = inputFaris.nextInt();
        int hasil = 0;
        int [] array = new int [banyak];

        for(int  i=0; i<banyak; i++){
            System.out.print("Array ke "+i+": ");
            array[i]= inputFaris.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        int key = inputFaris.nextInt();
        for (int i=0; i < array.length; i++){
            if (key == array [i]){
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada di posisi index ke : " + hasil);
    }
}
