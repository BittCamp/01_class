package class_;
//[ 김찬영  2023-07-19 오후 04:02:52 ]
public class ComputeMain_T {
	public static void main(String[] args) {
		
		Compute_T[] com = new Compute_T[3];
		for(int i =0; i<com.length; i++) {
			com[i] = new Compute_T();
		}
		com[0].setX(320); com[0].setY(258);
		com[1].setX(258); com[1].setY(127);
		com[2].setX(572); com[2].setY(326);
		for(Compute_T data: com) {
			data.calc();
			System.out.println(data.getX()+"\t"
							  +data.getY()+"\t"
							  +data.getSum()+"\t"
							  +data.getSub()+"\t"
							  +data.getMul()+"\t"
							  +data.getDiv()+"\t");
		}
		
	}
	
}
