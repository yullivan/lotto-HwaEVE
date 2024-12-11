package lotto;

import java.util.Scanner;

public class Money {
    private int amount;  // 금액을 저장할 변수

    // 생성자: 금액을 받는 생성자
    public Money(int amount) {
        this.amount = amount;
    }

    // 1000원 단위로만 입력받는 메서드
    public static Money inputMoney() {
        Scanner scanner = new Scanner(System.in);
        int amount;

        // 1000원 단위로 입력받을 때까지 반복
        while (true) {
            System.out.print("입금할 돈을 1000원 단위로 입력하세요: ");
            amount = scanner.nextInt();

            if (amount % 1000 == 0) {
                break;  // 1000원 단위로 입력되면 반복 종료
            } else {
                System.out.println("입력한 금액은 1000원 단위여야 합니다. 다시 입력해주세요.");
            }
        }

        return new Money(amount);  // 금액을 받아 Money 객체 생성하여 반환
    }
}