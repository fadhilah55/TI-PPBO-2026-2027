import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double TARIF_450 = 500.0;
        double TARIF_900 = 750.0;
        double TARIF_1300 = 1200.0;
        double TARIF_2200 = 1500.0;
        double TARIF_DIATAS_2200 = 1800.0;
        double tarif = 0.0;

        int daya;

        System.out.println(" PROGRAM HITUNG TARIF LISTRIK ");
        System.out.println("Pilihan Golongan Daya:");
        System.out.println("1. 450 VA");
        System.out.println("2. 900 VA");
        System.out.println("3. 1300 VA");
        System.out.println("4. 2200 VA");
        System.out.println("5. Di atas 2200 VA");
        System.out.print("Masukkan pilihan golongan (1-5): ");
        int pilihan = sc.nextInt();
        String golongan;

        switch (pilihan) {
            case 1:
                daya = 450;
                golongan = "450 VA";
                tarif = TARIF_450;
                break;
            case 2:
                daya = 900;
                golongan = "900 VA";
                tarif = TARIF_900;
                break;
            case 3:
                daya = 1300; // Sudah dibetulkan dari 130 jadi 1300
                golongan = "1300 VA";
                tarif = TARIF_1300;
                break;
            case 4:
                daya = 2200;
                golongan = "2200 VA";
                tarif = TARIF_2200;
                break;
            case 5:
                daya = 2201;
                golongan = "Di atas 2200 VA";
                tarif = TARIF_DIATAS_2200;
                break;
            default:
                System.out.println("Error: Pilihan golongan tidak valid!");
                sc.close();
                return;
        }

        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        double kwh = sc.nextDouble();

        if (kwh <= 0.0) {
            System.out.println("Error: Jumlah pemakaian kWh harus lebih dari 0.");
        } else {
            double total = kwh * tarif;
            System.out.println();
            System.out.println(" HASIL PERHITUNGAN");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Golongan Daya : " + golongan);
            System.out.println("Pemakaian : " + kwh + " kWh");
            System.out.println("Tarif per kWh : Rp" + tarif);
            System.out.println("Total Tagihan : Rp" + total);
        }

        sc.close();
    }
}