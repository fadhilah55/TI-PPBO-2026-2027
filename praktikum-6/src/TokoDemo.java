public class TokoDemo {
    public static void main(String[] args) {
        Produk[] daftar = new Produk[4];
        daftar[0] = new Produk("01", "Moisturaizer", 75000, 30);
        daftar[1] = new Produk("02", "Sunscreen", 120000, 45);
        daftar[2] = new Produk("03", "Micelar Water", 65000, 22);
        daftar[3] = new Produk("04", "Lip Serum", 125000, 4);

        for (Produk m : daftar) {
                m.TampilkanData();
                System.out.println("---");
        }

        // Pembelian produk pertama: stok mencukupi
        System.out.println("`~~~~~ Pembelian Produk 1 ~~~~~");
        System.out.println("Nama: " + daftar[0].namaProduk);
        System.out.println("Total harga: Rp" + daftar[0].hitungTotalHarga(2));
        daftar[0].kurangiStok(2);

        System.out.println();

        // Pembelian produk kedua: stok tidak mencukupi
        System.out.println("~~~~~~ Pembelian Produk 2 ~~~~~~");
        System.out.println("Nama: " + daftar[3].namaProduk);
        System.out.println("Total harga: Rp" + daftar[3].hitungTotalHarga(5));
        daftar[3].kurangiStok(5);

        System.out.println();

        Produk termahal = daftar[0];

        for (int i = 1; i < daftar.length; i++) {
            if (daftar[i].harga > termahal.harga) {
                termahal = daftar[i];
            }
        }

        System.out.println("=== Produk dengan Harga Termahal ===");
        termahal.TampilkanData();
    }
}