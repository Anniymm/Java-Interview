import java.util.HashMap;

public class NumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1 );
        }

        for (Integer key : countMap.keySet()) {
            System.out.println(key + " → " + countMap.get(key) + " time(s)");
        }

    }
    
}
