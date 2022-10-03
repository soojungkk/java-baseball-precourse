package baseball;

import camp.nextstep.edu.missionutils.Console;

/**
 *
 */
public class BaseballGame {

    public boolean start(){

        while(true){

            String inputData = readInputData();

            //inputno 이 3자리인지 아닌지 유효성체크
            //System.out.println(inputData + "유효성체크..");

            //난수와 비교

            //결과출력

            //재시작 여부 체크

        }

    }

    private String readInputData() {
        System.out.println("숫자를 입력해주세요 : ");
        return Console.readLine();
    }
}
