import java.util.Scanner;

class Harshad{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = scanner.nextInt();

        String numberStr = String.valueOf(number); 
        int sumDigit = 0;

        for( int i = 0; i < numberStr.length(); i++){
            char charr = numberStr.charAt(i);
            int digit = Character.getNumericValue(charr);
            sumDigit += digit;

        }
        // System.out.println(sumDigit);
        if(number % sumDigit == 0){
            System.out.println("Harshad");
        }else{
            System.out.println("not Harshad");
        }
    }
}