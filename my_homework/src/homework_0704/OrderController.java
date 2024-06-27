package homework_0704;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderController {
    private List<Order> orders = new ArrayList<>();

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

    // Getters and Setters
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
