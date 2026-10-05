import java.util.Scanner;
public class KalkulatorMethod {

//  a) Method Operasi Matematika Static

    //Method Overloading tambah (2 parameter)
    static double tambah(double a, double b) {
        return a + b;
    }

    //Method Overloading tambah (3 parameter)
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return Double.NaN; // Returns Not-a-Number jika pembagian nol
        }
        return a / b;
    }

    static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    static double akarKuadrat(double angka) {
        if (angka < 0) {
            System.out.println("Error: Tidak dapat menghitung akar dari bilangan negatif!");
            return Double.NaN;
        }
        return Math.sqrt(angka);
    }

    //Method Mencari Nilai Maksimum dari Riwayat Hasil
    static double riwayatKeMaksimum(double[] riwayatHasil, int jumlahData) {
        if (jumlahData == 0) {
            return Double.NaN;
        }
        double max = riwayatHasil[0];
        for (int i = 1; i < jumlahData; i++) {
            if (riwayatHasil[i] > max) {
                max = riwayatHasil[i];
            }
        }
        return max;
    }

    // Method Main (Menu & Loop)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array riwayat untuk menyimpan hasil perhitungan (maksimal 100 transaksi)
        double[] riwayatHasil = new double[100];
        int jumlahRiwayat = 0;

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("     PROGRAM KALKULATOR METHOD    ");
            System.out.println("1. Penjumlahan (2 angka)");
            System.out.println("2. Penjumlahan (3 angka)");
            System.out.println("3. Pengurangan");
            System.out.println("4. Perkalian");
            System.out.println("5. Pembagian");
            System.out.println("6. Perpangkatan");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu (1-8): ");

            int pilihan = scanner.nextInt();
            double hasil = 0;
            boolean valid = true; // Menandai apakah perhitungan berhasil disimpan ke riwayat

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b1 = scanner.nextDouble();
                    hasil = tambah(a1, b1);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b2 = scanner.nextDouble();
                    System.out.print("Masukkan angka ketiga: ");
                    double c2 = scanner.nextDouble();
                    hasil = tambah(a2, b2, c2);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b3 = scanner.nextDouble();
                    hasil = kurang(a3, b3);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b4 = scanner.nextDouble();
                    hasil = kali(a4, b4);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 5:
                    System.out.print("Masukkan angka yang dibagi: ");
                    double a5 = scanner.nextDouble();
                    System.out.print("Masukkan angka pembagi: ");
                    double b5 = scanner.nextDouble();
                    hasil = bagi(a5, b5);
                    if (Double.isNaN(hasil)) {
                        valid = false;
                    } else {
                        System.out.println("Hasil: " + hasil);
                    }
                    break;

                case 6:
                    System.out.print("Masukkan angka basis: ");
                    double basis = scanner.nextDouble();
                    System.out.print("Masukkan angka eksponen (pangkat): ");
                    double eksponen = scanner.nextDouble();
                    hasil = pangkat(basis, eksponen);
                    System.out.println("Hasil: " + hasil);
                    break;

                case 7:
                    System.out.print("Masukkan angka yang diakarkan: ");
                    double angkaAkar = scanner.nextDouble();
                    hasil = akarKuadrat(angkaAkar);
                    if (Double.isNaN(hasil)) {
                        valid = false;
                    } else {
                        System.out.println("Hasil: " + hasil);
                    }
                    break;

                case 8:
                    berjalan = false;
                    valid = false;
                    System.out.println("\nTerima kasih telah menggunakan program ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu 1-8.");
                    valid = false;
                    break;
            }

            // Simpan hasil ke array riwayat jika opsi kalkulasi valid
            if (valid && jumlahRiwayat < riwayatHasil.length) {
                riwayatHasil[jumlahRiwayat] = hasil;
                jumlahRiwayat++;
            }
        }

        //Output Nilai Maksimum Saat Keluar
        if (jumlahRiwayat > 0) {
            double maxHasil = riwayatKeMaksimum(riwayatHasil, jumlahRiwayat);
            System.out.println("Nilai hasil PERHITUNGAN TERBESAR dari seluruh transaksi: " + maxHasil);
        } else {
            System.out.println("Tidak ada perhitungan yang tersimpan.");
        }

        scanner.close();
    }

}
