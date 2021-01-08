import java.util.Scanner;

public class percobaan1Faris{
	public static void main(String[] args){
		
		int bil;

		Scanner inputFaris = new Scanner(System.in);

		System.out.print("Masukkan Sebuah Bilangan : ");
		bil = inputFaris.nextInt();

		/* String output = (bil %2 == 0)?"Bilangan Genap":" Bilangan Ganjil";
		System.out.println(output); */

		 if(bil % 2  == 0 ){
			System.out.println(bil + " adalah bialngan Genap");
		}
		else{
			System.out.println(bil + " adalah bilangan Ganjil"); 
		} 
	}
}
