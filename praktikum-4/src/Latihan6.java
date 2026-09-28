import java.util.Scanner;
public class Latihan6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array : ");
        int jumlah = scanner.nextInt();

        int[] array = new int[jumlah];

        System.out.println("Masukkan " + jumlah + " elemen : ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("\nArray Sebelum Diurutkan : ");
        tampilkanArray(array);

        // proses buble sort ascending
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - 1 - i; j++) {
                // Membandingkan elemen saat ini dengan elemen setelahnya
                if (array[j] > array[j + 1]) {
                    // Tukar posisi (Swap) jika elemen kiri lebih besar
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Array Sesudah Diurutkan : ");
        tampilkanArray(array);

        scanner.close();
    }

    // Method pembantu untuk mencetak elemen array
    public static void tampilkanArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
