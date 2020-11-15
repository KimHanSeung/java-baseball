public class BaseballMain {
    public static void main(String[] args) {
        new BaseballMain().playBall();
    }

    public void playBall(){

        Pitcher pitcher = new Pitcher();
        pitcher.selectNumber();

        Batter batter = new Batter();

        boolean isPlay = true;
        while(isPlay){

            batter.inputNumber();

            String pStr = pitcher.getNumber();
            System.out.println(pStr);

            String bStr = batter.getNumber();
            System.out.println(bStr);

            isPlay = false;

        }

    }
}
