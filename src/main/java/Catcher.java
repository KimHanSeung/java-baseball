public class Catcher {

    private String batterNumber;

    private String pitcherNumber;

    private int ball;

    private int strike;

    public void setBatterNumber(String batterNumber) {
        this.batterNumber = batterNumber;
    }

    public void setPitcherNumber(String pitcherNumber) {
        this.pitcherNumber = pitcherNumber;
    }

    private boolean isAllStrike(){
        return this.batterNumber.equals(this.pitcherNumber);
    }

    public boolean isThreeStrike() {
        return this.strike == 3;
    }


    public void setBallAndStrikeZero(){
        this.ball = 0;
        this.strike = 0;
    }

    public int sumBall(){
        return this.ball + this.strike;
    }

    public void printBaseBall(){
        if(sumBall() > 0){
            if(this.strike > 0 ){
                System.out.print(this.strike + "스트라이크");
            }
            if(this.ball > 0 ){
                System.out.print(this.ball + "볼");
            }
            System.out.println();
            return;
        }
        System.out.println("낫싱");
    }

    public void equalsBaseBall() {

        setBallAndStrikeZero();

        if (isAllStrike()) {
            this.strike = 3;
            return;
        }

        equalsStrikeOrBall();
    }

    private void equalsStrikeOrBall(){
        String batterArray[] = this.batterNumber.split("");
        String pitcherArray[] = this.pitcherNumber.split("");

        for(int i=0; i<batterArray.length; i++){
            for(int j=0; j<pitcherArray.length; j++){
                if(batterArray[i].equals(pitcherArray[j])){
                    if(i == j){
                        this.strike++;
                        break;
                    }
                    this.ball++;
                    break;
                }
            }
        }
    }

}
