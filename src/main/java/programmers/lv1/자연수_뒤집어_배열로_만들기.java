package programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class 자연수_뒤집어_배열로_만들기 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        int[] intArr = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
        int[] reversedArr = new int[intArr.length];
        int j = 0;
        Arrays.sort(intArr);

        System.out.println(Arrays.toString(intArr));

        //기준값을 증감시켜야 함
        for(int i = intArr.length - 1 - j ; j <= intArr.length - 1 ; j++){
            reversedArr[j] = intArr[i];
        }

        System.out.println(Arrays.toString(reversedArr));


    }
}
