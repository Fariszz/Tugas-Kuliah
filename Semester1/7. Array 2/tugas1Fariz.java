package Array2Tugas;

public class tugas1Fariz{
    public static void main(String[] args) {

        char KODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        char kodeKota[][] = {
                {'B', 'A', 'N', 'T', 'E', 'N'},
                {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                {'B', 'O', 'G', 'O', 'R'},
                {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                {'M', 'A', 'L', 'A', 'N', 'G'},
                {'T', 'E', 'G', 'A', 'L'},
        };

        for (int i = 0; i < kodeKota.length; i++) {
            System.out.print(KODE[i] + "\t");
            for (int j = 0; j < kodeKota[i].length; j++) {
                System.out.print(kodeKota[i][j]);
            }
            System.out.println(" ");
        }
    }
}
