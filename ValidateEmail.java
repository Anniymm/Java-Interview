// Create a method isValidEmail(String email) that returns true if the email is valid according to the rules, and false otherwise.
// Validation Steps in the Method:
// Check if the email contains exactly one '@'.
// Ensure there are characters before and after the '@'.
// Verify there is at least one '.' after the '@'.
// Check that the '.' is not the first or last character after the '@'.
// Ensure there are no spaces in the email.

// Output:
// Print whether the entered email is valid or not.

import java.util.Scanner;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the email to validate");
        String email = scanner.nextLine();

        if (isValidEmail(email)){
            System.out.println("Valid");

        }else{
            System.out.println("Invalid");
        }
        scanner.close();

    }
    
    public static boolean isValidEmail(String email){
        // Check if the email contains exactly one '@'.
        int atSymbolCount = 0;
        for (int i = 0; i < email.length(); i ++){
            if(email.charAt(i) == '@'){
                atSymbolCount ++;
            }
        }
        if(atSymbolCount != 1){
            return false;
        }

        // characters before and after the @ 
        int indexofMark = email.indexOf('@');
        if(indexofMark == 0 || indexofMark == email.length() - 1){
            return false;
        }


        // verify there is at least one '.' after the '@'.
        String part = email.substring(indexofMark + 1);
        if (!part.contains(".")){
            return false;
        }

        // Check that the '.' is not the first or last character after the '@'.
        int dotIndex = part.indexOf(".");
        if (dotIndex == 0 || dotIndex == part.length() - 1){
            return false;
        }

        // if contains the spaces 
        if (email.contains(" ")){
            return false;
        }

        return true;

    }

    
}
