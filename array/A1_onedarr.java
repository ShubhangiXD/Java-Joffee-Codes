package array;

import java.util.*;

public class A1_onedarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");

        sc.close(); // no need to give this line in BlueJ
    }
}
