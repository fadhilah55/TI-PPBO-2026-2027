
import java.util.Scanner;
public class Latihan1 {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.print("Masukkan sebuah angka: ");
      int angka = scanner.nextInt();

      System.out.println();

      System.out.println("TABLE PERKALIAN " + angka );

      for (int i = 1; i<=10; i++){
          int hasil = angka *i;
          System.out.println(angka + "x" + i + " = " + hasil);
      }

      scanner.close();
  }
}
