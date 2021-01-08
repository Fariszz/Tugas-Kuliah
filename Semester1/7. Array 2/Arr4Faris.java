package Arrray2Percobaan;

public class Arr4Faris {
    public static void main(String[] args) {
        int RGB[][][] = {
                {
                        {2, 2, 3},
                        {5, 6, 7}
                },
                {
                        {6, 8, 5},
                        {5, 2, 6}
                }
        };
        for (int i = 0; i < RGB.length; i++) {
            for (int j = 0; j < RGB[1].length; j++) {
                for (int k = 0; k < RGB[0][1].length; k++) {
                    System.out.print(RGB[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
