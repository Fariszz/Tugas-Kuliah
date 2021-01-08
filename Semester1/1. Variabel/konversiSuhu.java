import  java.util.Scanner;

public class konversiSuhu{
	public static void main(String[] args){
		float suhu, celcius, reaumur, fahrenheit, kelvin;

		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan suhu dalam bentuk Celcius : ");
		celcius = input.nextFloat();

		reaumur = celcius * 4 	/ 5;	

		fahrenheit = (celcius * 9 /  5) + 32;

		kelvin = celcius + 273;

		System.out.printf("Jadi hasil dari konvesi suhu %.2f Celcius adalah : ", celcius);
		System.out.printf("\nReamur : %.2f", reaumur);
		System.out.printf("\nReamur : %.2f", fahrenheit);
		System.out.printf("\nReamur : %.2f", kelvin);
	}
}