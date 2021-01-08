import java.util.Scanner;

public class  soal2Faris{
	public static void main(String[] args) {
		int sisi1, sisi2, sisi3;

		Scanner inputFaris = new Scanner(System.in);

		System.out.print("Masukkan sisi pertama : ");
		sisi1 = inputFaris.nextInt();
		System.out.print("Masukkan sisi kedua : ");
		sisi2 = inputFaris.nextInt();
		System.out.print("Masukkan sisi ketiga : ");
		sisi3 = inputFaris.nextInt();


		if (sisi1 == sisi2 && sisi2 == sisi1 && sisi1 == sisi3) {
			System.out.println("Segitiga tersebut adalah Segitiga Sama Sisi");
		}else if (sisi1 == sisi2 || sisi2 == sisi3 || sisi1 == sisi3 || sisi2 == sisi3){
			System.out.println("Segitiga tersebut adalah Segitiga Sama Kaki");
		}else{
			System.out.println("Segitiga tersebut adalah Segitiga Sembarang");
		}
	}
}