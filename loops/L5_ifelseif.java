package loops;

public class L5_ifelseif {
    public static void main(String[] args) {
        int num = 21;
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0)
                System.out.println("Even");
            else if (i % 5 == 0)
                System.out.println("Divisible by 5");
            else
                System.out.println("Odd");
        }
    }
}
