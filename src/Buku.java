public class Buku {
    String judul;
    String pengarang;
    String tahunterbit;

    public Buku(String judul, String pengarang, String tahunterbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
    }

    public static void main(String[] args) {
        Buku b1 = new Buku("Bumi Manusia", "Ananta Toer", "1980");
        Buku b2 = new Buku("Suara dari Dilan", "Pidi Baiq", "2016");

        System.out.println("   Data Buku 1 ");
        System.out.println("Judul       : " + b1.judul);
        System.out.println("Pengarang   : " + b1.pengarang);
        System.out.println("Tahun Terbit: " + b1.tahunterbit);

        System.out.println();

        // Menampilkan data buku kedua
        System.out.println("   Data Buku 2 ");
        System.out.println("Judul       : " + b2.judul);
        System.out.println("Pengarang   : " + b2.pengarang);
        System.out.println("Tahun Terbit: " + b2.tahunterbit);
    }

}
