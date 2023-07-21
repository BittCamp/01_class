package class_;

class Person{ //[ 김찬영  2023-07-18 오후 03:54:18 ]
	private String name; // 필드 ( 클래스밑에 있는 애들 ) , 초기화 null
	private int age; //필드, 초기화(0) 프라이빗은 내 클래스 안에 있는 애들만 접근가능함. 얘네들 접근하게 하려면...
					// set , get 메소드가 필요하다. setter , getter
					// is메소드명( 참 아니면 거짓 출력됨.
	public void setName(String n){ // 리턴없다. void. public 외부에서접근
		name = n; //홍길동이란 데이터를 n한테 주면  너가 받은걸 name 으로 넘겨라.
	} 
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setData(String n,int a) { // 쌍둥이. 똑같이생겼지만성격이다름. overload
		name = n;
		age = a;
	}
	public void setData() {}	// 초기화 해주는 역할로 하나 써준것이다.  쌍둥이. 오버로딩해도됨.
		
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}

public class PersonMain {
	public static void main(String[] args) {
		Person aa = new Person(); //Person 클래스의 주소를 가지고 있다. 객체라고한다.
		aa.setName("홍길동"); // 호출 
		aa.setAge(25);
		
		System.out.println("객체 aa = "+ aa);
		System.out.println(aa.getName() +"\t"+ aa.getAge());
		System.out.println();
		// 자바 파일은 하나지만 , 클래스 파일은 두개다.위치 한곳.
		// 데이터를 보이게 하면 안된다. 망가지니까. 클래스의 모든데이터는 캡슐화 해야된다. 데이터 프라이빗화.
		
		Person bb = new Person();
		bb.setName("라이언");
		bb.setAge(30);
		System.out.println("객체 bb = "+ bb);
		System.out.println(bb.getName() +"\t"+ bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		cc.setData("코난",35);
		System.out.println("객체 cc = "+ cc);
		System.out.println(cc.getName() +"\t"+ cc.getAge());
		
		Person dd = new Person();
		dd.setData();
		System.out.println("객체 dd = "+ dd);
		System.out.println(dd.getName() +"\t"+ dd.getAge());
		System.out.println();
	}
}
