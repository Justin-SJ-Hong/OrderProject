package homework_0612;

public class Homework_ex01 {

	public static void main(String[] args) {
		// 과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
		int a = 1;
		int b;
		int sum = 0;
		
		do {
			b = 1;
			do {
				if(a > 1 && b == 1) {
					System.out.print("(");
				}
				if(a > 1 && b < a) {
					sum += b;
					System.out.print(b + " + ");
				} else {
					sum += b;
					System.out.print(b);
				}
				
				if(a > 1 && b == a) {
					System.out.print(")");
				}
				b++;
			} while (b <= a);
			System.out.print(" + ");
			a++;
		} while (a <= 5);
		
		System.out.println(sum);
	}

}
