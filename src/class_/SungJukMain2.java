package class_;

public class SungJukMain2 {
	//[ 김찬영  2023-07-19 오후 12:12:44 ]
	public static void main(String[] args) {
		SungJuk aa = new SungJuk(); // 객체
		SungJuk bb = new SungJuk(); // 객체
		SungJuk cc = new SungJuk(); // 객체
		
		SungJuk_T[] ar = new SungJuk_T[3]; //객체배열.
								       //Object 최상위 부모클래스 값으로 잡는것
		// 클래스 생성이랑 비슷한데 배열생성한거다.
		///int[] ar = new int[5];
		ar[0] = new SungJuk_T();
		ar[1] = new SungJuk_T();
		ar[2] = new SungJuk_T();
		//ar[2] = new PersonMain(); // PersonMain 클래스 못가져와...SungJuk 클래스만 가져올수있다.
		
		// 그래서 어떤 배열이든 다 가져오고 싶다. 그럼 최상위 클래스 들이대서 배열선언 하면 어떤 배열이든 다들어올수있음.
		Object[] ar1 = new Object[3]; // 객체배열
		ar1[0] = new SungJuk();
		ar1[2] = new PersonMain();  //이렇게는됨.
		
		ar[0].setData("홍길동", 80, 76, 85);
		ar[1].setData("코난", 100, 78, 55);
		ar[2].setData("라이언", 80, 76, 85);
		
		for(int i=0; i< ar.length; i++) {
			ar[i].calcTot();
			ar[i].calcAvg();
			ar[i].calcGrade();
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println(ar[i].getName() + "\t"
							 + ar[i].getKor() + "\t"
							 + ar[i].getEng() + "\t"
							 + ar[i].getMath() + "\t"
							 + ar[i].getTot() + "\t"
							 + String.format("%.2f", ar[i].getAvg())+ "\t"
							 + ar[i].getGrade());
		}// for 
		
		System.out.println("--------------------------------------");
		for(SungJuk_T data : ar) {		// 확장형 for문. ar의 (배열) 크기만큼 for을 반복한다.
			//SungJuk_T클래스 의 데이터를 가져오는 거다. 배열 ar 이 객체배열 SungJuk_T클래스의 객체들을 하나씩 가져온다.
			data.calcTot();
			data.calcAvg();
			data.calcGrade();
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println(data.getName() + "\t"
							 + data.getKor() + "\t"
							 + data.getEng() + "\t"
							 + data.getMath() + "\t"
							 + data.getTot() + "\t"
							 + String.format("%.2f", data.getAvg())+ "\t"
							 + data.getGrade());
		}
			
			
		
		
	}
}
