public class Persegi {
    int sisi; //atribut

    public Persegi(int sisi){ //constructor
        this.sisi = sisi;
    }

    int hitungluas(){
        return sisi * sisi;
    }
    int hitungkeliling(){
        return 4 * sisi;
    }

    public static void main(String[] args) {
        Persegi[] daftar = {
                new Persegi(2),
                new Persegi(5),
                new Persegi(10),
                new Persegi(7)
        };
        Persegi terbesar = daftar[0];
        // Mencari luas terbesar menggunakan perulangan
        for (int i = 1; i < daftar.length; i++) {
            if (daftar[i].hitungluas() > terbesar.hitungluas()) {
                terbesar = daftar[i];
            }
        }

        System.out.println("Persegi dengan luas terbesar:");
        System.out.println("Sisi  : " + terbesar.sisi);
        System.out.println("Luas  : " + terbesar.hitungluas());
        System.out.println("sisi  : " + terbesar.hitungkeliling());
    }

}
