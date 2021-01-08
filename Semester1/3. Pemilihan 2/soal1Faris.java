import java.util.Scanner;

public class soal1Faris{
	public static void main(String[] args){
		double angka1, angka2, hasil1;
		char operator, acu;

		Scanner inputFaris = new Scanner(System.in);

		System.out.print("Masukkan bilangan pertama :" );
		angka1 = inputFaris.nextDouble();

		System.out.print("Masukkan Operator ( + - * / ) : ");
		operator = inputFaris.next().charAt(0);

		System.out.print("Masukkan bilangan kedua : ");
		angka2 = inputFaris.nextDouble();

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
			System.out.println("\nOperator yang anda masukkan salah");
		}
	}
}