package class_;

import java.util.Scanner;

public class StringMain2 {
    public static void main(String[] args) {
        String original, current, change, result;
        int extraction;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 문자를 입력하세요!");
        original = sc.next();
        System.out.println("2. 변경할 문자를 입력하세요!");
        current = sc.next();
        System.out.println("3. 바꿀 입력하세요!");
        change = sc.next();
        if(   original.length()<current.length()
           || original.length()<change.length()
           || current.length()!=change.length()
           ) {
        	System.out.println("입력한 문자열의 크기가 작습니다.\n치환 할 수 없습니다");
        }else {
            result = original.replace(current, change);
            result = result.toLowerCase();
            System.out.println("치환결과: " + result);
            
            extraction = original.indexOf(current);
            int length = current.length();
            System.out.println("추출한 문자열 위치 : "+extraction);
            System.out.println("문자열 길이" +length);
            int count = 0;
            while (extraction != -1) {
                count++;
                extraction = original.indexOf(current, extraction + length);
            }
            System.out.println("'" + current + "'가 등장하는 횟수: " + count);
            System.out.println(count+"번 치환");
        }

    }
}