package constructor;
//[ 김찬영  2023-07-21 오후 12:48:14 ]

import static java.lang.Math.random; //이안에 Math.random 기능이 있다는 거임.
import static java.lang.Math.pow; // 스테틱만 이렇게 쓸수있다.
import static java.lang.String.format;
import static java.lang.System.out;

import java.util.Random; // 스테틱이 아니다.

public class ImportStatic { //[ 김찬영  2023-07-21 오전 11:42:01 ]
	public static void main(String[] args) {
		out.println(random());
		out.println((int)(random() * 26) + 65); // 65 ~90 사이의 난수
		out.println((char)(random() * 26 + 65)); //  숫자 65 아스키코드로 => A /  숫자 90 아스키코드로 => Z 
		out.println(pow(3, 4)); // 3의 4승.
		out.println(format("%.2f", 12.567)); // 12.57    2째 자리까지 나타내. 그전에꺼 반올림.
		
		out.println((int)(Math.random()*100)); // 이러면 0~99 사이에 값이 나온다. 100안나온다. 
		System.out.println("========================================");
		Random r = new Random();
		System.out.println(r.nextDouble()); // 0<=난수<1
		System.out.println(r.nextInt()); // 정수형만 나온다. 
		System.out.println(r.nextInt(100)); // 쌍둥이 오버로드. 0~99까지나옴.
		System.out.println(r.nextInt(100) + 1); //  1~100
	}
	
	
}

/*
난수 ?
컴퓨터가 불규칙하게 발생하는 수
0 <= 난수 < 1
 x ~ y 사이의 난수
 (int)(Math.random() * ( y - x + 1) ) + x;
*/
 