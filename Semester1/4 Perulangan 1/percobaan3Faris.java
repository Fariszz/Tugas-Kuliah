import java.util.Scanner;

public class  percobaan3Faris{
	public static void main(String[] args) {
		Scanner inputFaris = new Scanner(System.in);

		int angka, b, i, count;
		double avg, total;

		System.out.println("======PROGRAM LOOP DENGAN CONTINUE============");
		b = 0;
		count = 0;

		for (i = 0;i < 5 ; i++) {
			System.out.print("Masukkan Bilangan : ");
			angka = inputFaris.nextInt();
			if (angka >= 50)continue; 
			b += angka;
			count ++;	
			
		}
		total = (double)b;
		System.out.printf("Jumlah angka kurang dari  50:  %.2f\n", total);
		avg = (double)b/count;
		System.out.printf("Rata-rata angka kurang dari 50 :  %.2f\n", avg);
	}
}