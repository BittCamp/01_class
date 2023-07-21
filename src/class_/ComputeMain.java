package class_;

public class ComputeMain {
	//[ 김찬영  2023-07-19 오후 12:13:18 ]
	// 메인 역활만 하는거지 클래스로써 역활을 하지 않는다.
	public static void main(String[] args) {
		Compute cp = new Compute();
		
		Compute[] ar = new Compute[3];
		
		ar[0] = new Compute();
		ar[1] = new Compute();
		ar[2] = new Compute();
		
		ar[0].setX(320);
		ar[0].setY(256);
		ar[1].setX(258);
		ar[1].setY(127);
		ar[2].setX(572);
		ar[2].setY(326);
		
		for(int i=0; i< ar.length; i++ ) {
			ar[i].getSum();
			ar[i].getSub();
			ar[i].getMul();
			ar[i].getDiv();
			System.out.println(i+"번째 배열 의 합은\t"+ar[i].getSum()
							+","+i+"번째 배열 의 차는\t"+ ar[i].getSub()
							+","+i+"번째 배열 의 곱은\t"+ ar[i].getMul()
							+","+i+"번째 배열 의 몫은\t"+ String.format("%.3f",ar[i].getDiv()) );
		}
	}
}
