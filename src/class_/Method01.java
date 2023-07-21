package class_;


public class Method01 {//[ 김찬영  2023-07-18 오후 03:54:29 ]
	
	
	public static void disp() { //구현
		System.out.println("static method..."); // 자바가 아는건 메인밖에 없어서.이렇게만쓰면 아무것도 안나옴.
	}
	
	public void output() { //구현
		System.out.println("non-static method..."); 
	}
	
	public static void main(String[] args) {
		//static붙어서 new 할필요없다.
		Method01.disp(); // 호출. 호출해서 왔다갔다 해야해서. 호출 시간이 비교적 길다.
		//new Method01();// 이렇게 지정하면 일회용이다. 
		Method01 m = new Method01();   // m은 객체다. 스테틱안닌건 이렇게 호출해라.
		m.output();
	}
	
	

}
