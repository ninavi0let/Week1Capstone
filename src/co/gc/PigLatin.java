package co.gc;

import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) {
        
        
        String contString = "yes";
        
        while (contString.equalsIgnoreCase("yes")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the Pig Translator!");
            System.out.println();
            System.out.println("Please enter a word to be translated:");
            String userInput = scan.nextLine();
            
            System.out.println("Alright, let's translate: " + userInput + ".");
            
            // Position of first vowel
            int firstVowel = 0;
            String beforeVowel = "", afterVowel = "";
            for (int l = 0; l < userInput.length(); l++) {
                char ch = userInput.charAt(l);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    firstVowel = l;
                    break;
                }
            }
            beforeVowel = userInput.substring(0, firstVowel);
            afterVowel = userInput.substring(firstVowel, userInput.length());
            if (firstVowel == 0) {
                System.out.println();
                System.out.println((beforeVowel + afterVowel + "way"));
                System.out.println();
            } else {
                System.out.println();
                System.out.println(afterVowel + beforeVowel + "ay");
                System.out.println();
            }
            System.out.println("Would you like to go again? (yes/no)");
            contString = scan.next();
            
        }
        System.out.println("Bye!");
        
    }
}