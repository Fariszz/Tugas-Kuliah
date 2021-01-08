import java.util.Scanner;

public class percobaan1FarisWhile{
	public static void main(String[] args) {
		int angka, fac, i;
		Scanner inputFaris = new Scanner(System.in);

		System.out.println("======PROGRAM MENGHITUNG NILAI FAKTORIAL=========");

		System.out.print("Masukkan bilangan : ");
		angka = inputFaris.nextInt();

		fac = 1;
		i =1;
		while (i <= angka){
			fac = fac * i;
			i++;
		}
		System.out.printf("Nilai faktorial bilangan tersebut adalah  %d\n", fac);
	}
}