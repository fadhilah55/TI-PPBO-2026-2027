public class Mahasiswa {
        String nama;
        String nim;
        double ipk;

    // Constructor default (tanpa parameter)
    public Mahasiswa(){
        nama = "Belum disi";
        nim = "-";
        ipk = 0.0;
    }

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama; // this.nama = atribut, nama = parameter
        this.nim = nim;
        this.ipk = ipk;
    }
}
