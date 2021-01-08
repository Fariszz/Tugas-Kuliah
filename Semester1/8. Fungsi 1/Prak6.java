package fungsi1;
import java.util.Scanner;

public class Prak6 {
    static int hitungLuas(int pjg, int lb){
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume(int tinggi, int a,int b){
        int volume = hitungLuas(a,b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan Panjang : ");
        p = inputFaris.nextInt();
        System.out.print("Masukkan Lebar : ");
        l = inputFaris.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = inputFaris.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas Persegi panjang adalah " + L);

        vol = hitungVolume(t,p,l);
        System.out.print("Volume Balok adalah " + vol);
    }
}
