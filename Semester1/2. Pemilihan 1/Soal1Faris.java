import java.util.Scanner;

public class soal1Faris{
	public static void main(String[] args){

		Scanner inputFaris = new Scanner(System.in);

		System.out.print("Masukkan angka pertama : ");
		int a = inputFaris.nextInt();

		System.out.print("Masukkan angka kedua : ");
		int b = inputFaris.nextInt();

		if(a > b){
			System.out.println(a + " adalah huruf terbesar ");
		}
		else{
			System.out.println(b + " adalah huruf terbesar");
		}
	}
}