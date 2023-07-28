package constructor;

import java.util.Scanner;

public class Exam_T {
	private String name = null;
	private String dap = null;
	private char[] ox = new char[5];
	private int score = 0;
	public static final String JUNG = "11111";
	
	public String getName() {
		return name;
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}
	public String getDap() {
		return dap;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setDap(String dap) {
		this.dap = dap;
	}
	public void setOx(char[] ox) {
		this.ox = ox;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public static String getJung() {
		return JUNG;
	}
	

    public Exam_T() {
    	Scanner scan = new Scanner(System.in);
    	ox = new char[5];
        System.out.print("이름 입력: ");
        name = scan.next();
        System.out.print("답 입력: ");
        dap = scan.next();
        compare();
    }

    // 답과 정답 비교하여 ox 배열과 score 계산
    public void compare() {
        ox = new char[dap.length()];
        score = 0;

        for (int i = 0; i < dap.length(); i++) {
            if (dap.charAt(i) == JUNG.charAt(i)) {
                ox[i] = 'O';
                score += 20;
            } else {
                ox[i] = 'X';
            }
        }
    }
}