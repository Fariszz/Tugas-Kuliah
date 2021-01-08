import java.util.Scanner;

public class soal3Faris{
	public static void main(String[] args) {
		String makanan;
		double harga, biaya = 0,total;
		char pengiriman;

		Scanner inputFaris = new Scanner(System.in);

		System.out.print("Masukkan nama makanan : ");
		makanan = inputFaris.nextLine();
		System.out.print("Masukkan harga makanan : ");
		harga = inputFaris.nextDouble();
		System.out.print("Apakah anda ingin pengiriman ekspres (0 = tidak, 1 = iya) : ");
		pengiriman = inputFaris.next().charAt(0);

		if (pengiriman == '0') {
			if (harga < 100000) {
				biaya = 20000;
			}else {
				biaya = 30000;
			}
		}else if(pengiriman == '1'){
			if (harga < 100000) {
				biaya = 45000;
			}else {
				biaya = 55000;
			}
		}else{
			System.out.println("Invalid");
		}
		total  = harga + biaya;
		System.out.println("STRUK PEMBELIAN");
		System.out.println(makanan + "\t\t\t Rp " + harga);
		System.out.println("Biaya pengiriman \t Rp " + biaya);
		System.out.println("TOTAL \t\t\t Rp " + total);
	}
}