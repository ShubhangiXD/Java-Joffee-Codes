package array;

public class A2_modifyarr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 };
        arr[arr.length - 1] = 5;
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
