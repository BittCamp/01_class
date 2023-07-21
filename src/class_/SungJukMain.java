package class_;
//[ 김찬영  2023-07-19 오후 04:02:33 ]

import java.util.Scanner;

class SungJuk {
	private String name; 
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private int avg;
	private char grade;
	 // 셋은 한번에 선언해서 데이터 가져오게 쓰는게 낫다. 이런식으로
	//public void setData(String n, int k, int e, int m) {
	//	name = n;
	//	kor = k;
	//	eng = e;
	//	math = m;
	//}
	public void setName(String n) {
		name = n;
	}
	
	public void setKor(int k) {
		kor = k;
	}
	
	public void setEng(int e) {
		eng = e;
	}
	public void setMath(int m) {
		math = m;
	}
	public void setTot(int t) {
		tot = t;
	}
	public void setAvg(int a) {
		avg = a;
	}
	public void setGrade(char g) {
		grade = g;
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTot() {
		return tot;
	}
	public int getAvg() {
		return avg;
	}
	public int grade() {
		return grade;
	}
	public int calcTot(){
		return 0;
	}
	

	
	public int calcTot(int k,int m, int e) {
		
		return k+m+e;
	}
	
	public double calcAvg(int tot) {
		return (double)tot/3;
	}
	public String calcGrade() {
		String grade;
		
		if (avg >= 90 ) { grade ="A"; } 
		else if (avg >= 80) { grade ="B"; }
		else if (avg >= 70) { grade ="C"; }
		else if (avg >= 60) { grade ="D"; }
		else {grade ="F"; };
		
		return grade;
	}
}


public class SungJukMain {
	public static void main(String[] args) {
		SungJuk sj = new SungJuk(); 
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.printf("국어 점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.printf("수학 점수를 입력하세요.");
		int math = sc.nextInt();
		System.out.printf("영어 점수를 입력하세요.");
		int eng = sc.nextInt();
		
		sj.setName(name);
		sj.setKor(kor);
		sj.setMath(math);
		sj.setEng(eng);
		
		int k = sj.getKor();
		int m = sj.getMath();
		int e = sj.getEng();
		
		
		
		int tot = sj.calcTot(k,m,e);
		double avg = sj.calcAvg(tot);
		String avg_rounds = String.format("%4.2f",avg); //0.2f
		String grd = sj.calcGrade();
		
		
		System.out.println("이름\t" +sj.getName() +" 국어점수\t" +sj.getKor() +" 수학점수\t"+sj.getMath() +" 영어점수\t" +sj.getEng() );
		System.out.println(sj.getName()+"의 총점 "+tot+ " 평균 " +avg_rounds+ " 학점은 "+grd );
		 
		 
		
		
	}
}
