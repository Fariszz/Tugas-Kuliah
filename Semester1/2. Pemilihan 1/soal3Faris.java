import java.util.Scanner;

public class soal3Faris{
	public static void main(String[] args){
		double nilaiUas, nilaiUts, nilaiKuis, nilaiTugas;
		double hasilUas, hasilUts, hasilKuis, hasilTugas, total;

		Scanner inputFaris = new Scanner(System.in);

		System.out.print("Masukkan Nilai UAS : ");
		nilaiUas = inputFaris.nextFloat();

		System.out.print("Masukkan nilai UTS : ");
		nilaiUts = inputFaris.nextFloat();

		System.out.print("Masukkan nilai Kuis : ");
		nilaiKuis = inputFaris.nextFloat();

		System.out.print("Masukkan nilai Tugas : ");
		nilaiTugas = inputFaris.nextFloat();

		hasilUas = nilaiUas * 0.4;
		hasilUts = nilaiUts * 0.3;
		hasilKuis = nilaiKuis * 0.2;
		nilaiTugas = nilaiTugas * 0.1;	

		total = hasilUas + hasilUts + hasilKuis + nilaiTugas;

		if (total < 65){
			System.out.println("rata rata anada adalah " + total);
			System.out.println("Anda harus melakukan Remidi ");
		}	
		else{
			System.out.println("rata rata anada adalah " + total);
			System.out.println("Anda tidak perlu mengikuti remidi");
		}
	}
}