package Array1Perocbaan;
import java.util.Scanner;

public class ArrayInputLoop {
    public static void main(String[] args) {
        Scanner scFaris = new Scanner(System.in);

        int nilaiUAS[] = new int[6];


        for(int i=0; i<nilaiUAS.length; i++){
            System.out.print("Masukan nilai UAS ke-"+i+": ");
            nilaiUAS[i]= scFaris.nextInt();
        }

        for(int i=0; i<nilaiUAS.length; i++){
            if (nilaiUAS[i] > 70){
                System.out.println("Mahasiswa ke-" + i + " lulus");
            }
            else{
                System.out.println("Mahasiswa ke-" + i + " tidak lulus");
            }
        }
    }
}
