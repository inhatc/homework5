package Homework5;
import java.util.*;
/**
 * Created by Ryuilhan on 2016. 10. 7..
 */
public class SumOfNumbers {
    void sumOfNum() {
        Scanner scData = new Scanner(System.in);
        while (true) {
            System.out.print("마지막 수를 입력(Q:종료) >> ");
            String strData = scData.next();
            int temp = 0;

            try {
                 if (Integer.parseInt(strData) >= 0) {
                    for (int i = 0; i <= Integer.parseInt(strData); i++) {
                        temp += i;
                        }
                 }  else if (Integer.parseInt(strData) < 0) {
                        for (int i = 0; i >= Integer.parseInt(strData); i--) {
                        temp += i;
                        }
                    }
                System.out.println("총 합은 " + temp);
            } catch (java.lang.NumberFormatException e) {
                System.out.println("정확히 입력하세요.");
                if (strData.equals("q") || strData.equals("Q")) {
                    new ExamForWhile().start();
                }
            }
        }
    }
}
