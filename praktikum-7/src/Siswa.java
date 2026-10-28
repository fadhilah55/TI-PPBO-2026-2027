public class Siswa {
    private double nilai;  // Atribut private

    // Getter untuk mengambil nilai
    public double getNilai() {
        return nilai;
    }

    // Setter dengan validasi rentang 0 - 100
    public void setNilai(double nilaiBaru) {
        if (nilaiBaru >= 0 && nilaiBaru <= 100) {
            this.nilai = nilaiBaru;
        } else {
            System.out.println("Penolakan: Nilai " + nilaiBaru + " tidak valid! Harus antara 0 - 100.");
        }
    }

    // Method untuk mengembalikan nilai huruf (A/B/C/D/E)
    public char getNilaiHuruf() {
        if (nilai >= 85) {
            return 'A';
        } else if (nilai >= 70) {
            return 'B';
        } else if (nilai >= 55) {
            return 'C';
        } else if (nilai >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }

    public static void main(String[] args) {
        // Membuat objek Siswa
        Siswa s = new Siswa();

        System.out.println(" UJI COBA INPUT NILAI WAJAR ");
        s.setNilai(82.5); // Masuk rentang valid
        System.out.println("Nilai Angka : " + s.getNilai());
        System.out.println("Nilai Huruf : " + s.getNilaiHuruf());

        System.out.println("\n UJI COBA INPUT NILAI TIDAK WAJAR ");
        s.setNilai(110); // Akan ditolak oleh validasi
        s.setNilai(-5);  // Akan ditolak oleh validasi

        System.out.println("\nNilai Akhir Tetap : " + s.getNilai());
        System.out.println("Huruf Akhir Tetap : " + s.getNilaiHuruf());
    }

}
