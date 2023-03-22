package study;

public class StudyDie {
	void sumA(int x, int y) {
		int c;
		c = x+y;
		System.out.println("c="+c);
		return;
	}
	
	int sumB(int x, int y) {
		int c;
		c = x+y;
		return c;
	}
	public static void main(String[] aaa ) {
		StudyDie st = new StudyDie();
		st.sumA(3,4);
		int b = st.sumB(3,4);
		System.out.println(b);
	}
}
