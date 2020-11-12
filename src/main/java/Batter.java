import java.util.Scanner;

public class Batter {

    private String number;

    public void inputNumber(){
        System.out.print("숫자를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        this.number = scanner.next();
    }

    public String getNumber() {
        return number;
    }
}
