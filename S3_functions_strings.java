public class S3_functions_strings {
    public static void main(String[] args) {
        String str = "Hello World ";
        System.out.println(str.length()); //length of string
        System.out.println(str.charAt(0)); //character at index 0
        System.out.println(str.substring(0, 5)); //substring from index 0 to 4
        System.out.println(str.substring(6)); //substring from index 6 to end
        System.out.println(str.indexOf('o')); //index of first occurrence of 'o'
        System.out.println(str.lastIndexOf('o')); //index of last occurrence of 'o'
        System.out.println(str.replace('o', 'a')); //replace all 'o' with 'a'
        System.out.println(str.toUpperCase()); //convert to uppercase
        System.out.println(str.toLowerCase()); //convert to lowercase
        System.out.println(str.trim()); //remove leading and trailing spaces
        System.out.println(str.concat("Java")); //concatenate
        System.out.println(str.contains("World")); //check if string contains "World"
        System.out.println(str.equals("Hello World")); //check if string is equal to "Hello World"
        System.out.println(str.equalsIgnoreCase("hello world")); //check if string is equal to "hello world"
        System.out.println(str.startsWith("Hello")); //check if string starts with "Hello"
        System.out.println(str.endsWith("World")); //check if string ends with "World"
        System.out.println(str.isEmpty()); //check if string is empty
        System.out.println(str.toCharArray()); //convert string to character array
        System.out.println(str.toCharArray()[0]); //convert string to character array and print character at index 0
        System.out.println(str.split(" ")[0]); //split string into array of substrings and print substring at index 0
    }
}
