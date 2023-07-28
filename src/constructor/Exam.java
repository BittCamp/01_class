package constructor;//[ 김찬영  2023-07-21 오후 04:18:15 ]
//숙제

public class Exam{
	static {
		System.out.println("스테틱영역");
	}
	
	private String name;
	private String dap;
	private int score;	
	private char[] ox;
	
	public char[] getOx() {
		return ox;
	}
	public void setOx(char[] ox) {
		this.ox = ox;
	}
	private final String JUNG = "11111";

	public void nameSet(String name) {
		this.name = name;
	}
	public void setDap(String dap) {
		this.dap = dap;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public String getDap() {
		return dap;
	}

	public int score() {
		return score;
	}
	public void compare() {
		
	}
	public Exam() {
		
	}
}
/*
[문제] 사지선다형
- 총 5문제의 답을 입력받는다
- 정답은 "11111" 이다
- 맞으면 'O', 틀리면 'X'
- 1문제당 점수는 20점씩 처리

클래스명 : Exam
* 필드
private String name = null;
private String dap = null;
private char[] ox = null;
private int score = 0;
private final String JUNG = "11111"; //상수화.

* 메소드
생성자 - Scanner 를 이용하여 이름과 답을 입력받는다. 
compare() - 비교
getName()
getOx()
getScore()
5번 정답 체크
클래스명 : ExamMain

[실행결과]
인원수 입력 : 2

이름 입력 : 홍길동
답 입력 : 12311  

이름 입력 : 코난
답 입력 : 24331

이름		1 2 3 4 5	점수
홍길동  	O X X O O	60
코난  	X X X X O	20
 */