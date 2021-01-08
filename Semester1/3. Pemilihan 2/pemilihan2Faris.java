import java.util.Scanner;

public class pemilihan2Faris{
	public static void main(String[] args) {
		int nilai;

		Scanner scFaris = new Scanner(System.in);

		System.out.print("Masukkan nilai ujian : ");
		nilai = scFaris.nextInt();

		if (nilai >= 0 || nilai <= 100) {
			if (nilai >= 90 && nilai <= 100) {
				System.out.println("Nilai A, EXCELLENT!");
			}else if (nilai >= 80 && nilai <= 89) {
				System.out.println("Nilai B, pertahanakan prestasi Anda!");
			}else if (nilai >= 60 && nilai <= 79) {
				System.out.println("Nilai C, tingkatkan prestasi Anda");
			}else if (nilai >= 50 && nilai <= 59) {
				System.out.println("Nilai D, tingkatkan belajar Anda");
			}
			else{
				System.out.println("Nilai E, Anda tidak lulus");
			}
		}else{
			System.out.println("Nilai yang Anda masukkan tidak valid");
		}
		/*
		if(nilai < 0){
			System.out.print("Nilai yang Anda masukkan kurang dari 0");
		}else if (nilai > 100{
			System.out.println("Nilai yang Anda masukkan lebih dari 100");
		}*/
	}
}