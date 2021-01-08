import java.util.Scanner;

public class soal2Faris{
	public static void main(String[] args) {
		Scanner inputFaris = new Scanner(System.in);

		int bilangan, totalNilai=0, j, genap=0, jumlah=0,  bil=0;
		float avg=0;

		System.out.println("Menghitung Jumlah bilangan Genap dari N bilangan");

		System.out.println("-------------------------------------------------");

		System.out.print("Masukkan range bilangan : ");
		bilangan = inputFaris.nextInt();	


		for (j = 1 ;j <= bilangan ; j++) {	

			if (j % 2 == 0) {
				jumlah = j/2;
				totalNilai += j;
				avg = totalNilai/jumlah;
				bil += 1;
				System.out.println("Bilangan Genap ke-" + bil + " adalah " + j);	
			}
			
		
		}
		System.out.println("Banyaknya bilangan genap dari 1 sampai " + bilangan + " adalah " + jumlah);
		System.out.print("Jumlah bilangan genap dari 1 sampai " + bilangan + " = " + totalNilai);
		System.out.print("\nRata-rata bilangan genap dari 1 sampai " + bilangan + " = " + avg);

	}
}