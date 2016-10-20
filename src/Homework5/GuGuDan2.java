package Homework5;

import java.util.Scanner;

/**
 * Created by Ryuilhan on 2016. 10. 7..
 */
public class GuGuDan2 {
    void GGD2(){
        String strData = "";
        Scanner scData = new Scanner(System.in);
        while (true){
            System.out.print("짝수단 : E 홀수단 : O (종료는 : Q)");
            strData = scData.next().trim().toLowerCase();
            if("e".equals(strData)){
                    for(int j=1; j<=9; j++){
                        System.out.print(2+"*"+j+"="+2*j+"\t"+
                                        4+"*"+j+"="+4*j+"\t"+
                                        6+"*"+j+"="+6*j+"\t"+
                                        8+"*"+j+"="+8*j+"\t"+"\n");
                    }
            }
            else if("o".equals(strData)){
                    for(int j=1; j<=9; j++){
                        System.out.print(1+"*"+j+"="+1*j+"\t"+
                                3+"*"+j+"="+3*j+"\t"+
                                5+"*"+j+"="+5*j+"\t"+
                                7+"*"+j+"="+7*j+"\t"+
                                9+"*"+j+"="+9*j+"\n");
                    }
            }
            else if("q".equals(strData)){ new ExamForWhile().start(); }
            else { System.out.println("입력값 확인하세요."); }
        }
    }
}
