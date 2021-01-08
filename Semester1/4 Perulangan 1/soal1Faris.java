import java.util.Scanner;

public class  soal1Faris{
	public static void main(String[] args) {
		Scanner inputFaris = new Scanner(System.in);

		int angka;
		System.out.print("Masukkan Angka : ");
		angka = inputFaris.nextInt();

		for (int i = 1; i< angka ;i++ ) {
			System.out.println(i);
		}
	}
}