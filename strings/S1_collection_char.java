package strings;
class S1_collection_char {
    public static void main(String[] args) {
        char[] ch = { 'h', 'e', 'l', 'l', 'o' }; //character array
        String str = new String(ch); //character array to string
        System.out.println(str); 
        String s = "hello"; //string
        int lengths = s.length();
        char[] c = s.toCharArray(); //string to char array
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}