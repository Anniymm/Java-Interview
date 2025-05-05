import java.util.Scanner;
import java.lang.StringBuilder;

class StringReverser{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input to reverse ");
        String input = scanner.next();
        System.out.println(reverse(input));
        scanner.close();
    }

    public static String reverse(String inputi){
        if (inputi == null || inputi.trim().isEmpty()) {
            throw new IllegalArgumentException("Input must not be empty or blank");
        }
            
        StringBuilder output = new StringBuilder();
        char[] chars = inputi.toCharArray();

        for(int i = chars.length - 1; i >= 0;  i --){
            output.append(chars[i]);
        }
        return output.toString();
        
    }
}