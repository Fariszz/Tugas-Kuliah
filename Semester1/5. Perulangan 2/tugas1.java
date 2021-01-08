import java.util.Scanner;

public class tugas1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			for (int j = 2; j > i ; j--) {
				//System.out.print(" ");
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++){
				//System.out.print("*");
				System.out.print(k);		
			}
			System.out.print("\n");
		}

		System.out.print("");

		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > i ; j--) {
				//System.out.print(" ");
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++){
				//System.out.print("*");
				System.out.print(k);		
			}
			System.out.print("\n");
		}
	}
}