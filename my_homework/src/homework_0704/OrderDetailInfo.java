package homework_0704;

import java.time.LocalDate;

public class OrderDetailInfo {
//	protected String orderDetailId;
//	protected String orderId;
//	protected String productId;
//	protected String productName;
//	protected int quantity;
//	protected double unitPrice;
//	protected double totalPrice;
//	protected double discount;
//	protected LocalDate deliveryDate;
//	protected String remarks;

	private int orderQuantity;
	private double discountRate;
	private Product product;
	
	// Getter and Setter
//	public String getOrderDetailId() {
//		return orderDetailId;
//	}
//	public void setOrderDetailId(String orderDetailId) {
//		this.orderDetailId = orderDetailId;
//	}
//	public String getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(String orderId) {
//		this.orderId = orderId;
//	}
//	public String getProductId() {
//		return productId;
//	}
//	public void setProductId(String productId) {
//		this.productId = productId;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	public double getUnitPrice() {
//		return unitPrice;
//	}
//	public void setUnitPrice(double unitPrice) {
//		this.unitPrice = unitPrice;
//	}
//	public double getTotalPrice() {
//		return totalPrice;
//	}
//	public void setTotalPrice(double totalPrice) {
//		this.totalPrice = totalPrice;
//	}
//	public double getDiscount() {
//		return discount;
//	}
//	public void setDiscount(double discount) {
//		this.discount = discount;
//	}
//	public LocalDate getDeliveryDate() {
//		return deliveryDate;
//	}
//	public void setDeliveryDate(LocalDate deliveryDate) {
//		this.deliveryDate = deliveryDate;
//	}
//	public String getRemarks() {
//		return remarks;
//	}
//	public void setRemarks(String remarks) {
//		this.remarks = remarks;
//	}


	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
