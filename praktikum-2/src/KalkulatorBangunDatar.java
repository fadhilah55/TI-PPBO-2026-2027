import java.util.Scanner;
public class KalkulatorBangunDatar {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        /*Meminta pengguna memasukkan panjang dan lebar
         lalu menghitung dan menampilkan luas beserta kelilingnya*/
            //input panjang dan lebar
            System.out.print("Masukkan panjang persegi panjang : ");
            double panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar persegi panjang : ");
            double lebar = scanner.nextDouble();

            //perhitungan luas dan keliling persegi panjang
            double luasPersegiPanjang = panjang*lebar;
            double KelilingPersegiPanjang = 2 * (panjang + lebar);

            //Menampilkan hasil ke layar
            System.out.println("Luas persegi panjang : " + luasPersegiPanjang);
            System.out.println("Keliling persegi panjang :" + KelilingPersegiPanjang);

            //Membuat baris kosong, agar rapi

            System.out.println();

        /*Meminta input jari-jari lingkaran, lalu menghitung dan
        menampilkan luas lingkaran menggunakan Math.PI*/
            //Input jari-jari
            System.out.print("Masukkan jari-jari lingkaran : ");
            double r = scanner.nextDouble();

            //Perhitungan luas dan keliling menggunakan Math.PI
            double LuasPersegiPanjang = Math.PI*r*r;
            double kelilingPersegiPanjang = 2 * Math.PI*r;

            //Menampilkan hasilnya
            System.out.println("Luas persegi panjang : " + LuasPersegiPanjang);
            System.out.println("Keliling persegi panjang :" + kelilingPersegiPanjang);

            System.out.println();

        /*Menyimpan luas persegi panjang ke dalam variabel boolean bernama luasBesar
        yang bernilai true jika luas >100, dan menampilkannya*/
            //Mengecek apakah luas persegi panjang > 100?
            boolean luasBesar = luasPersegiPanjang > 100;
            System.out.print("Apakah luas persegi panjang > 100 " +luasBesar);

            System.out.println();
    }
}
