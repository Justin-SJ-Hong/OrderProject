package homework_diagram;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
    private LocalDate orderDate;
    private List<OrderDetail> orderDetails;
    private static List<Order> orders = new ArrayList<>();
    
    public Order() {
        orderDetails = new ArrayList<>();
    }
    
    public void registerOrder(OrderInfo orderInfo) {
    	this.orderNum = Integer.parseInt(orderInfo.getOrderId());
        this.orderDate = orderInfo.getOrderDate();
        orders.add(this);
        // Assuming orderInfo contains OrderDetailInfo list or it is added separately
        // Here you would add logic to process order details if necessary
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	public static List<Order> getOrders() {
		return orders;
	}
    
}
