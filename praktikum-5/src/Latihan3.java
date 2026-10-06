public class Latihan3 {
    // Overloading 1: Konversi ke Fahrenheit
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Overloading 2: Konversi ke Fahrenheit atau Kelvin
    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Fahrenheit") || skalaTujuan.equalsIgnoreCase("F")) {
            return (celsius * 9 / 5) + 32;
        } else if (skalaTujuan.equalsIgnoreCase("Kelvin") || skalaTujuan.equalsIgnoreCase("K")) {
            return celsius + 273.15;
        } else {
            System.out.println("Skala tidak dikenal, mengembalikan nilai asli.");
            return celsius;
        }
    }

        public static void main(String[] args) {

            double celsius = 30.0;

            // Memanggil versi 1 parameter
            System.out.println(celsius + " C -> Fahrenheit: " + konversiSuhu(celsius));

            // Memanggil versi 2 parameter
            System.out.println(celsius + " C -> Kelvin: " + konversiSuhu(celsius, "Kelvin"));
            System.out.println(celsius + " C -> Fahrenheit: " + konversiSuhu(celsius, "Fahrenheit"));
        }
    }



