public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public int getJam() {
        return jam;
    }
    public int getMenit() {
        return menit;
    }
    public int getDetik() {
        return detik;
    }

    public void setJam(int jambaru) {
        if (jambaru >= 0 && jambaru <= 23) {
            this.jam = jambaru; // Disimpan hanya jika wajar
        } else {
            System.out.println("Error: Jam harus antara 0 sampai 23!");
        }
    }

    public void setMenit(int menitBaru) {
        if (menitBaru >= 0 && menitBaru <= 59) {
            this.menit = menitBaru; // Disimpan hanya jika wajar
        } else {
            System.out.println("Error: Menit harus antara 0 sampai 59!");
        }
    }

    public void setDetik(int detikBaru) {
        if (detikBaru >= 0 && detikBaru <= 59) {
            this.detik = detikBaru; // Disimpan hanya jika wajar
        } else {
            System.out.println("Error: Detik harus antara 0 sampai 59!");
        }
    }

}


