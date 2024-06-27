package homework_0612;

public class Homework_ex02 {

	public static void main(String[] args) {
		// 과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?   5
		int a = 1;
		int b = 0;
		int sum = 0;
		do {
			if (a % 2 == 1) {
				b = a;
				b *= (-1);
				sum += b;
				System.out.print("(" + b + ")");
			} else {
				b = a;
				sum += b;
				System.out.print(b);
			}
			
			if (a == 10) break;
			System.out.print(" + ");
			a++;
		} while (a <= 10);
		
		System.out.print(" = " + sum);
	}

}
