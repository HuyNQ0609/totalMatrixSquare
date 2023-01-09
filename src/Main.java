import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[][] array;
        System.out.print("Enter a size: ");
        size = input.nextInt();
        array = new int[size][size];
        System.out.println("Enter values of element:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Array: " + Arrays.deepToString(array));
        System.out.println("The sum of the main diagonals is: " + total(array));
    }
    public static int total(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}