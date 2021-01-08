import java.util.Scanner;

public class percobaan2FarisDo{
	public static void main(String[] args) {
		
		int angka, b;
		Scanner inputFaris = new Scanner(System.in);

		System.out.println("=========PROGRAM LOOP DENGAN BREAK=========");

		b = 0;
		do{
			System.out.print("Masukkan bilangan : ");
			angka = inputFaris.nextInt();

			b += angka;

			if (b > 50) break;
		}while(true);
		System.out.printf("Angka berhenti pada jumlah angka :  %d\n", b);
	}
}