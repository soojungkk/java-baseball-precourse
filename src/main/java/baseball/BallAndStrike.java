package baseball;

import java.util.List;
import java.util.Objects;

public class BallAndStrike {
    public static Answer check(List<Integer> answer, List<Integer> input) {
        Answer score = new Answer(0,0);
        score.setBall(countBall(answer,input));
        score.setStrike(countStrike(answer,input));

        return score;
    }

    private static int countStrike(List<Integer> answer, List<Integer> input) {
        int strike = 0;
        for(int i =0; i<answer.size();i++){
            if(Objects.equals(answer.get(i), input.get(i))){
                strike++;
            }
        }
        return strike;
    }

    private static int countBall(List<Integer> answer, List<Integer> input) {
        int ball = 0;
        for(int no : input){
            if(answer.contains(no)){
                ball++;
            }
        }
        return ball;
    }
}
