public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk= kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }
    public void kurangiStok(int jumlah) {
        if (stok >= jumlah) {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi.");
            System.out.println("Sisa stok: " + stok);
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }
    public void TampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
    }
}
