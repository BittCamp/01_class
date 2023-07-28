package constructor;

import java.util.Scanner;

//[ 김찬영  2023-07-21 오후 04:17:03 ]
//숙제
public class ExamMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exam ex = new Exam();
		System.out.println("인원수 입력");
		int num = scan.nextInt();
		for(int i =0; i<num; i++) {
			Exam[] ar = new Exam[num];
			
			System.out.println("이름입력");
			String name = scan.next();
			System.out.println("답입력입력");
			String answer = scan.next();
			
			
		}
				



		System.out.println("이름\t 1 \t 2 \t 3 \t 4 \t 5 \t 점수");
		}
}

