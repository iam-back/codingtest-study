package programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class 정수_내림차순으로_배열하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(bufferedReader.readLine());
        long[] longArr = Stream.of(String.valueOf(number).split("")).mapToLong(Long::parseLong).toArray();
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(longArr);

        System.out.println(Arrays.toString(longArr));

        for(int index = longArr.length-1; index >= 0;index--){
            stringBuilder.append(longArr[index]);
        }

        long result = Long.parseLong(stringBuilder.toString());

        System.out.println(result);


    }
}
