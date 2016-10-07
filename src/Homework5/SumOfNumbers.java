package Homework5;
import java.util.*;
/**
 * Created by Ryuilhan on 2016. 10. 7..
 */
public class SumOfNumbers {
    void sumOfNum() {
        Scanner scData = new Scanner(System.in);
        System.out.print("마지막 수를 입력(Q:종료) >> ");
        String strData = scData.next();
        int iData = 0;

        try {
        if (strData.equals("q") || strData.equals("Q")) {
            new ExamForWhile().start();
        } else {
            int temp = 0;
            for(int i=0; i<Integer.parseInt(strData); i++){
                temp += i;
            }
            System.out.println("총 합은 " + temp);
            new ExamForWhile().start();
        }
        }catch (java.lang.NumberFormatException e){ System.out.println("정확히 입력하세요."); new SumOfNumbers().sumOfNum(); }
    }
}
