package homework_0704;

public class OrderDetail {
    private int orderQuantity;
    private double discountRate;
    private Product product;

    public OrderDetail(int orderQuantity, double discountRate, Product product) {
        this.orderQuantity = orderQuantity;
        this.discountRate = discountRate;
        this.product = product;
    }

    public void registerOrderDetail(OrderDetailInfo orderDetailInfo) {
        // 등록 로직 구현
    }

    // Getters and Setters
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
