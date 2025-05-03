import java.util.Scanner;
// anu sheiyvans odenobas da imdeni unda dabechdos sequenceshi
public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci sequence terms: ");
        int number = scanner.nextInt();

        int firstNum = 0, secondNum = 1;

        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (number == 1) {
            System.out.print(firstNum);
        } else {
            System.out.print(firstNum + " " + secondNum);
            for (int i = 0; i < number - 2; i++) {
                int nextNum = firstNum + secondNum;
                System.out.print(" " + nextNum);
                firstNum = secondNum;
                secondNum = nextNum;
            }
        }
    }
}
