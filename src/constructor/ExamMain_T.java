package constructor;

import java.util.Scanner;

public class ExamMain_T {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("인원수 입력: ");
        int count = scan.nextInt();
        System.out.println();
        
        Exam_T[] ar = new Exam_T[count];//객체배열
        
        for( int i =0; i<count; i++) {
        	ar[i] = new Exam_T();
        	ar[i].compare();
        	System.out.println(); // 가독성위해서.
        }
        System.out.println("\n이름\t1 2 3 4 5\t점수");
        for(int i =0; i < count; i++) {
        	System.out.print(ar[i].getName()+"\t");
        	
        	for( int j= 0; j < ar[i].getOx().length; j++) {
        		System.out.print(ar[i].getOx()[j]+" ");
        	}// for
        	
        	System.out.println("\t"+ar[i].getScore());
        }// for i
        
        // 다중 for문 => 시계 10시 1 2 3 4 5 .. 59분 11시 1 2 3 4 5 ... 59분 
        // cgv사이트 좌석배열. 어렵다네.
        // ar[0].name[0] 	 ar[0].ox[0]	 ar[0].ox[1] 	ar[0].ox[2]	 ar[0].ox[3]	 ar[0].ox[4]	 ar[0].score 
        // ar[1].name[1] 	 ar[1].ox[0] 	 ar[1].ox[1] 	ar[1].ox[2]  ar[1].ox[3] 	 ar[1].ox[4] 	 ar[1].score  
        
    }
}
