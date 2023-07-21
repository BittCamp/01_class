package class_;

import java.util.Scanner;

public class StringMain2_T {//[ 김찬영  2023-07-21 오전 10:35:27 ]
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("문자열 입력 : ");
    	String original = scan.next();
    	
    	System.out.println("현재 문자열 입력 : ");
    	String current = scan.next();
    	
    	System.out.println("바꿀 문자열 입력 : ");
    	String change = scan.next();
    	
    	if(original.length() < current.length()) {
    		System.out.println("입력한 문자열의크기가 작습니다.");
    		System.out.println("치환 할 수 없습니다.");
    		// System.exit(0) 프로그램 강제 종료
    		return; // 메소드를 벗어나라
    	}
    	
    	original = original.toLowerCase();
    	current = current.toLowerCase();
    	
    	int index = 0;
    	int count = 0;
    	
    	while( ( index = original.indexOf(current,index)) != -1) {
    		index = index +2;
    		count++;
    	} //while
    	
    	System.out.println(original.replace(current, change));
    	System.out.println(count + "번 치환");
    	
    	
    	
    }
}