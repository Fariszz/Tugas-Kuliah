import java.util.Scanner;

public class percobaan4Faris{
	public static void main(String[] args){
		double angka1, angka2, hasil1;
		char operator;
		String naruto = "Hi n ata";

		Scanner inputFaris = new Scanner(System.in);

		System.out.print("Masukkan angka pertama :" );
		angka1 = inputFaris.nextDouble();

		System.out.print("Masukkan angka kedua : ");
		angka2 = inputFaris.nextDouble();

		System.out.print("Masukkan Operator ( + - * / ) : ");
		operator = inputFaris.next().charAt(0);

		char huruf1 = naruto.charAt(4);


		System.out.println("Lihaten :  " +  huruf1);



		switch(operator){
			case '+':
				hasil1 = angka1 + angka2;
				System.out.println(angka1 + " + " + angka2 + " = " + hasil1);
				break;
			case '-':
				hasil1 = angka1 - angka2;
				System.out.println(angka1 + " - " + angka2 + " = " + hasil1);
				break;
			case '*':
				hasil1 = angka1 * angka2;
				System.out.println(angka1 + " * " + angka2 + " = " + hasil1);
				break;
			case '/':
				hasil1 = angka1 / angka2;
				System.out.println(angka1 + " / " + angka2 + " = " + hasil1);
				break;

			default:
			System.out.println("\nOperator yang anda 	masukkan salah");
		}
	}
}