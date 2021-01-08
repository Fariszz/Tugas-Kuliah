import java.util.Scanner;

public class  percobaan1FarisFor{
	public static void main(String[] args) {
		int angka, fac, i;
		Scanner inputFaris = new Scanner(System.in);

		System.out.println("======PROGRAM MENGHITUNG NILAI FAKTORIAL=========");

		System.out.print("Masukkan bilangan : ");
		angka = inputFaris.nextInt();
		fac = 1;
		for (i = 1; i <= angka ; i++) {
			fac = fac * i;
		}
		System.out.printf("Nilai faktorial bilangan tersebut adalah  %d\n", fac);
	}
}