import java.util.Scanner;

public class percobaan2Faris{
	public static void main(String[] args) {
		int nilai1, nilai2, hasil;

		Scanner inputFaris = new Scanner(System.in);
		System.out.print("Masukkan Bilangan pertama : ");
		nilai1 = inputFaris	.nextInt();

		System.out.print("Masukkan Bilangan kedua : ");
		nilai2 = inputFaris	.nextInt();

		hasil = (nilai1 + nilai2) / 2;

		if(hasil > 100){
			hasil -= 5;
		}
		else{
			System.out.print("Hasil Nilai Akhir adalah " + hasil);
		}

		
	}
}