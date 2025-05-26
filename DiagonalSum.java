import java.util.Scanner;

public class DiagonalSum{
    public static void main(String[] args) {
        Scanner dimension = new Scanner(System.in);
        System.out.println("enter the dimension for row and columns ");
        int n = dimension.nextInt();
        
        int[][] mat = new int[n][n];
        
        
        for(int i=0; i<n; i ++){
            for(int j=0; j < n; j ++){
                System.out.println("enter the number to insert ");
                mat[i][j] = dimension.nextInt();
            }
        }
        
        System.out.println("The matrix is:");
        for(int[] list: mat){
            for(int num: list){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        int sum = 0;
        for(int i = 0; i < n; i ++){
            sum += mat[i][i];
        }
        
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += mat[i][n - 1 - i]; 
        }
        int result = sum + sum2;
        System.out.printf("the sum is %d", result);
        dimension.close();
    }
}