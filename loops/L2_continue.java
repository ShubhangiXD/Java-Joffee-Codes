package loops;

public class L2_continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            // values between 4 and 9 will be skipped but 4 and 9 will be printed (think about why)
            if (i > 4 && i < 9)
                continue;
            System.out.println(i);
        }
    }
}
