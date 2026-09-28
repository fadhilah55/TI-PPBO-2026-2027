import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        final double KKM = 70.0; //minimal nilai untuk dinyatakan lulus

        System.out.println("       INPUT DATA NILAI MAHASISWA       ");

        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = scanner.nextInt();

        //memvalidasi agar jumlah mahasiswa tidak kurang dari 1
        while (n <= 0) {
            System.out.print("Jumlah mahasiswa harus lebih dari 0. Masukkan kembali: ");
            n = scanner.nextInt();
        }

        double[] nilai = new double[n];
        double[] nilaiAwal = new double[n]; // Array cadangan untuk menyimpan data sebelum diurutkan

        System.out.println("\nMasukkan nilai ujian masing-masing mahasiswa (0 - 100):");
        for (int i = 0; i < n; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextDouble();

            // Simpan nilai awal ke array cadangan
            nilaiAwal[i] = nilai[i];
        }

        double total = 0;
        double nilaiTertinggi = nilai[0];
        double nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            // Menghitung total nilai untuk rata-rata
            total += nilai[i];

            // Cari nilai tertinggi
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            // Cari nilai terendah
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            // Cek status lulus berdasarkan KKM
            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        double rataRata = total / n;

        // Pengurutan Data (Bubble Sort Ascending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Membandingkan elemen berdampingan
                if (nilai[j] > nilai[j + 1]) {
                    // Tukar posisi jika elemen kiri lebih besar
                    double temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println();

        System.out.println("        LAPORAN HASIL UJIAN KELAS        ");
        System.out.printf(" Batas Nilai Kelulusan (KKM) : %.1f\n", KKM);
        System.out.println(" Total Mahasiswa             : " + n);
        System.out.println();
        System.out.printf(" Nilai Rata-Rata Kelas       : %.2f\n", rataRata);
        System.out.printf(" Nilai Tertinggi             : %.1f\n", nilaiTertinggi);
        System.out.printf(" Nilai Terendah              : %.1f\n", nilaiTerendah);
        System.out.println();
        System.out.println(" Jumlah Mahasiswa Lulus        : " + jumlahLulus + " orang");
        System.out.println(" Jumlah Mahasiswa Tidak Lulus  : " + jumlahTidakLulus + " orang");
        System.out.println();


        // Menampilkan array sebelum dan sesudah diurutkan
        System.out.println("\n     DATA URUTAN NILAI       ");

        System.out.print("Sebelum Diurutkan : ");
        tampilkanArray(nilaiAwal);

        System.out.print("Sesudah Diurutkan : ");
        tampilkanArray(nilai);

        System.out.println();

        scanner.close();
    }

    // Method pembantu untuk mencetak elemen array dengan format rapi
    public static void tampilkanArray(double[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.1f", arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
