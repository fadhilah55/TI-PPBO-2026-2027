import java.util.Scanner;
public class Latihan3 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[10];

      System.out.println("Msukkan 10 angka : ");
      for (int i = 0; i < array.length; i++){
       System.out.print("Elemen ke-" +(i+1) + ": ");
          array[i] = scanner.nextInt();
      }

      System.out.println("Array dalam Urutan terbalik ");
      for (int i = array.length -1; i>0; i--){
          System.out.print(array[i] + " ");
      }
      System.out.println();

      scanner.close();
  }
}
