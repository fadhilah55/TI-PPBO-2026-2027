public class Produk {
    // Atribut private
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // Getter
    public String getKodeProduk() { return kodeProduk; }
    public String getNamaProduk() { return namaProduk; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    // Setter dengan validasi
    public void setKodeProduk(String kodeProduk) { this.kodeProduk = kodeProduk; }
    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Penolakan: Harga tidak boleh negatif!");
        }
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Penolakan: Stok tidak boleh negatif!");
        }
    }

    public static void main(String[] args) {
        // Membuat objek dari class ini sendiri
        Produk p = new Produk();

        p.setKodeProduk("P001");
        p.setNamaProduk("Buku Tulis");
        p.setHarga(5000);
        p.setStok(10);

        // Menampilkan hasil
        System.out.println(" DATA PRODUK ");
        System.out.println("Kode : " + p.getKodeProduk());
        System.out.println("Nama : " + p.getNamaProduk());
        System.out.println("Harga: " + p.getHarga());
        System.out.println("Stok : " + p.getStok());

        // Uji coba validasi harga negatif
        System.out.println("\nUji coba harga minus:");
        p.setHarga(-2000); // Akan memicu pesan penolakan
    }

}
