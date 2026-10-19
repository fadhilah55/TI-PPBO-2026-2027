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
        Persegi p1 = new Persegi(7);
        Persegi p2 = new Persegi(6);

        System.out.println(" Perhitungan persegi 1 ");
        System.out.println("Sisi  : " + p1.sisi);
        System.out.println("Luas  : " + p1.hitungluas());
        System.out.println("Keliling  : " + p1.hitungkeliling());

        System.out.println();

        System.out.println(" Perhitungan persegi 2 ");
        System.out.println("Sisi  : " + p2.sisi);
        System.out.println("Luas  : " + p2.hitungluas());
        System.out.println("keliling  : " + p2.hitungkeliling());

    }

}
