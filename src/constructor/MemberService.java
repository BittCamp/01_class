package constructor;

import java.util.Scanner; //java.util 에 있는거 임포트 하겠다.
//[ 김찬영  2023-07-19 오후 04:02:03 ]

public class MemberService  {
	String name,phone,address;
	int age;

	Scanner scan = new Scanner(System.in); // 키보드로 적겠다는뜻  System.in임. 이렇게 필드영역에 잡으면 계속선언 안하고 쓸수있음.
	MemberDTO[] ar = new MemberDTO[3]; // 객체 선언한게 아니라 배열만 선언했다. 방만 만들어진거다.
	boolean check = false;
	public MemberService() {
		System.out.println("기본생성자");
	}
	public void menu() {
		int num;
		while(true) {
			System.out.println();
			System.out.println("**********");
			System.out.println("    1. 가입");
			System.out.println("    2. 출력");
			System.out.println("    3. 회원정보수정");
			System.out.println("    4. 회원정보삭제");
			System.out.println("    5. 끝");
			
			System.out.println("**********");
			System.out.println(" 번호 :  ");
			num = scan.nextInt();
			if(num == 5) break ; // 5번 끝을 수행했다면 while 문을 벗어나라.
			if(num == 1) insert(); // insert 끝내고 돌아오라는
			else if(num ==2) display();
			else if(num ==3) update();
			else if(num ==4) delete();// display 끝내고 돌아오라는
		}// while
	}
	public void insert() {
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		System.out.println("나이를 입력하세요!");
		int age = scan.nextInt();
		System.out.println("핸드폰번호를 입력하세요!");
		String phone = scan.next();
		System.out.println("주소를 입력하세요!");
		String address = scan.next();
		
		int i; // 밑에 i를 써주기 위해 생명연장 바로 위로 올려줌.
		for(i=0; i<ar.length; i++) {
			if( ar[i]== null) {
				ar[i] = new MemberDTO(name,age,phone,address);
				System.out.println("가입 완료");
				
				break; //for문을 벗어나라.
			} //if
		}// for
		//==> for문 끝에 이쪽으로 나온다.
		if(i == ar.length ) System.out.println("회원 마감");
	}
	// ==> 여기서 html 들어가면 프로젝트. 디비쓰면 완벽.
	// 3번 쓰고 종료됨. 데이터 계속 저장해서쓰고싶으면 디비써라.
	public void display() {
		for(int i=0; i < ar.length; i++) {
			if(ar[i] != null) System.out.println(ar[i].toString()); // get으로 출력안하고 over
		}//for
	}
	public void update() {
		System.out.println("핸들폰번호 입력");
		phone = scan.next();
		int i;
		for(i =0; i<ar.length; i++) {
			if(phone.equals(ar[i].getPhone())) {
				if(ar[i] != null) {
					if(ar[i].getPhone().equals(phone)) {
						System.out.println(ar[i]);
						System.out.println();
						System.out.println("수정할 이름 입력: ");
						name = scan.next();
						System.out.println("수정 할 나이 입력 : ");
						age = scan.nextInt();
						System.out.println("수정 할 핸드폰 입력 : ");
						phone = scan.next();
						System.out.println("수정 할 주소 입력 :");
						address = scan.next();
						//ar[i] = new MemberDTO(name,ar[i].getAge(),phonechng,address); // 이렇게 쓰면 메모리에 계속할당되서 성능저하
						// 그래서 set으로 입력 해주는게 정석이다. 나중에 롬복써서 게터세터 자동으로 만들거다.
						//수정
						ar[i].setName(name);
						ar[i].setAge(age);
						ar[i].setPhone(phone);
						ar[i].setAddress(address);
						System.out.println(name+" 님 회원정보 수정완료");
						break;
					}//if
				}//if
			}//if
		}//for
		if( i == ar.length) System.out.println("회원 정보를 찾을 수 없습니다."); 
	}
	public void delete() {
		System.out.println("핸들폰번호 입력");
		String phone = scan.next();
		int i;
		for(i =0; i<ar.length; i++) {
			if(phone.equals(ar[i].getPhone())) {
				check = true;
				break;
			}
		}
		if(check = true) {
			ar[i] = null;
			System.out.println("회원 정보 삭제완료.");
			return;
		}else {
			System.out.println("회원정보를 찾을 수 없습니다.");
		}
		
	}
}
//실제로 일을하는 집합체
