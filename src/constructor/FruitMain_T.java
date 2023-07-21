package constructor;

class Fruit_t{
	private String pum;
	private int jan;
	private int feb;
	private int mar;
	private int tot;
	private static int sumJan;
	private static int sumFeb;
	private static int sumMar;

	public Fruit_t(String pum, int jan, int feb , int mar ) {
		this.pum =pum;
		this.jan =jan;
		this.feb =feb;
		this.mar =mar;
	}

	public void calcTot() {
		tot = jan + feb + mar;
		
		sumJan+=jan; //sumJan = sumJan + jan;
		sumFeb+=feb;
		sumMar+=mar;
	}
	public void display() {
		System.out.println(pum +"\t"+ jan+"\t"+ feb+"\t"+ mar+"\t"+ tot);
	}
	
	public static void output() {
		System.out.println("\t"+sumJan+"\t"+sumFeb+"\t"+sumMar);
	}
	
}
	public class FruitMain_T{
		public static void main(String[] args) {
			Fruit_t apple = new Fruit_t("사과",100,80,75);
			Fruit_t grape = new Fruit_t("포도",30,25,10);
			Fruit_t strawberry = new Fruit_t("딸기",25,30,90);
			
			System.out.println("-------------------------------------------------");
			System.out.println("PUM"+"\t"+"JAN"+"\t"+"FEB"+"\t"+"MAR"+"\t"+"Tot  ");
			System.out.println("-------------------------------------------------");
			apple.calcTot();
			apple.display();

			grape.calcTot();
			grape.display();
			
			strawberry.calcTot();
			strawberry.display();
			System.out.println("---------------------------------------------------");
			Fruit_t.output();
			
		}
	}