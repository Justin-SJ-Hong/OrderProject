package homework_0704;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderController {
    List<Order> orders = new ArrayList<>();

    public void inputOrder(int orderNum, Date orderDate) {
        Order order = new Order(orderNum, orderDate);
        orders.add(order);
    }

    public void registerOrder(int orderNum, OrderInfo orderInfo) {
        for (Order order : orders) {
            if (order.getOrderNum() == orderNum) {
                order.registerOrder(orderInfo);
            }
        }
    }

    public void cancelOrder(int orderNum) {
        orders.removeIf(order -> order.getOrderNum() == orderNum);
    }
    
    public void printList() {
    	System.out.println("주문 목록");
    	
    	if(orders.size() == 0) {
    		System.out.println("주문 내역이 없습니다.");
    	}
    	
    	for(int i = 0; i < orders.size(); i++) {
    		System.out.println((i + 1) + "번째 정보 : " + orders.toString());
    	}
    	
    	System.out.println("================");
    }

    // Getters and Setters
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	
}
