public class produkk {
        String namaProduk;
        double harga;

    public static void main(String[] args){
        produkk produkk1 = new produkk("Baju", 200000.00);

        System.out.println("Nama Produk : " + produkk1.namaProduk);
        System.out.println("Harga Produk : " + produkk1.harga);
        System.out.println("Mahal? : " + produkk1.isMahal(150000.00));

    }

    public produkk(String namaProduk, double harga) {
        this.namaProduk = namaProduk; // this.nama = atribut, nama = parameter
        this.harga = harga;
    }

    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }

}
