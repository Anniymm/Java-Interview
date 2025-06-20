
import java.util.*;

public class RandomLottery {
    public List<String> pickWinners(List<String> partipicants, int k){
        if(partipicants == null || k <= 0 ||k > partipicants.size()){
            throw new IllegalArgumentException("something went wrong");
            
        }

        List<String> shuffList = new ArrayList<>(partipicants);
        Collections.shuffle(shuffList, new Random());
        // Return the first 'k' elements from the shuffled list as the winners
        return shuffList.subList(0, k);

    }

    public static void main(String[] args){
        List<String> participants = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        RandomLottery picker = new RandomLottery();

        List<String> winners = picker.pickWinners(participants, 3);
        System.out.println("Winners: " + winners);
    }
}



