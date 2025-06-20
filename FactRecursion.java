import java.util.Scanner;

public class FactRecursion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number " );
        int result = scanner.nextInt();
        System.out.println("FActorial is " + Fibonachi(result));

        scanner.close();
    }

    public static int Fibonachi(int n){
        if (n == 0){
            return 1;
        }
        return n * Fibonachi(n - 1);

    }
}
