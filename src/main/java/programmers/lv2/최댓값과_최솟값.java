package programmers.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 최댓값과_최솟값 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        List<String> stringList = new ArrayList<>();

        while(stringTokenizer.hasMoreTokens()){
            stringList.add(stringTokenizer.nextToken());
        }

        int[] intArr = stringList.stream().mapToInt(Integer::parseInt).toArray();

        Arrays.sort(intArr);
        String result = intArr[0] + " " + intArr[intArr.length-1];

        System.out.println(result);
    }
}
