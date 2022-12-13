package programmers.lv2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 올바른_괄호 {

    public static Boolean isCorrectBracket(char[] c,int size){

        int counter = 0;

        if(c[0]==')'||c[size-1]=='(')
            return false;
        for(char character : c){
            if(counter<0)
                return false;
            if(character=='(')
                counter++;
            else counter--;
        }

        return counter==0;
    }

    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int size = s.length();
        char[] charArr = new char[s.length()];

        s.getChars(0,s.length(),charArr,0);

        System.out.println(isCorrectBracket(charArr,size));
    }
}
