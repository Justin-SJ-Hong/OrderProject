package homework_0612;

public class Homework_ex03 {

	public static void main(String[] args) {
		// 과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 = ?  7.07
		int a = 1;
		int b = 2;
		double sum = 0.0;
		double share;
		
		do {
			System.out.print(a + "/" + b);
			share = (double)a / (double)b;
			sum += share;
			
			
			if (a == 9) break;
			System.out.print(" + ");
			a++;
			b++;
		} while (a <= 9);
		System.out.printf(" = %.2f", sum);
	}

}
