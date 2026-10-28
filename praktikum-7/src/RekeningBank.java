public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private String jenisRekening;


    public RekeningBank(String nomor, String pemilik, String jenisRekening, double saldoAwal) {
        this.nomorRekening = nomor;
        this.pemilik = pemilik;
        this.jenisRekening = jenisRekening; // Menyimpan nilai jenis rekening
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

    public void transferKe(RekeningBank tujuan, double jumlah) {
        System.out.println("\n Memproses Transfer dari " + this.pemilik + " ke " + tujuan.pemilik );
        if (jumlah <= 0) {
            System.out.println("TRANSFER GAGAL: Jumlah transfer harus positif!");
        } else if (this.saldo < jumlah) {
            System.out.println("TRANSFER GAGAL: Saldo " + this.pemilik + " tidak mencukupi!");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("TRANSFER BERHASIL sebesar Rp " + jumlah);
        }
    }

    public void cetakMutasi() {

        System.out.println("           LAPORAN MUTASI REKENING        ");

        System.out.println("Nomor Rekening  : " + nomorRekening);
        System.out.println("Nama Pemilik    : " + pemilik);
        System.out.println("Jenis Rekening  : " + jenisRekening);
        System.out.println("Saldo Saat Ini  : Rp " + String.format("%,.2f", saldo));

    }
}