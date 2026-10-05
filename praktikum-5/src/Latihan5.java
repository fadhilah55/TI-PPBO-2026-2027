public class Latihan5 {
    static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }

    static int[] filterDiAtasRataRata(int[] data) {
        double rataRata = (double) hitungTotal(data) / data.length;

        // Hitung  berapa banyak elemen yang nilainya > rata-rata
        int count = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                count++;
            }
        }

        // Membuat array baru dengan ukuran pas sesuai jumlah elemen yang memenuhi syarat
        int[] hasil = new int[count];
        int index = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }

        return hasil;
    }
    public static void main(String[] args) {

        int[] nilai = { 60, 75, 80, 90, 85, 50, 95 };

        int total = hitungTotal(nilai);
        double rataRata = (double) total / nilai.length;
        int[] diatasRataRata = filterDiAtasRataRata(nilai);

        System.out.println("Total Nilai    : " + total);
        System.out.printf("Rata-rata      : %.2f\n", rataRata);
        System.out.print("Di atas rata-rata: ");
        for (int n : diatasRataRata) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
