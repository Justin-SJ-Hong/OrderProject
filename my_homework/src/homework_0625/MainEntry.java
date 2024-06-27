package homework_0625;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		PersonManager pm = new PersonManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("휴먼 리스트");
		
		while(true) {
			System.out.println("Choose an option:");
			System.out.println("1) Add 2) Delete 3) List 4) Change 5) Exit");
			int option = sc.nextInt(); sc.nextLine();
			switch(option) {
			case 1: pm.add(); break;
			case 2: pm.delete(); break;
			case 3: pm.list(); break;
			case 4: pm.change(); break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);
			default: 
				System.out.println("Error!");
				break;
			}
		}
	}
}
