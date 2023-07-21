package constructor;

//[ 김찬영  2023-07-20 오전 10:15:05 ]
class StaticTest{
	private int a; // 클래스 바로 밑에 있는걸 필드라고 한다. 인스턴스변수 <=new 안하면 못쓴다.뭉뚱그려서 필드라쓰면됨.
	private static int b; // 필드. 얘는 클래스변수 <== static이기 때문에
	
	static { // 맨첨 실행하자마자 메모리에 잡고들어간다. static부터 실행된다.
		System.out.println("static 초기화 영역");
		b = 10;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자");
		a = 10;
	}//생성자: 내가 갖고 싶은걸 초기화 할려고 씀 
	
	public void calc(){
		a++;
		b++;
	}
	public void disp(){
		System.out.println("a= "+ this.a+" b= "+ StaticTest.b); // a 앞에this가 생략됨. b앞에는 클래스명이 빠져있다..
		//System.out.println("a= "+ a+" b= "+ b);
		}
	public static void output(){
		System.out.println("\n기본메소드");
		//System.out.println("a= "+ this.a+" b= "+ b); // 스테틱안에서는 this.쓸수가 없다.
	}

}
public class StaticMain {
	public static void main(String[] args) { // new 3번 썼어서 생성자 3번호출됨.
		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp();
		
		System.out.println("==============");
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		
		System.out.println("==============");
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		
		StaticTest.output(); // 클래스명이 와서 클래스명.메소드명()으로 부를수도 있고
		aa.output(); // 객체.메소드명() 이렇게 해도 쓸수있다.
		
	}
}// class StaticMain
