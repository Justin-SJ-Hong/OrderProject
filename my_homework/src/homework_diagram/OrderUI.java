package homework_diagram;

import java.time.LocalDate;
import java.util.ArrayList;
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
    	System.out.println("주문 정보를 입력해주세요:");

        System.out.print("주문 ID: ");
        String orderId = scanner.nextLine();

        System.out.print("고객 ID: ");
        String customerId = scanner.nextLine();
        
        System.out.print("영업 사원 ID: ");
        String salesRepresentativeId = scanner.nextLine();
        
        System.out.print("상품 ID: ");
        String productId = scanner.nextLine();

        System.out.print("상품명: ");
        String productName = scanner.nextLine();

        System.out.print("상품 개수: ");
        int quantity = scanner.nextInt();

        System.out.print("개당 가격(USD): ");
        double unitPrice = scanner.nextDouble();
        
        System.out.print("할인율(%): ");
        double detailDiscount = scanner.nextDouble();
        scanner.nextLine(); // consume the newline

        double totalPrice = unitPrice * quantity - detailDiscount;

        System.out.print("주문 날짜 (YYYY-MM-DD): ");
        LocalDate orderDate = LocalDate.parse(scanner.nextLine());

        System.out.print("배송 날짜 (YYYY-MM-DD): ");
        LocalDate deliveryDate = LocalDate.parse(scanner.nextLine());

        System.out.print("주문 상태(접수, 진행중, 완료): ");
        String status = scanner.nextLine();
        
        System.out.print("결제 조건(선불, 후불): ");
        String paymentTerms = scanner.nextLine();

        System.out.print("배송 주소: ");
        String shippingAddress = scanner.nextLine();

        System.out.print("청구 주소: ");
        String billingAddress = scanner.nextLine();
        
        System.out.print("기타 비고 사항: ");
        String remarks = scanner.nextLine();

        OrderInfo orderInfo = new OrderInfo();
        List<OrderDetailInfo> orderDetailInfos = new ArrayList<>();
        OrderDetailInfo orderDetailInfo = new OrderDetailInfo();
        
        orderInfo.setOrderId(orderId); // 주문 ID
        orderInfo.setCustomerId(customerId); // 고객 ID
        orderInfo.setSalesRepresentativeId(salesRepresentativeId); // 영업사원 ID
        
        orderDetailInfo.setProductId(productId); // 상품 ID
        orderDetailInfo.setProductName(productName); // 상품명
        orderDetailInfo.setQuantity(quantity); // 상품 개수
        orderDetailInfo.setUnitPrice(unitPrice); // 개당 가격
        orderDetailInfo.setDiscount(detailDiscount); // 할인액
        orderDetailInfo.setTotalPrice(totalPrice); // 총 가격
        
        orderInfo.setOrderDate(orderDate); // 주문 날짜
        orderInfo.setDeliveryDate(deliveryDate); // 배송 날짜
        orderInfo.setStatus(status); // 주문 상태
        orderInfo.setPaymentTerms(paymentTerms); // 결제 조건
        orderInfo.setShippingAddress(shippingAddress); // 배송 주소
        orderInfo.setBillingAddress(billingAddress); // 청구 주소
        
        orderDetailInfo.setRemarks(remarks); // 기타 비고사항
        orderDetailInfos.add(orderDetailInfo);
        
        if ("완료".equals(status)) {
            System.out.println("창고 목록:");
            List<Warehouse> warehouses = controller.getWarehouses();
            for (Warehouse warehouse : warehouses) {
                System.out.println("창고 이름: " + warehouse.getWarehouseName());
            }

            System.out.print("상품을 저장할 창고의 이름을 입력해주세요.: ");
            String warehouseName = scanner.nextLine();

            if (controller.getInventoryByName(warehouseName) != null) {
                controller.registerOrder(orderInfo, orderDetailInfos, warehouseName);
            } else {
                System.out.println("창고 이름을 잘못 입력하셨습니다. 상품이 창고에 저장되지 않았습니다.");
            }
        } else {
            controller.registerOrder(orderInfo, orderDetailInfos, null);
        }
        System.out.println("주문 완료");
    }
    
    public void cancelOrder() {
    	System.out.print("취소하고 싶은 주문 ID를 입력해주세요: ");
        String orderId = scanner.nextLine();
        controller.cancelOrder(orderId);
    }
    
    public void displayOrders() {
        List<Order> orders = controller.getOrders();
        if (orders.isEmpty()) {
            System.out.println("주문 내역이 없습니다.");
        } else {
        	System.out.println("===================================");
        	System.out.println();
            System.out.println("주문 내역:");
            for (Order order : orders) {
            	OrderInfo info = order.getOrderInfo();
            	System.out.println("주문 ID : " + info.getOrderId() 
            					+ ", 고객 ID : " + info.getCustomerId() 
            					+ ", 영업 사원 ID : " + info.getSalesRepresentativeId());
            	System.out.println("주문 날짜 : " + info.getOrderDate() + ", 배송 날짜 : " + info.getDeliveryDate());
            	System.out.println("주문 상태 : " + info.getStatus() + ", 결제 조건 : " + info.getPaymentTerms());
            	System.out.println("배송 주소 : " + info.getShippingAddress() + ", 청구 주소 : " + info.getBillingAddress());
            	
                List<OrderDetail> details = order.getOrderDetails();
                for (OrderDetail detail : details) {
                    OrderDetailInfo detailInfo = detail.getOrderDetailInfo();
                    System.out.println("상품 ID : " + detailInfo.getProductId() + ", 상품명 : " + detailInfo.getProductName());
                    System.out.println("상품 개수 : " + detailInfo.getQuantity() + ", 개당 가격 : " + detailInfo.getUnitPrice() + ", 할인액 : " + detailInfo.getDiscount());
                    System.out.println("총 가격 : " + detailInfo.getTotalPrice());
                    System.out.println("기타 비고 사항 : " + detailInfo.getRemarks());
                    System.out.println("-------------------------------");
                }
                System.out.println();
                System.out.println("===================================");
            }
        }
    }
    
    public void displayWarehouse() {
        List<Warehouse> warehouses = controller.getWarehouses();
        
        if(warehouses.isEmpty()) {
        	System.out.println("창고에 아무것도 없습니다.");
        } else {
        	System.out.println("===================================");
        	System.out.println();
        	for (Warehouse warehouse : warehouses) {
        		List<OrderDetailInfo> warehouseItems = warehouse.getWarehouseItems();
        		System.out.println("창고 이름: " + warehouse.getWarehouseName());
            	System.out.println("창고 주소: " + warehouse.getWarehouseAddress());
            	System.out.println("창고 연락처: " + warehouse.getWarehousePhone());
            	
            	for (OrderDetailInfo item : warehouseItems) {
            		System.out.println("상품 ID : " + item.getProductId() + ", 상품명 : " + item.getProductName());
                    System.out.println("상품 개수 : " + item.getQuantity() + ", 개당 가격 : " + item.getUnitPrice() + ", 할인액 : " + item.getDiscount());
                    System.out.println("총 가격 : " + item.getTotalPrice());
                    System.out.println("기타 비고 사항 : " + item.getRemarks());
                    System.out.println("-------------------------------");
            	}
            	System.out.println();
            	System.out.println("===================================");
        	}
        }
    }

    public void addWarehouse() {
        System.out.print("창고 이름을 입력해주세요: ");
        String name = scanner.nextLine();
        System.out.print("창고 주소를 입력해주세요: ");
        String address = scanner.nextLine();
        System.out.print("창고 연락처를 입력해주세요: ");
        String phone = scanner.nextLine();
        Warehouse warehouse = new Warehouse(name, address, phone);
        controller.addWarehouse(warehouse);
        System.out.println("창고 " + name + "추가");
    }
}
