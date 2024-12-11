package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoNumbers {

    // 로또 번호 묶음 하나를 생성하는 메서드
    public static List<Integer> generateLottoBundle() {
        List<Integer> bundle = new ArrayList<>();

        // 로또 번호 6개를 생성
        while (bundle.size() < 6) {
            int number = LottoNumber.RandomLottoNumber();
            if (!bundle.contains(number)) {  // 중복 번호를 피하기 위해 체크
                bundle.add(number);
            }
        }

        return bundle;
    }
}