package project;

import java.util.Scanner;

public class nilaiMahasiswa {
    static String[] mataKuliah = {"1. Matematika Diskrit", "2. Teori Dasar Pemrograman", "3. Praktek Dasar Pemrograman"
            , "4. Aplikasi Perkantoran", "5. PKN", "6. Bahasa Inggris", "7. Konsep Tenologi Informasi", "8. Ilmu Komunikasi"
            , "9. K3", "10. Teknik Dokumentasi"};

    static double[] nilaiMataKuliah = new double[10];

    static String namaMahasiswa[];
    static String nimMahasiswa[];
    static String jurusanMahasiswa[];
    static int izinMahasiswa[][];

    static Scanner inputFaris = new Scanner(System.in);
    static Scanner inNama = new Scanner(System.in);
    static Scanner inNim = new Scanner(System.in);
    static Scanner inJurusan = new Scanner(System.in);

    public static void main(String[] args) {
        Login();
        System.out.println("\n**********************************************");
        System.out.println("\t\t\t Admin Mahasiswa \t\t");
        System.out.println("\n**********************************************");

        System.out.println("\n===================================");
        System.out.print("Masukkan banyak Mahasiswa : ");
        int banyak = inputFaris.nextInt();
        System.out.println("===================================");
        namaMahasiswa = new String[banyak];
        nimMahasiswa = new String[banyak];
        jurusanMahasiswa = new String[banyak];
        menu();

    }


    //Login
    public static void Login(){
        System.out.println("===============================");
        System.out.println("-----Login Admin Mahasiswa-----");
        System.out.print("\tUser : ");
        String user = inputFaris.next();
        System.out.print("\tPassword : ");
        String password = inputFaris.next();
        System.out.println("===============================");

        if (user.equals("admin") && password.equals("admin")){
            System.out.println("\n=================================");
            System.out.println("********--ACCES GRANTED--*********");
            System.out.println("===================================");
        }else {
            System.out.println("====================");
            System.out.println("\tACCES DENIED");
            System.out.println("====================");

            System.out.println("Ingin Mencoba Lagi y/n ? ");
            String tanya = inputFaris.next();
            if (tanya.equalsIgnoreCase("y")){
                Login();
            }else{
                System.out.println("Σ(っ°Д °; )っ");
                System.out.println("TERIMA KASIH");
                System.exit(0);
            }

        }
    }
    //Menampilkan Menu
    static void menu() {
        Scanner inputFaris = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("=========================================");
        System.out.println("-----------<< Pilih Menu >>-------------|");
        System.out.println("1. Data Mahasiswa                       |");
        System.out.println("2. Mata Kuliah                          |");
        System.out.println("3. Masukkan Nilai                       |");
        System.out.println("4. Masukkan perizinan                   |");
        System.out.println("5. Cetak KHS                            |");
        System.out.println("6. Nilai per MatKul                     |");
        System.out.println("99. Keluar Program                      |");
        System.out.println("=========================================");

        System.out.print("Masukkan Pilihan : ");
        int menu = inputFaris.nextInt();

        switch (menu) {
            case 1:
                dataMahasiswa();
                break;
            case 2:
                mataKuliah();
                break;
            case 3:
                inputNilai();
                break;
            case 4:
                izinMasiswa();
                break;
            case 5:
                cetakKHS();
                break;
            case 6:
                perMatkul();
            case 99:
                System.out.println("TERIMA KASIH");
                System.out.println("(￣︶￣*))");
                System.exit(0);
            default:
                System.out.print("\n");
                System.out.println("Pilihan yang anda masukkan salah");
                menu();
        }
    }

    //Funsi untuk Pilihan dataMahasiswa
    public static void dataMahasiswa() {
        System.out.println("===============================");
        System.out.println("-------< Data Mahasiswa >------");
        System.out.println("===============================");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("\nMahasiswa Ke-" + (i+1));
            System.out.print("\nMasukkan nama Mahasiswa  : ");
            namaMahasiswa[i] = inNama.nextLine();
            System.out.print("Masukkan NIM Mahasiswa : " );
            nimMahasiswa[i] = inNim.nextLine();
            System.out.print("Masukkan Jurusan Mahasiswa : ");
            jurusanMahasiswa[i] = inJurusan.nextLine();
        }
        System.out.println("Kembali ke Menu");
        menu();
    }

    //Fungsi untuk  Menampilkan Matkul
    public static void matkul() {
        for (int i = 0; i <= 9; i++) {
            System.out.println(mataKuliah[i]);
        }
    }

    //Fungsi untuk Pilihan Matakuliah
    public static void mataKuliah() {
        Scanner inputFaris = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Daftar Mata Kuliah");
        System.out.println("======================");
        matkul();

        System.out.println("Kembali ke Menu <yes>/<no>? ");
        String jawaban = inputFaris.next();

        if (jawaban.equalsIgnoreCase("yes")) {
            menu();
        } else {
            mataKuliah();
        }
    }

    //Fungsi untuk Menginput Nilai
    public static void inputNilai() {
        System.out.println("======================");
        System.out.println("\tMasukkan Nilai");
        System.out.println("======================");

        for (int i = 0; i < namaMahasiswa.length; i++) {
            if (namaMahasiswa[i] == null){
                System.out.println("Data Mahasiswa belum di inputkan");
                System.out.println("KEMBALI KE MENU");
                menu();
            }else{
                System.out.println(namaMahasiswa[i]);
            }
            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.print(mataKuliah[j] + " : ");
                nilaiMataKuliah[j] = inputFaris.nextDouble();
            }

        }
        menu();

    }

    //Fungsi Untuk Mencetak KHS
    public static void cetakKHS(){
        double total = 0;
        double rata = 0;
        for (int i = 0; i < namaMahasiswa.length; i++) {
            if (namaMahasiswa[i] == null) {
                System.out.println("Data Mahasiswa belum di inputkan");
                System.out.println("KEMBALI KE MENU");
                menu();
            }
            System.out.println("====KARTU HASIL STUDI=====");
            System.out.println("Mahasiswa " + (i+1));
            System.out.println("Nama Mahasiswa : " + namaMahasiswa[i]);
            System.out.println("NIM : " + nimMahasiswa[i]);
            System.out.println("Jurusan : " + jurusanMahasiswa[i]);
            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.print(mataKuliah[j] + "\t" );
                if (nilaiMataKuliah[j] > 80 && nilaiMataKuliah[j] <= 100){
                    System.out.println(" : " + nilaiMataKuliah[j] + "\t \t A");
                }
                else if (nilaiMataKuliah[j] > 73 && nilaiMataKuliah[j] <= 80){
                    System.out.println(" : " +nilaiMataKuliah[j] + "\t \t B+");
                }
                else if (nilaiMataKuliah[j] > 65 && nilaiMataKuliah[j] <= 73){
                    System.out.println(" : " + nilaiMataKuliah[j] + "\t \t B");
                }
                else if (nilaiMataKuliah[j] > 60 && nilaiMataKuliah[j] <= 65){
                    System.out.println(" : " + nilaiMataKuliah[j] + "\t \t C+");
                }
                else if (nilaiMataKuliah[j] > 50 && nilaiMataKuliah[j] <= 60){
                    System.out.println(" : " + nilaiMataKuliah[j] + "\t \t C");
                }
                else if (nilaiMataKuliah[j] > 39 && nilaiMataKuliah[i] <= 50){
                    System.out.println(" : " + nilaiMataKuliah[j] + "\t \t D");
                }else {
                    System.out.println(" : " + nilaiMataKuliah[j] + "\t \t E");
                }
                    total += nilaiMataKuliah[j];
                rata = total / 10;
                
            }

            tampilIzinMHS(i);

            System.out.println("Total Nilai : " + total);
            System.out.println("Rata-rata Nilai : " + rata);
            if (rata >= 50 && rata < 100){
                System.out.println("Anda dinyatakan Lulus");
            }else{
                System.out.println("Anda tidak dinyatakan Lulus");
            }
            System.out.println("-------------------------------------");
        }

        System.out.println("Kembali Ke Menu");
        menu();
    }

    //Fungsi untuk Menampilkan Nilai per matkul
    public static void perMatkul(){
        for (int i = 0; i < namaMahasiswa.length; i++) {
            if (namaMahasiswa[i] == null) {
                System.out.println("Data Mahasiswa belum di inputkan");
                System.out.println("KEMBALI KE MENU");
                menu();
            }
            System.out.println(namaMahasiswa[i]);
            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.print(mataKuliah[j] + " : " + nilaiMataKuliah[j]);
                System.out.println();
            }
        }
        menu();
    }

    //Fungsi untuk  menginpitkan izin sakit
    public  static void izinMasiswa(){
        izinMahasiswa = new int[namaMahasiswa.length][3];
        for (int i = 0; i < namaMahasiswa.length; i++) {
            if (namaMahasiswa[i] == null) {
                System.out.println("Data Mahasiswa belum di inputkan");
                System.out.println("KEMBALI KE MENU");
                menu();
            }
            else {
                System.out.println(namaMahasiswa[i]);
                System.out.print("Sakit : ");
                izinMahasiswa[i][0] = inputFaris.nextInt();
                System.out.print("Alpha : ");
                izinMahasiswa[i][1] = inputFaris.nextInt();
                System.out.print("Izin : ");
                izinMahasiswa[i][2] = inputFaris.nextInt();
            }
        }
        menu();
    }       
    public static void tampilIzinMHS(int i) {
            System.out.println("Izin : " + izinMahasiswa[i][0]);
            System.out.println("Sakit : " + izinMahasiswa[i][1]);
            System.out.println("Alpha : " + izinMahasiswa[i][2]);
    }
}