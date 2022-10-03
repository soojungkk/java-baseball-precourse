package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class BaseballGame {

    public boolean start(){
        List<Integer> answerNumbers = new ArrayList<>();
        //랜덤3자리를 발생시킨다.
        answerNumbers = RandomUtils.makeAnswerNumbers();
        System.out.println(">>>> : "+answerNumbers.toString());
        while(true){

            //데이터를 입력받는다.
            String inputData = readInputData();

            //inputData 유효성체크
            if(!CheckValidation.sizeCheck(inputData) || !CheckValidation.isNumeric(inputData)) {
                //잘못된 값이 들어오면 IllegalArgumentException 하고 전체종료한다.
                throw new IllegalArgumentException();
            }

            //볼스트라이크여부를 판단

            //결과출력

            //재시작 여부 체크

        }

    }

    private String readInputData() {
        System.out.print("숫자를 입력해주세요 : ");
        return Console.readLine();
    }
}
