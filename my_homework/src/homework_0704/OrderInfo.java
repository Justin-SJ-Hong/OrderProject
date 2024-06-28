package homework_0704;

import java.time.LocalDate;
import java.util.List;

public class OrderInfo {
	private static int counter = 0;
	private int no;
//	protected String orderId;
//	protected String customerId;
	protected LocalDate orderDate;
//	protected LocalDate deliveryDate;
//	protected String status;
//	protected double totalAmount;
//	protected double discount;
//	protected String salesRepresentativeId;
//	protected String paymentTerms;
//	protected String shippingAddress;
//	protected String billingAddress;
	protected List<OrderDetailInfo> orderDetails;
    
//    public OrderInfo(int no, String orderId, String customerId, LocalDate orderDate, LocalDate deliveryDate,
//			String status, double totalAmount, double discount, String salesRepresentativeId, String paymentTerms,
//			String shippingAddress, String billingAddress) {
//		this.no = ++counter;
//		this.orderId = orderId;
//		this.customerId = customerId;
//		this.orderDate = orderDate;
//		this.deliveryDate = deliveryDate;
//		this.status = status;
//		this.totalAmount = totalAmount;
//		this.discount = discount;
//		this.salesRepresentativeId = salesRepresentativeId;
//		this.paymentTerms = paymentTerms;
//		this.shippingAddress = shippingAddress;
//		this.billingAddress = billingAddress;
//	}
	// Getters and Setters
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
//	public String getOrderId() {
//		return orderId;
//	}
//	public void setOrderId(String orderId) {
//		this.orderId = orderId;
//	}
//	public String getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(String customerId) {
//		this.customerId = customerId;
//	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
//	public LocalDate getDeliveryDate() {
//		return deliveryDate;
//	}
//	public void setDeliveryDate(LocalDate deliveryDate) {
//		this.deliveryDate = deliveryDate;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public double getTotalAmount() {
//		return totalAmount;
//	}
//	public void setTotalAmount(double totalAmount) {
//		this.totalAmount = totalAmount;
//	}
//	public double getDiscount() {
//		return discount;
//	}
//	public void setDiscount(double discount) {
//		this.discount = discount;
//	}
//	public String getSalesRepresentativeId() {
//		return salesRepresentativeId;
//	}
//	public void setSalesRepresentativeId(String salesRepresentativeId) {
//		this.salesRepresentativeId = salesRepresentativeId;
//	}
//	public String getPaymentTerms() {
//		return paymentTerms;
//	}
//	public void setPaymentTerms(String paymentTerms) {
//		this.paymentTerms = paymentTerms;
//	}
//	public String getShippingAddress() {
//		return shippingAddress;
//	}
//	public void setShippingAddress(String shippingAddress) {
//		this.shippingAddress = shippingAddress;
//	}
//	public String getBillingAddress() {
//		return billingAddress;
//	}
//	public void setBillingAddress(String billingAddress) {
//		this.billingAddress = billingAddress;
//	}
//	@Override
//	public String toString() {
//		return "OrderInfo [orderId=" + orderId + ", customerId=" + customerId + ", orderDate=" + orderDate
//				+ ", deliveryDate=" + deliveryDate + ", status=" + status + ", totalAmount=" + totalAmount
//				+ ", discount=" + discount + ", salesRepresentativeId=" + salesRepresentativeId + ", paymentTerms="
//				+ paymentTerms + ", shippingAddress=" + shippingAddress + ", billingAddress=" + billingAddress + "]";
//	}
}
