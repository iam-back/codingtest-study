package programmers.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의_표현 {

    public static int getExpression(int number){

        int result = 1;
        int header = 1;

        while(header<=number/2){
            int start = header;
            int rest = number;
            while(rest-start>=0){
                rest-=start;
                start++;
            }

            if(rest==0)
                result++;

            header++;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());

        System.out.println(getExpression(number));
    }
}
