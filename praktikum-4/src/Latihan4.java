import java.util.Scanner;

public class Latihan4 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int[][] matriks = new int [3][3];
       int totalkeseluruhan = 0;

       System.out.println("Masukkan elemen matriks 3x3");
       for (int i = 0; i < 3; i++){
           for (int j = 0; j < 3; j++) {
               System.out.print("Matriks[" + i + "][" + j + "]: ");
               matriks [i][j] = scanner.nextInt();
           }
       }

       System.out.println();

       System.out.println("Bentuk matriks");
       for (int i = 0; i < 3; i++){
           for (int j = 0; j < 3; j++){
             System.out.print(matriks[i][j] + "\t");
           }
           System.out.println();
       }

       System.out.println("\nHasil Perhitungan");
       for (int i = 0; i < 3; i++) {
           int jumlahBaris = 0;
           for (int j = 0; j < 3; j++) {
               jumlahBaris += matriks[i][j];
           }
           totalkeseluruhan += jumlahBaris;
           System.out.println("Jumlah elemen baris ke-" + (i + 1) + ": " + jumlahBaris);
       }

       System.out.println("Jumlah seluruh elemen matriks: " + totalkeseluruhan);

       scanner.close();
   }
}
