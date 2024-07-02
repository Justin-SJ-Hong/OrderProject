package homework_diagram;

public class OrderDetail {
	private OrderDetailInfo orderDetailInfo;

    public OrderDetail(OrderDetailInfo orderDetailInfo) {
    	this.orderDetailInfo = orderDetailInfo;
    }
    
    public OrderDetailInfo getOrderDetailInfo() {
        return orderDetailInfo;
    }
}
