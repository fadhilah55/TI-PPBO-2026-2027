public class Buku {
    String judul;
    String pengarang;
    int tahunterbit;

    public Buku(String judul, String pengarang, int tahunterbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
    }

    public void Data() {
        System.out.println("Judul : "+ judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("tahun Terbit : " + tahunterbit);
    }

    public static void main(String[] args) {
        Buku[] daftar = new Buku[4];
        daftar[0] = new Buku("Laut Bercerita", "Leila S. Chudori", 2017);
        daftar[1] = new Buku("Negeri 5 Menara", "A. Fuadi", 2009);
        daftar[2] = new Buku("Pulang", "Leila S. Chudori", 2012);
        daftar[3] = new Buku("Home Sweet Loan", "Almira Bastari", 2022);

        for (Buku m : daftar) {
            if (m.tahunterbit < 2015) {
                m.Data();
                System.out.println("---");
            }
        }
    }
}