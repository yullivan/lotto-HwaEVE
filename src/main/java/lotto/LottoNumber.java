package lotto;

import java.util.Random;

public class LottoNumber {
    // Random 객체를 클래스 변수로 생성하여 모든 메서드에서 공유
    private static final Random lottoNumber = new Random();

    // 메서드로 로또 번호 하나 생성
    public static int RandomLottoNumber() {
        return lottoNumber.nextInt(45) + 1;  // 1부터 45까지 랜덤 번호 생성
    }
}