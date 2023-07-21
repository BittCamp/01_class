package class_;

public class SungJuk_T {
	//[ 김찬영  2023-07-19 오후 12:12:29 ]ㄴ
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	
	public void setData(String name, int kor, int eng, int math) {
		this.name = name; // this. 클래스 안에 있는 모든 필드(전역변수는) this 가붙어있다. 구분이 안되기 때문에 쓰는거다.
		System.out.println("this == "+ this);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void calcTot() {
		tot = kor + eng + math; // 얘네도 this. 기본으로 다 들어가 있는데 구분이 되기 때문에 안써주는거다.
	}
	
	public void calcAvg() {
		avg = (double)tot / 3.0;
	}
	
	public void calcGrade() {
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80) {
			grade= 'B';
		}else if(avg>=70) {
			grade= 'C';
		}else if(avg>=60) {
			grade= 'D';
		}else {
			grade= 'F';
		}
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
	
	public double getAvg() {
		return avg;
	}
	
	public char getGrade() {
		return grade;
	}
	
}



