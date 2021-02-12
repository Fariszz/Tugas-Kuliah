package minggu1;

public class perulanganHari {
    public static void main(String[] args) {
        //nim = 2031710150

        for (int i = 1; i <= 50 ; i++) {
            if(i%7==1){
                System.out.print(" Senin ");
            }
            else if (i%7==2){
                System.out.print(" Selasa ");
            }
            else if (i%7==3){
                System.out.print(" Rabu ");
            }
            else if (i%7==4){
                System.out.print(" Kamis ");
            }
            else if (i%7==5){
                System.out.print(" Jumat ");
            }
            else if (i%7==6){
                System.out.print(" Sabtu ");
            }
            else if (i%7==0){
                System.out.print(" Minggu \n");
            }
        }
    }

}
