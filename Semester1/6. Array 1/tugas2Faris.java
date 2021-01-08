package Array1Tugas;

public class tugas2Faris {
    public static void main(String[] args) {
        int[] angka = {5,2,7,9,6};
        int i =0, j = 0;

        System.out.println("Nilai Array yang akan ditampilkan");
        for (i = 0; i < 5 ; i++ ) {
            System.out.print(angka[i] + " ");
        }

        System.out.println("\nNilai Array Setelah dibalik");
        for (j = 4;j >= 0 ; j--) {
            System.out.print(angka[j] + " ");
        }
    }
}
