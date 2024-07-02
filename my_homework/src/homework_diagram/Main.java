package homework_diagram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean isWorking = true;
		Order order = new Order();
        OrderController controller = new OrderController();
        OrderUI ui = new OrderUI(controller);
        
        while(isWorking) {
        	System.out.println("작업을 선택해주세요.");
        	System.out.println("1 : 수주 입력, 2 : 수주 취소, 3 : 수주 목록 출력, "
        					+ "4 : 창고 추가, 5 : 창고 목록 출력, 6 : 종료");
        	System.out.print("선택 > ");
        	int choose = new Scanner(System.in).nextInt();
        	
        	switch (choose) {
	        	case 1:
	        		ui.inputOrder();
	        		break;
	        	case 2:
	        		ui.cancelOrder();
	        		break;
	        	case 3:
	        		ui.displayOrders();
	        		break;
	        	case 4:
	        		ui.addWarehouse();
	        		break;
	        	case 5:
	        		ui.displayWarehouse();
	        		break;
	        	case 6:
	        		System.out.println("프로그램을 종료합니다.");
	        		isWorking = false;
	        		break;
        		default:
        			System.out.println("잘못 입력하셨습니다.");
        			break;
        	}
        }
	}
}
