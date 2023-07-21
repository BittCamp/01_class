package class_;

public class Method02 {//[ 김찬영  2023-07-18 오후 03:54:23 ]
	

	public static void main(String[] args) {
		Method02 m = new Method02();
		
		int s1 = m.sum(25,36); 	// 호출
		System.out.println("합 = "+ s1);
		
		int s2 = m.sub(25,36); 	
		System.out.println("차 = "+ s2);
		
		int s3 = m.mul(25,36); 	
		System.out.println("곱 = "+ s3);
		
		double s4 = m.divide(25,36); 	//  소수점이하까지
		System.out.println("몫 = "+ s4);
		//String result = String.format("%10.3f",s4); // 클래스 다음에 바로온거 static 함수. 10자리중 소수점 이하3자리.앞은빈공간
		
		String result = String.format("%.3f",s4); // 소수점 이하만 맞춰줘라.
		/*
		 * ※ C언어랑 파이썬에 이렇게 쓴다.
		 * 정수형 : %d 
		 * 실수형 : %f
		 * 문자형 %c
		 * 문자열 %s
		 * 16진수 %x
		 */
		System.out.println("몫 소수점이하 3자리까지 나오게 = "+ result); 
	}
	
	public int sum(int x,int y){ ///함수안에 갈호있는거 인수or매개변수라한다. //이렇게 정의하는걸 구현이라 한다.
		return x+y;
	} 
	public int sub(int x,int y){ 
		return x-y;
	} 
	public int mul(int x,int y){ 
		return x*y;
	} 
	public double divide(int x,int y){  // 구현
		return (double)x/y; //강제 형변환 (Cast 연산)
	} 
	// * 호출된 메소드는 반드시 호출한 곳으로 되돌아온다.
	// return 값은 없거나 void 1개뿐이다.(파이썬은 리턴값여러개 된다.)
	
}
