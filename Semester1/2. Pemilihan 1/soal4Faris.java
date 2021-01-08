import java.util.Scanner;

public class soal4Faris{
	public static void main(String[] args) {
		
		double hargaA, hargaB, hargaC, jumlahA, jumlahB,  jumlahC;
		double totalA, totalB, totalC, totalS, totalD, totalBayar, diskonD=0; 

		Scanner inputFaris = new Scanner(System.in);
		
		System.out.print("Masukkan harga barang A    : ");
		hargaA = inputFaris.nextDouble();
		System.out.print("Masukkan Jumlah barang A   : ");
		jumlahA = inputFaris.nextDouble();
		System.out.print("\nMasukkan harga barang B  : ");
		hargaB = inputFaris.nextDouble();
		System.out.print("Masukkan Jumlah barang B   : ");
		jumlahB = inputFaris.nextDouble();
		System.out.print("\nMasukkan harga barang C  : ");
		hargaC = inputFaris.nextDouble();
		System.out.print("Masukkan Jumlah barang C   : ");
		jumlahC = inputFaris.nextDouble();

		totalA = hargaA * jumlahA;
		totalB = hargaB * jumlahB;
		totalC = hargaC * jumlahC;
		totalS = totalA + totalB + totalC;

		if (totalS >= 1000000){
			diskonD = totalS * 0.1;
		}
		else if(totalS >= 500000){
			diskonD = totalS * 0.05;
		}
		else if (totalS >= 200000) {
			diskonD = totalS * 0.02;
		}
		else{
			System.out.println("");
		}	

		totalBayar = totalS - diskonD;

		System.out.println("\t------------------------------------------------");
		System.out.println("\t\t\tStruk Nota");
		System.out.println("\t------------------------------------------------");

		System.out.println("Nama Barang \t | \t harga \t | \t Jumlah \t | \t Total");
		System.out.println("barang A  \t\t " + hargaA + "\t\t " + jumlahA + "\t\t" + totalA);
		System.out.println("barang B  \t\t " + hargaB + "\t\t " + jumlahB + "\t\t" + totalB);
		System.out.println("barang C  \t\t " + hargaC + "\t\t " + jumlahC + "\t\t" + totalC);	
		System.out.println("\t\t\t Total  \t\t\t\t " + totalS);
		System.out.println("\t\t\t Diskon  \t\t\t\t " + diskonD);
		System.out.println("\t\t\t Total Bayar \t\t\t\t " + totalBayar);
	}
}