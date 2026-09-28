import java.util.Scanner;
public class Latihan5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array (Minimal 2 elemen) : ");
        int n = scanner.nextInt();

        if (n < 2){
            System.out.println("Array harus memiliki minimal 2 elemen");
            scanner.close();
            return;
        }

        int[] array = new int[n];

        // mengisi elemen array dari inputan user
        System.out.println("Masukkan ke " + n + " elemen : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int terbesar = Integer.MIN_VALUE;
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (array[i] > terbesar) {
                terbesarKedua = terbesar; // Geser terbesar lama ke terbesar kedua
                terbesar = array[i];       // Perbarui terbesar
            } else if (array[i] > terbesarKedua && array[i] != terbesar) {
                terbesarKedua = array[i];  // Perbarui terbesar kedua jika nilainya di antara keduanya
            }
        }

        if (terbesarKedua == Integer.MIN_VALUE) {
            System.out.println("\nTidak ada nilai terbesar kedua (semua elemen bernilai sama).");
        } else {
            System.out.println("\nNilai Terbesar       : " + terbesar);
            System.out.println("Nilai Terbesar Kedua : " + terbesarKedua);
        }

        scanner.close();
    }

}
