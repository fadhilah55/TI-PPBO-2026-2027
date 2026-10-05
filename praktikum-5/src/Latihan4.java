import java.util.Scanner;
public class Latihan4 {
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }
        return min;
    }
    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data ujian: ");
        int jumlah = scanner.nextInt();

        int[] nilaiUjian = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiUjian[i] = scanner.nextInt();
        }

        System.out.println("\n     Hasil ");
        System.out.println("Nilai Minimum  : " + cariNilaiMinimum(nilaiUjian));
        System.out.println("Nilai Maksimum : " + cariNilaiMaksimum(nilaiUjian));

        scanner.close();
    }



}
