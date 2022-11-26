import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
public static void main(String[] args) {
  Scanner sc1 = new Scanner(System.in);
  int[] arr = {2, 5, 7, 3, 4, 8, 9};

  System.out.println("Escolha um dos números a seguir para remover da lista = {2, 5, 7, 3, 4, 8 e 9} qual deseja remover?: ");
    int item = sc1.nextInt();;
 
      arr = removeElement(arr, item);
        System.out.println(Arrays.toString(arr));
    }
}