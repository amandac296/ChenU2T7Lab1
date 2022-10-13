import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //user input
        System.out.print("Enter first string: ");
        String word = scan.nextLine();

        System.out.println("String length: " + word.length());

        //first and second half of the string
        int i = word.length();
        System.out.println("First half: " + word.substring(0, i/2));
        System.out.println("Second half: " + word.substring(i/2));

        //user input
        System.out.print("Enter second string: ");
        String word2 = scan.nextLine();

        //comparing the length of the words
        if (word.length()>word2.length()){
            System.out.println(word + " is longer");
        } else if (word.length()>=word2.length()) {
            System.out.println("Both have the same length");
        } else {
            System.out.println(word2 + " is longer");
        }

        //states which string comes first in the alphabet
        if (word.compareTo(word2) > 0) {
            System.out.println(word2 + " is first alphabetically");
        } else if (word.compareTo(word2) < 0) {
            System.out.println(word + " is first alphabetically");
        } else if (word2.equals(word)) {
            System.out.println("Both strings have the same length");
        }

        //states if word2 is in word
        if (word.indexOf(word2) != -1) {
            System.out.println(word2 + " is found in " + word + " at index " + word.indexOf(word2));
        } else {
            System.out.println(word2 + " is NOT found in " + word);
        }

    }
        }
