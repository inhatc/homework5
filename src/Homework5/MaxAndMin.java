package Homework5;

import java.util.Scanner;

/**
 * Created by Ryuilhan on 2016. 10. 7..
 */
public class MaxAndMin {
    void MAM() {
        Scanner scData = new Scanner(System.in);
        String strData = "";
        int min = 100;
        int max = 0;
        while (true){
            System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
            try {
                strData = scData.next().trim().toLowerCase();
                int iData = Integer.parseInt(strData);
                if(iData>=0 && iData<=100)
                {
                    if(min>iData){ min = iData; }
                    else if(max<iData){ max = iData; }
                }
                else if(iData<0 || iData>100){ System.out.println("범위초과입니다"); }
            }catch (NumberFormatException e){
                if("q".equals(strData)){ System.out.println("max : "+max+" min : "+ min); new ExamForWhile().start(); break; }
                else { System.out.println("입력값 확인"); }
            }


        }
    }
}



//System.out.print("0~100사이의 숫자를 입력(Q:종료) >> ");
//System.out.println("최대값 :  최소값 : ");