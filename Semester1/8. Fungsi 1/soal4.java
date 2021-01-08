package fungsi1;

public class soal4 {
    public static void TampilkanHinggaKei(int i){
        for (int j = 0; j <= i; j++){
            System.out.println(j);
        }
    }

    public static int Jumlah(int bil1, int bil2){
        return (bil1 + bil2);
    }

    public static void TampilJumlah(int bil1, int bil2){
        TampilkanHinggaKei(Jumlah(bil1,bil2));
    }
    public static void main(String[] args) {
        int temp = Jumlah(1,1);
        TampilJumlah(temp, 5);
    }
}
