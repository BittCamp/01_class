package class_;
//[ 김찬영  2023-07-19 오후 02:42:53 ]		
public class StringMain {  // extends Object 항상 얘가 빠져있다.

	public static void main(String[] args) {
		String a = "apple"; //literal로 생성
		String b = "apple"; // 리터럴은 메모리에 한개밖에 안잡힌다.
		// 둘다 같은 "apple" 주소값을 가지고 있음.
		if( a== b) System.out.println("a와b의 참조값은 같다");
		else System.out.println("a와b의 참조값은 다르다");
		if(a.equals(b)) System.out.println("a와 b가 문자열은 같다.");
		else System.out.println("a와 b의 문자열은 다르다");
		
		System.out.println();
		
		String c = new String("apple"); //new는 메모리에 계속해서 만든다. 그래서 참조값이다름.
		// new 연산자 써서 String 클래스에 apple넣는거.
		String d = new String("apple");
		// 두개가 다른 주소를 나타냄.
		if(c==d)System.out.println("c와d의 참조값은 같다");
		else System.out.println("c와d의 참조값은 다르다");
		if(c.equals(d)) System.out.println("c와 d가 문자열은 같다.");
		else System.out.println("c와 d의 문자열은 다르다"); // 메모리는 다른데 두번 잡혔다는 뜻.
		System.out.println();
		
		String e ="오늘 날짜는 "+ 2023 + 7+ 19;
		//Q) 주소값이 안출력되고 왜 문자열이 출력이 되는지.
		String e1 ="오늘 날짜는 "+ (2023 + 7+ 19);
		System.out.println();
		//"오늘 날짜는 " 
		//"오늘 날짜는 2023"
		//"오늘 날짜는 20237"
		//"오늘 날짜는 2023719"
		// e-->오늘 날짜는 "오늘 날짜는 2023719" 이렇게 4번에 걸쳐서 메모리에 들어가서 속도가 느리다.
		System.out.println(e);
		System.out.println(e1);
		// "오늘 날짜는 "+ 2023 부터 계산. 문자열 + 숫자 = 결합된 문자열 =>>"오늘날짜는2023'
		// 오늘 날짜는 2023719 로 죄다 더한 값이 나온다.
		// 문자열은 편집이안된다. -> 메모리에 4번의 생성이 일어난다.
		// JVM에 의해서 삭제시 Garbage Collector로 보낸다.
		// Garbage Collector 가 실행되면 컴터가멈춘다.(컴터속도가 빨라서 아주잠깐! 멈추는것뿐임)
		
		//배열.length
		//문자열.length()
		System.out.println("문자열의 크기 ="+ e.length());
		//문자열은 주소임. 
		//  문자 'A' 아스키코드65 /문자열 "A" 주소 밖에없어.
		//new 할때 마다 메모리가 계속 생성되지 않게 하는것==> 싱글톤이라고 한다.
		//디비에선 같은 메모리 가져와야지 계속 다른메모리 쓰면안된다. 로그인할때 등등.
		System.out.println();
		System.out.println(e.charAt(0)+"\n");
		System.out.println("================");
		// 문자열의 크기중 0번째 뽑아내기 "오늘 날짜는 2023719" 중 0번째 1개
		
		for(int i=0; i<e.length(); i++) {
			System.out.println(e.charAt(i));
		}
		System.out.println("부분 문자열 추출 = "+ e.substring(5)); //5번부터 다 출력
		System.out.println("부분 문자열 추출 = "+ e.substring(7,11)); // 7번부터 11번 이전 까지( 11번까지가 아니다.)
		
		System.out.println("대문자 변경 = "+"Hello".toUpperCase());
		System.out.println("소문자 변경 = "+"Hello".toLowerCase());
		
		System.out.println("문자열 검색 =" + e.indexOf("짜")); // 짜 글자 들어간 위치를 가져와라.
		System.out.println("문자열 검색 =" + e.indexOf("날짜")); // 해당 글짜가 몇번째에 있나??
		System.out.println("문자열 검색 =" + e.indexOf("개바부")); //-1 없어서 -1이 나옴.
		
		System.out.println("문자열 치환 = "+ e.replace("날짜" ,"일자")); // 날짜를 일자로 변경함.
	}

}
