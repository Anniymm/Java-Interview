import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr){
        Set<Integer> unique = new HashSet<>();
        for (int num: arr){
            unique.add(num);
        }

        int[] result = new int[unique.size()];
        int i = 0;
        for (int num : unique){
            result[i++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1, 2, 2, 3, 4, 4, 5}))); 
        System.out.println(Arrays.toString(removeDuplicates(new int[]{7, 7, 7, 7})));       
        System.out.println(Arrays.toString(removeDuplicates(new int[]{})));                 
     }
}
