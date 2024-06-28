package homework_0704;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OrderUI {
	static int orderNum = 1;
	static boolean isWorking = true;
	
    private static OrderController orderController = new OrderController();
	private static OrderInfo OrderInfo;

    public static void inputOrder(int orderNum, Date orderDate) {
        orderController.inputOrder(orderNum, orderDate);
    }

    public static void registerOrder(int orderNum, OrderInfo orderInfo) {
        orderController.registerOrder(orderNum, orderInfo);
    }

    public static void cancelOrder(int orderNum) {
        orderController.cancelOrder(orderNum);
    }
    
    private static void printList() {
		orderController.printList();
	}
    
    public static void main(String[] args) {
    	List<Order> orders = new ArrayList<>();
    	
    	while(isWorking) {
    		System.out.println("안녕하세요 어떤 걸 도와드릴까요?");
    		System.out.println("1. 수주하기 2. 수주 취소 3. 수주 목록 출력 4. 프로그램 종료");
    		System.out.print("선택 : ");
    		int choose = new Scanner(System.in).nextInt();
    		
    		switch(choose) {
	    		case 1 :
	    			orderNum++;
	    			inputOrder(orderNum, new Date());
	    			registerOrder(orderNum, OrderInfo);
	    			break;
	    		case 2 :
	    			cancelOrder(orderNum);
	    			break;
	    		case 3 :
	    			printList();
	    			break;
	    		case 4 :
	    			isWorking = false;
	    			System.out.println("프로그램을 종료합니다.");
	    			break;
    			default : 
    				System.out.println("잘못 입력하셨습니다.");
    				break;
    		}
    	}
		
	}

	
}