import java.util.Scanner;

public class percobaan3Faris{
	public static void main(String[] args){
		int umur;

		System.out.print("Masukkan umur anda : ");
		
		Scanner inputFaris = new Scanner(System.in);

		umur = inputFaris.nextInt();

		if(umur > 60){
			System.out.println("Lansia");
		}
		else if(umur > 45){
			System.out.println("Tua");
		}
		else if(umur  > 17){
			System.out.println("Dewasa");
		}
		else if(umur > 5){
			System.out.println("Anak-anak");
		}
		else if(umur == 0){

			System.out.println("Maaf umur yang anda masukkan salah");
		}
		else{
			System.out.println("Balita");	
		}
	}
}