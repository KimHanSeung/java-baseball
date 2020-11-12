import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Pitcher {

    public String selectNumber() {
        StringBuffer sb = new StringBuffer();
        List<Integer> initNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // 0~8까지 랜덤 숫자
        Random random = new Random();
        int ran = random.nextInt(9);
        sb.append(initNumber.get(ran));
        initNumber.remove(ran);

        ran = random.nextInt(8);
        sb.append(initNumber.get(ran));
        initNumber.remove(ran);

        ran = random.nextInt(7);
        sb.append(initNumber.get(ran));

        return sb.toString();
    }

}
