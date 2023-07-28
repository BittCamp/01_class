package constructor;
//[ 김찬영  2023-07-19 오후 04:02:18 ]
public class ConstructorMain {
	private String name; // null 디폴트
	private int age; // 0 디폴트
	
	public ConstructorMain() {
		System.out.println("기본생성자");
	}

	public ConstructorMain(String name) {
		this();// 기본생성자 호출 
		this.name = name;
	}
	public ConstructorMain(int age) {
		this("어피치");//Overload된 다른생성자 호출 <===ConstructorMain(String name)
		this.age = age;
	}



	public static void main(String[] args) {
		ConstructorMain aa = new ConstructorMain();
		System.out.println(aa.name + "\t"+ aa.age);
		System.out.println("--------------------");
		
		ConstructorMain bb = new ConstructorMain("홍길동");
		System.out.println(bb.name + "\t"+bb.age);
		System.out.println("--------------------");
		
		ConstructorMain cc = new ConstructorMain(25);
		System.out.println(cc.name + "\t"+cc.age);
		System.out.println("--------------------");
		
	}
}
