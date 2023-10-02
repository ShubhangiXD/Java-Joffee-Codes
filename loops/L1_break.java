package loops;

public class L1_break {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            //loop breaks when i = 5
            if (i == 5)
                break;
            System.out.println(i);
        }
    }
}
