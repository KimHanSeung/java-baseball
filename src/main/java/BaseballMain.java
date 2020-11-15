public class BaseballMain {

    private Pitcher pitcher = new Pitcher();
    private Batter batter = new Batter();
    private Catcher catcher = new Catcher();
    private Umpire umpire = new Umpire();

    public static void main(String[] args) {
        new BaseballMain().playBall();
    }

    private int count = 0;

    public void baseBallInit(){
        catcher.setBallAndStrikeZero();
        count = 0;
    }

    public void playBall(){

        while(true){

            if(count == 0){
                pitcher.selectNumber();
            }
            count++;

            batter.inputNumber();
            catcher.setPitcherNumber(pitcher.getNumber());
            catcher.setBatterNumber(batter.getNumber());

            catcher.equalsBaseBall();

            if(catcher.isThreeStrike()){

                if(umpire.isGameEnd()){
                    break;
                }

                baseBallInit();
                continue;
            }

            catcher.printBaseBall();

        }

    }
}
