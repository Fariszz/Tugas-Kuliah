import java.util.Scanner;

public class soal2Faris{
	public static void main(String[] args){
		int umur;

		Scanner inputFaris = new Scanner(System.in);

		System.out.print("Masukkan Umur Anda : ");
		umur = inputFaris.nextInt();

		if (umur >= 17){
			System.out.println("Anda Boleh Berkendara");
		}
		else{
			System.out.println("Tidak boleh berkendara");
		}
	}
}