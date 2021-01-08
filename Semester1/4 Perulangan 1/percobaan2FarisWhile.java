import java.util.Scanner;

public class percobaan2FarisWhile{
	public static void main(String[] args) {
		int angka, b;
		Scanner inputFaris = new Scanner(System.in);

		System.out.println("=========PROGRAM LOOP DENGAN BREAK=========");

		b = 0;
		while (true){
			System.out.print("Masukkan bilangan : ");
			angka = inputFaris.nextInt();

			b += angka;

			if (b > 50) break;
		}
		System.out.printf("Angka berhenti pada jumlah angka :  %d\n", b);
	}
}