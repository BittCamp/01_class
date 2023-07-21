package class_;

public class Variable { ///[ 김찬영  2023-07-18 오후 03:54:32 ]
	
	static int b; // 이렇게 전역변수 쓸수도 있다. 필드 , 초기화 
	static double c; 
	// 기본값은 0을 가지고 있다.
	int d;
	public static void main(String[] args) {
		//[ 김찬영  2023-07-18 오후 12:31:21 ]
		// 지역변수 ( local variable )
		short a = 65; // 정수형 2바이트 65값을 집어넣어라. 65이진수는 이거지만 0100 0001 
		// short 0000 0000 0100 0001 16비트의 공간을 잡고간다.
		int b = 65;
		// int 0000 0000 0000 0000 0000 0000 0100 
		System.out.println("지역변수 a = "+ a);
		System.out.println("지역변수 b = "+ b);
		
		System.out.println("필드 b = "+  Variable.b); //클래스의 b 변수 0 값을 출력
		  											// 스테틱으로 잡혀있어서 클래스명 바로 쓸수있음.
		System.out.println("필드 c = "+  c);
		//System.out.println("필드 d = "+  new Variable().d); // 스테틱이 아니라서 new 로 선언하고 
														  // .d 변수명 썼다.
		
		Variable v = new Variable(); // 생성.
		// heap => 이름 X
		
		// 주소( 클래스명@16진수
		System.out.println("객체 v = "+ v); //  클래스명@주소값
		System.out.println("필드 c = "+ v.d);
		
		//heap ==> 이름 X
	}
}
