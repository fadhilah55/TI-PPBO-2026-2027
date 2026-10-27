public class MainWaktu {
    public static void main(String[] args) {
        // 1. Membuat objek dari class Waktu
        Waktu w = new Waktu();

        System.out.println(" UJI COBA INPUT NORMAL (WAJAR) ") ;
        w.setJam(12);
        w.setMenit(45);
        w.setDetik(30);

        // Menampilkan hasil nilai yang berhasil disimpan menggunakan Getter
        System.out.println("Waktu saat ini: " + w.getJam() + ":" + w.getMenit() + ":" + w.getDetik());

        System.out.println("\n UJI COBA INPUT DI LUAR RENTANG (TIDAK WAJAR)");
        w.setJam(34);   // Akan memicu pesan error (karena di atas 23)
        w.setMenit(75);  // Akan memicu pesan error (karena di atas 59)
        w.setDetik(-5);  // Akan memicu pesan error (karena di bawah 0)
    }
}