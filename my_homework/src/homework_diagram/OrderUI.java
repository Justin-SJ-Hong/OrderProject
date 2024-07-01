package homework_diagram;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class OrderUI {
	private Scanner scanner;
    private OrderController controller;

    public OrderUI(OrderController controller) {
        this.scanner = new Scanner(System.in);
        this.controller = controller;
    }

    public void inputOrder() {
    	System.out.println("Enter Order Information:");

        System.out.print("Order ID: ");
        String orderId = scanner.nextLine();

        System.out.print("Customer ID: ");
        String customerId = scanner.nextLine();

        System.out.print("Order Date (YYYY-MM-DD): ");
        LocalDate orderDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Delivery Date (YYYY-MM-DD): ");
        LocalDate deliveryDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Status: ");
        String status = scanner.nextLine();

        System.out.print("Total Amount: ");
        double totalAmount = scanner.nextDouble();

        System.out.print("Discount: ");
        double discount = scanner.nextDouble();
        scanner.nextLine(); // consume the newline

        System.out.print("Sales Representative ID: ");
        String salesRepresentativeId = scanner.nextLine();

        System.out.print("Payment Terms: ");
        String paymentTerms = scanner.nextLine();

        System.out.print("Shipping Address: ");
        String shippingAddress = scanner.nextLine();

        System.out.print("Billing Address: ");
        String billingAddress = scanner.nextLine();

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(orderId);
        orderInfo.setCustomerId(customerId);
        orderInfo.setOrderDate(orderDate);
        orderInfo.setDeliveryDate(deliveryDate);
        orderInfo.setStatus(status);
        orderInfo.setTotalAmount(totalAmount);
        orderInfo.setDiscount(discount);
        orderInfo.setSalesRepresentativeId(salesRepresentativeId);
        orderInfo.setPaymentTerms(paymentTerms);
        orderInfo.setShippingAddress(shippingAddress);
        orderInfo.setBillingAddress(billingAddress);

        controller.registerOrder(orderInfo);
    }

    public void registerOrder() {
    	System.out.println("Registering the order...");
        // Additional logic for registering order can be added here if needed
    }

    public void cancelOrder() {
    	System.out.print("Enter Order ID to cancel: ");
        String orderId = scanner.nextLine();
        controller.cancelOrder(orderId);
    }
    
    public void displayOrders() {
        List<Order> orders = controller.getOrders();
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            System.out.println("Order List:");
            for (Order order : orders) {
                System.out.println("Order ID: " + order.getOrderNum() + ", Order Date: " + order.getOrderDate());
                // Additional order details can be displayed here
            }
        }
    }
}
