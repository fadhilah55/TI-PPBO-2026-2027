public class produk {
        String namaProduk;
        double harga;

    public static void main(String[] args){
        produk produk1 = new produk("Baju", 200000.00);

        System.out.println("Nama Produk : " + produk1.namaProduk);
        System.out.println("Harga Produk : " + produk1.harga);
        System.out.println("Mahal? : " + produk1.isMahal(150000.00));

    }

    public produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk; // this.nama = atribut, nama = parameter
        this.harga = harga;
    }

    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }

}
