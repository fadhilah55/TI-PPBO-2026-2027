public class BankDemo {
    public static void main(String[] args) {
        // Membuat minimal 2 objek RekeningBank
        RekeningBank rek1 = new RekeningBank("101", "Andi Pratama", "Tabungan", 2000000);
        RekeningBank rek2 = new RekeningBank("102", "Siti Aminah", "Giro", 1000000);

        System.out.println("=== KONDISI AWAL ===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();

        System.out.println("\n=== DEMO SETOR & TARIK ===");
        rek1.setor(500000);   // Setor valid
        rek2.tarik(200000);   // Tarik valid

        // Skenario 1: Transfer BERHASIL
        rek1.transferKe(rek2, 400000);

        // Skenario 2: Transfer GAGAL (Saldo tidak cukup)
        rek2.transferKe(rek1, 5000000);

        // Skenario 3: Transfer GAGAL (Jumlah negatif)
        rek1.transferKe(rek2, -50000);

        System.out.println("\n=== MUTASI AKHIR KEDUA REKENING ===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}