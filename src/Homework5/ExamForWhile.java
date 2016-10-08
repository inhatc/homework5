package Homework5;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by Ryuilhan on 2016. 10. 7..
 */
public class ExamForWhile {



    public static void main(String[] args){

        new ExamForWhile().start();
    }

    void start(){
        Scanner scData = new Scanner(System.in);
        System.out.println("1. 1부터 입력한 수까지 더하기");
        System.out.println("2. 최대값/최소값구하기");
        System.out.println("3. 입력받은숫자의 합계와 평균구하기");
        System.out.println("4. 원하는 구구단 출력하기");
        System.out.println("5. 짝수단/홀수단 출력하기");
        System.out.println("6. 종료하기");
        System.out.print("원하는 메뉴는 >>");
        try {
            int iData = scData.nextInt();
            new ExamForWhile().next(iData);
        } catch (InputMismatchException e) {
            System.out.println("입력값 확인");
            this.start();
        }
    }

    void next(int i){
        if(i==1) { new SumOfNumbers().sumOfNum(); }
        else if(i==2) { new MaxAndMin().MAM(); }
        else if(i==3) { new SumAndAvg().SAA(); }
        else if(i==4) { new GuGuDan().GGD(); }
        else if(i==5) { new GuGuDan2().GGD2(); }
        else if(i==6) { System.out.println("종료합니다."); System.exit(0); }
        else { System.out.println("입력값 확인하세요."); }
    }
}
