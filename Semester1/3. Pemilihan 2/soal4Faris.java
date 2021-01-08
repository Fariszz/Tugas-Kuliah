import java.util.Scanner;

public class  soal4Faris{
	public static void main(String[] args) {
		int umur;
		double pendapatan, tanggungan, biayaHidup;
		String kondisi, sekolah;
	
		Scanner inputFaris = new Scanner(System.in);

		System.out.print("Masukkan umur anda : ");
		umur = inputFaris.nextInt();

		if (umur >= 18) {
			System.out.println("Masukkan Status (Bekerja / menganggur): ");
			kondisi = inputFaris.next();

			if (kondisi.equalsIgnoreCase("bekerja")) {
				System.out.print("Masukkan Pendapatan : ");
				pendapatan = inputFaris.nextDouble();
				System.out.print("Masukkan Tanggungan : ");
				tanggungan = inputFaris.nextDouble();

				biayaHidup = pendapatan / tanggungan;

				if (biayaHidup > 300000) {
					System.out.print("Bukan Penduduk Miskin");
				}else {
					System.out.print("Penduduk Miskin");
				}
			}else{
				System.out.println("Penduduk Miskin");
			}
		}else {
			System.out.print("Masih melanjutkan pendidikan (iya/tidak) : ");
			sekolah = inputFaris.next();
			if (sekolah.equalsIgnoreCase("iya")) {
				System.out.println("Bukan penduduk miskin");
			}else{
				System.out.println("Penduduk miskin");
			}
		}

	}
}