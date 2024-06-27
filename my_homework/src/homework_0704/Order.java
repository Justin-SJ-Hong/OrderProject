package homework_0704;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderNum;
    private Date orderDate;
    private List<OrderDetail> orderDetails;

    public Order(int orderNum, Date orderDate) {
        this.orderNum = orderNum;
        this.orderDate = orderDate;
    }

    public void registerOrder(OrderInfo orderInfo) {
        // 등록 로직 구현
    }
    
    // Getters and Setters
    public Date getOrderDate() {
        return orderDate;
    }

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}

