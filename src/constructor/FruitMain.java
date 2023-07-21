package constructor;
class Fruit{
	// 해보기
	private String pum;
	private int jan;
	private int feb;
	private int mar;
	private int tot;
	private static int sumJan;
	private static int sumFeb;
	private static int sumMar;
	

	public Fruit(String pum,int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	public void calcTot() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	public void display(){
		System.out.println(pum +"\t"+ jan+"\t"+feb+"\t"+mar+"\t"+tot );
	}
	
	public static void output() {
		System.out.println("\t"+sumJan+"\t"+sumFeb+"\t"+sumMar);
	}
}

public class FruitMain {
	public static void main(String[] args) {
		Fruit apple = new Fruit("사과",100,80,75);
		Fruit grape = new Fruit("포도",30,25,65);
		Fruit strawberry = new Fruit("딸기",25,30,90);
		System.out.println("-----------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-----------------------------------");
		apple.calcTot();
		apple.display();
		grape.calcTot();
		grape.display();
		strawberry.calcTot();
		strawberry.display();
		System.out.println("-----------------------------------");
		Fruit.output();
		
	}
}
/*
[문제] 과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
필드   : pum, jan, feb, mar, tot
       각월의합계 sumJan, sumFeb, sumMar

메소드 : 생성자(품명, 1월, 2월, 3월)
        calcTot()
        display()
        public static void output() <==스테틱잡은거 밑에꺼를 찍어달라.
        

클래스 : FruitMain

[실행결과]
---------------------------------
PUM		JAN   FEB   MAR		TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     65
딸기     25    30    90     145
---------------------------------
       155    135   175				output()로 처리
 */