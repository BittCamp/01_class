package constructor;

public class MemberDTO { 
//[ 김찬영  2023-07-19 오후 04:02:06 ]
	private String name;
	private int age;
	private String phone;
	private String address;
	
	/// 생성자 생성.
	public MemberDTO(String name ,int age ,String phone ,String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() { //오브젝트 타입을 가지고있다. 게터안쓰고 tostring으로 결과괎을 찍어냄.
		return name+"\t"+age+"\t"+phone+"\t"+address;
	}


}

//Data Transfer Object ==> DTO // 데이터를 이동시키는 객체 클래스데이터 한번에 넘기는게 아니라 한번에 묶어서보낸다.
// 펜 줘 1개1개 1개 주는게 아니라,,, 한꺼번에 팬줘! 그래서 쓰는거.
//MemberVO (Value Object) // 값들의 집합체