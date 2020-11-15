import java.util.Scanner;

public class Umpire {

    private final int END = 2;

    private void printContinue(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
    }

    public boolean isGameEnd() {
        printContinue();
        Scanner scanner = new Scanner(System.in);
        return  END == scanner.nextInt();
    }

}
