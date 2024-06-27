package homework_0704;

import java.util.Date;
import java.util.Scanner;

public class OrderUI {
	static int orderNum;
	
    private static OrderController orderController = new OrderController();

    public static void inputOrder(int orderNum, Date orderDate) {
        orderController.inputOrder(orderNum, orderDate);
    }

    public void registerOrder(int orderNum, OrderInfo orderInfo) {
        orderController.registerOrder(orderNum, orderInfo);
    }

    public static void cancelOrder(int orderNum) {
        orderController.cancelOrder(orderNum);
    }
    
    public static void main(String[] args) {
		System.out.println("안녕하세요 어떤 걸 도와드릴까요?");
		System.out.println("1. 수주하기 \t 2. 수주 취소");
		System.out.print("선택 : ");
		int choose = new Scanner(System.in).nextInt();
		
		switch(choose) {
		case 1 :
			orderNum++;
			inputOrder(orderNum, new Date());
		case 2 :
			cancelOrder(orderNum);
		}
	}
}