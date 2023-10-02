package strings;
public class S5_AssignmentCW {
    // write a program to convert all uppercase to lowercase characters and
    // print the string
    public static void main(String[] args) {
        String str = "Hello World"; // output should be hello world
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>'A' && str.charAt(i)<'Z')
            str = str.replace(str.charAt(i), Character.toLowerCase(str.charAt(i)));
        }
        System.out.println(str);
    }
}
