import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("The string after changing the case is: " + changeCase(str));

 
        System.out.println("The string after reversing is: " + reverseString(str));

    
        System.out.print("Enter the second string for comparison: ");
        String str2 = sc.nextLine();
        System.out.println("The difference between ASCII values is: " + compareStrings(str, str2));

        
        System.out.print("Enter the string to be inserted into the first string: ");
        String strInsert = sc.nextLine();
        System.out.println("The string after insertion is: " + insertString(str, strInsert));

    
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

       
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        findCharacterPosition(str, ch);

        System.out.println("Entered string is " + (isPalindrome(str) ? "a palindrome" : "not a palindrome"));

        countWordsVowelsConsonants(str);

        sc.close();
    }

    public static String changeCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                sb.append(Character.toLowerCase(ch));
            else
                sb.append(Character.toUpperCase(ch));
        }
        return sb.toString();
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int compareStrings(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public static String insertString(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static void findCharacterPosition(String str, char ch) {
        int index = str.indexOf(ch);
        if (index != -1)
            System.out.println("Position of character entered: " + index);
        else
            System.out.println("Entered character which is not present");
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverseString(str));
    }

    public static void countWordsVowelsConsonants(String str) {
        String[] words = str.split("\\s+");
        int vowels = 0, consonants = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) vowels++;
            else if (Character.isLetter(ch)) consonants++;
        }
        System.out.println("No. of Words: " + words.length);
        System.out.println("No. of Vowels: " + vowels);
        System.out.println("No. of Consonants: " + consonants);
    }
}
