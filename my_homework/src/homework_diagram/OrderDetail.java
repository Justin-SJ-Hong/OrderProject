package homework_diagram;

public class OrderDetail {
	private int orderQuantity;
    private double discountRate;

    public OrderDetail(int orderQuantity, double discountRate) {
        this.orderQuantity = orderQuantity;
        this.discountRate = discountRate;
    }

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
