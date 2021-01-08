package Tugas;

public class tugas4Faris {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++){
            if (i % 2 != 0 ){
                for (int j = 5; j >= 1;j--){
                    System.out.print(j);
                }
            }else{
                for (int k = 1; k <= 5; k++){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
