package class_;

public class VarArgs {
	// 똑같은 함수 여러개 생기는 거. 오버로드
	/*public int sum(int a , int b){ // 구현
		return a+b;
	}
	public int sum(int a, int b , int c) {
		return a+b+c;
	}
	public int sum(int a, int b , int c , int d) {
		return a+b+c+d;
	}*/
	// 오버로드 하는데 수가 많아지더라.. 그러면 배열화 작업하면 됨.
	public int sum(int... ar) { // 스프링에서 많이씀. 배열화..
		int hap = 0;
		for(int i=0; i < ar.length; i++) {
			hap += ar[i];
		} //for 
		return hap;
	}
	
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("합 = "+ va.sum(10,20)); //호출
		System.out.println("합 = "+ va.sum(10,20,30));
		System.out.println("합 = "+ va.sum(10,20,30,40));
		
		
	}


}
