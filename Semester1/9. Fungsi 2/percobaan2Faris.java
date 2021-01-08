package fungsi2;
import java.util.Scanner;

public class percobaan2Faris {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return  1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }
    public static void main(String[] args) {
        Scanner inputFaris = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = inputFaris.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = inputFaris.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
