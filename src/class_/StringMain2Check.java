package class_;


public class StringMain2Check {
	String original,current,change,lc;
	
	public StringMain2Check(){}
	
	public void calc1() {
		System.out.println("바뀐 문자열은 " + original.replace(current,change)+"입니다.");
	}
	public void calc2() {
		lc = original.toLowerCase();
		System.out.println("바뀐 문자열은 " + lc.replace(current,change)+"입니다.");
		
	}
	public void calc3() {
		lc = original.toLowerCase();
		System.out.println("바뀐 문자열은 " + lc.replace(current,change)+"입니다.");
	}
	public void calc4() {
		System.out.println("바뀐 문자열은 " + original.replace(current,change)+"입니다.");
	}
	public void calc5() {
		
		if(original.length()< current.length() 
				|| original.length()<change.length()
				|| current.length() != change.length() ) {
			System.out.println("입력한 문자열의 크기가 작습니다 치환할수 없습니다.");
		}else {
			System.out.println("바뀐 문자열은 " + original.replace(current,change)+"입니다.");
		}
	}
	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}
}
