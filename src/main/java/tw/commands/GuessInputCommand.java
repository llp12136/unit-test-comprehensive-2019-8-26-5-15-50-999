package tw.commands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jxzhong on 2017/5/19.
 */
public class GuessInputCommand {

    private BufferedReader bufferedReader;

    public GuessInputCommand() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String input() throws IOException {
        System.out.println("------Please input your answer as x x x x , x <10 ------");
        return bufferedReader.readLine();
    }
    public String guessNumber(String  input,String answer){
       // String[] answer = {"1","2","3","4"};
        int countA=0,countB=0;
        List<String > answerList = Arrays.asList(answer.split(""));
        List<String > inputList = Arrays.asList(input.split(" "));
        for(String number:inputList){
            //统计相同的数字
            if(answerList.contains(number)){
                countB++;
                //统计位置相同的数字
                if(answerList.indexOf(number) ==inputList.indexOf(number)){
                     countA++;
                     countB--;
                }

            }
        }
        return countA+"A"+countB+"B";
    }
}
