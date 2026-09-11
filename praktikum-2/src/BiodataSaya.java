import java.util.Scanner;
//Membuat Biodata sederhana
public class BiodataSaya {
    public static void main(String[] args) {
    /* -- Latihan nomor 1 -- */
    //Mencetak nama, nim dan prodi pada baris terpisah
        System.out.println("Nama : Fadhilah");
        System.out.println("NIM : 2025573010135");
        System.out.println("Program Studi : Teknik Informatika");

        System.out.println();

    /* -- Latihan nomor 2 -- */
    //Memodifikasi program dengan mencetak nama dan nim pada baris yang sama
        System.out.print("Nama : Fadhilah");
        System.out.print("-");
        System.out.println("NIM : 2025573010135");
        System.out.println("Program Studi : Teknik Informatika");

        System.out.println();

    /*-- Latihan nomor 3 -- */
    //Membuat program dengan mendeklarasikan variabel bertipe int, double, char dan boolean pada data pribadi
        int umur =19;
        double tinggiBadan = 155;
        char inisial = 'F';
        boolean MahasiswaAktif = true;

        System.out.println("Umur :" + umur + "tahun" );
        System.out.println("Tinggi Badan" + tinggiBadan + "cm");
        System.out.println("Inisial :" + inisial);
        System.out.println("Status mahasiswa :" + MahasiswaAktif);

        System.out.println();

    /*-- Latihan nomor 4 --*/
    //Konfersi suhu dari celsius ke fahreit
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam celsius : ");
        double celsius = scanner.nextDouble();
        double fahreit = celsius * 9.0/5+2;
        System.out.println("Suhu dalam fahreit : " + fahreit);

        System.out.println();

    /* -- Latihan nomor 5 -- */
    //Menampilkan operasi aritmatika dan hasil perpandingan

        System.out.print ("Masukkan bilngan pertama : ");
        int a = scanner.nextInt();
        System.out.print ("Masukkan bilngan kedua : ");
        int b =scanner.nextInt();

    // == Hasil Aritmatika ==
        System.out.println ("Penjumlahan ("+a+ "+" +b+"):"+(a+b));
        System.out.println ("Pengurangan ("+a+ "-" +b+"):"+(a-b));
        System.out.println ("Perkalian ("+a+ "*" +b+"):"+(a*b));
        System.out.println ("Pembagian ("+a+ "/" +b+"):"+(a/b));
        System.out.println ("sisabagi ("+a+ "%"+b+"):"+(a%b));

    // == Hasil Perbandingan ==
        System.out.println (a+ ">"+b+":"+(a>b));
        System.out.println (a+ "<"+b+":"+(a<b));
        System.out.println (a+ "=="+b+":"+(a==b));

    }
}