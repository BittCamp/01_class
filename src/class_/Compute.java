package class_;

public class Compute {
//[ 김찬영  2023-07-19 오후 12:13:25 ] 코드잇지피티 코딩해줌. 관리자가 필요함. 10년뒤. 여기서html만쓰면 개발임
	private int x;
	private int y;
	private int sum;
	private int sub;
	private int mul;
	private double div;
	
	public void setX( int x) {
		this.x = x; // x = x1 매개변수x1이렇게 안쓰고 this로 써줬다.
	} 
	public void setY( int y) {
		this.y = y;
	} 
	public void Calc(int x , int y) {
		System.out.println("합은 "+sum );
		System.out.println("차는 "+sub);
		System.out.println("곱은 "+mul);
		System.out.println("몫은 "+div);
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSum() {
		return x+y;
	}
	public int getSub() {
		return x-y;
	}
	public int getMul() {
		return x-y;
	}
	public double getDiv() {
		return x%y;
	}
	
}
