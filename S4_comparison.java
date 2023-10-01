public class S4_comparison {
    public static void main(String[] args) {
        
        /* String str1 = new String(str);
        String str2 = "KIIT University"; */

        // * == is used for address comparison
       /*  System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str==str2); */

        // * .equals() is used for content comparison
        /* System.out.println(str.equals(str1));
        System.out.println(str1.equals(str2));
        System.out.println(str.equals(str2)); */
        String str = "KIIT University";
        String str3 = "kiit University";
        System.out.println(str3.compareTo(str));
    }
}
