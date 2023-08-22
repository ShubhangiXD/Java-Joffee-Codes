import java.util.*;

public class S2_inputs_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.next(); 
        /* String str = sc.nextLine(); */ //difference between nextLine() and next()
        System.out.println(str);
        sc.close();
    }
}
