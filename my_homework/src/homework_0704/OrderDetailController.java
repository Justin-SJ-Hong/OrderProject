package homework_0704;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailController {
    private List<OrderDetail> orderDetails = new ArrayList<>();

//    public void registerOrderDetail(int orderQuantity, double discountRate, Product product) {
//        OrderDetail orderDetail = new OrderDetail(orderQuantity, discountRate, product);
//        orderDetails.add(orderDetail);
//    }
    public void registerOrderDetail(OrderDetailInfo orderDetailInfo) {
        OrderDetail orderDetail = new OrderDetail(orderDetailInfo.getOrderQuantity(), orderDetailInfo.getDiscountRate(), orderDetailInfo.getProduct());
        orderDetails.add(orderDetail);
    }

    // Getters and Setters
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
}
