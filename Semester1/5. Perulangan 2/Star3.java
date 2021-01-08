import java.util.Scanner;

public class  star3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan Nilai N : ");
		int N = input.nextInt();

		for (int iOuter = 1; iOuter <= N ; iOuter++) {
			for (int i = 1; i <= N ; i++) {
				System.out.print("*");

				if (i == iOuter) {
					break;
				}
			}
			System.out.println();
		}

	}
}