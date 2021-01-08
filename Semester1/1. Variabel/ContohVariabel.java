public class ContohVariabel{
	public static void main(String[] args){

		String hoby = "Bermain petak umpet";
		boolean  _Pandai = true;
		char jenisKelamin = 'L';
		byte _umurSekarang = 20;
		double $ipk = 3.24, tinggi = 1.78;

		System.out.println(hoby);
		System.out.println("Apakah pandai ? " + _Pandai);
		System.out.println("jenis kelamin : " + jenisKelamin);
		System.out.println("Umurku saaat ini :  " + _umurSekarang);
		System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
	}
}	