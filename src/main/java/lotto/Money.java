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
        int amount = 0;

        // 1000원 단위로 올바른 금액이 입력될 때까지 반복
        while (true) {
            System.out.print("구입금액을 입력해 주세요: ");
            String input = scanner.nextLine();  // 사용자 입력을 문자열로 받음

            // 입력이 숫자인지 확인 (문자열을 정수로 변환)
            if (!isNumeric(input)) {
                System.out.println("잘못된 입력입니다. 숫자만 입력해 주세요.");
            } else {
                amount = Integer.parseInt(input);

                // 금액이 음수인지 확인
                if (amount < 0) {
                    System.out.println("금액은 음수가 될 수 없습니다. 다시 입력해주세요.");
                }
                // 1000원 단위가 아닌 경우
                else if (amount % 1000 != 0) {
                    System.out.println("입력한 금액은 1000원 단위여야 합니다. 다시 입력해주세요.");
                }
                else {
                    break;  // 올바른 금액을 입력하면 반복문 종료
                }
            }
        }
        return new Money(amount);  // 금액을 받아 Money 객체 생성하여 반환
    }

    // 숫자인지 확인하는 메서드 (isNumeric)
    private static boolean isNumeric(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // 금액을 출력하는 메서드
    public void printAmount() {
        System.out.println(amount + "원");
    }

    // 구입한 개수 계산하는 메서드
    public int calculateQuantity() {
        return amount / 1000;  // 1000원 단위로 나누어 구매한 개수 계산
    }

    // 구매한 개수를 출력하는 메서드
    public void printQuantity() {
        int quantity = calculateQuantity();  // 구입한 개수 계산
        System.out.println(quantity + "개를 구매했습니다.");
    }
}