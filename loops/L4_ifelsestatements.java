package loops;

public class L4_ifelsestatements {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                System.out.println("The number is even.");
            else
                System.out.println("The number is odd.");
        }
    }
}
