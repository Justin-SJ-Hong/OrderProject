package homework_diagram;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order {
	private OrderInfo orderInfo;
    private List<OrderDetail> orderDetails;
    private static List<Order> orders = new ArrayList<>();
    
    public Order() {
    	
        orderDetails = new ArrayList<>();
    }
    
    public void registerOrder(OrderInfo orderInfo) {
    	this.orderInfo = orderInfo;
        orders.add(this);
    }
    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
    }
    
    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	public static List<Order> getOrders() {
		return orders;
	}
	
	public static boolean removeOrder(String orderId) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getOrderInfo().getOrderId().equals(orderId)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
