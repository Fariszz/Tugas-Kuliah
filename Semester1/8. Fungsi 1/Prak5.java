package fungsi1;

public class Prak5 {
    static void Tampil(String str, int... a){
        System.out.print("String: " + str);
        System.out.print("Jumlah argumen atau parameter : " + a.length);

        for (int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1,2,3,4,5);
        Tampil("Polinema");
    }
}
