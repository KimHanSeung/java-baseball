import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Pitcher {

    public String selectNumber() {
        StringBuffer sb = new StringBuffer();
        List<Integer> initNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Random random = new Random();
        int bound = 9;
        for(int i=0; i<3; i++){
            int ran = random.nextInt(bound);
            sb.append(initNumber.get(ran));
            initNumber.remove(ran);
            bound--;
        }

        return sb.toString();
    }

}
