package homework_diagram;

import java.util.List;

public class OrderController {
	private Order order;
//    private OrderDetail orderDetail;

//    public OrderController(Order order, OrderDetail orderDetail) {
	public OrderController(Order order) {
        this.order = order;
//        this.orderDetail = orderDetail;
    }

    public void registerOrder(OrderInfo orderInfo) {
        order.registerOrder(orderInfo);
    }

    public void addOrderDetail(OrderDetailInfo orderDetailInfo) {
        OrderDetail detail = new OrderDetail(orderDetailInfo.getQuantity(), orderDetailInfo.getDiscount());
        order.addOrderDetail(detail);
    }

    public void cancelOrder(String orderId) {
    	// Assuming orderNum is a unique identifier for the order
        if (Integer.toString(order.getOrderNum()).equals(orderId)) {
            // Reset order details or remove order logic can be added here
            order = new Order(); // Resetting the order
            System.out.println("Order " + orderId + " has been cancelled.");
        } else {
            System.out.println("Order ID " + orderId + " not found.");
        }
    }
    
    public List<Order> getOrders() {
        return Order.getOrders();
    }
}
