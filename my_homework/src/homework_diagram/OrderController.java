package homework_diagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrderController {
	private Map<String, Warehouse> warehouses;

    public OrderController() {
        this.warehouses = new HashMap<>();
    }

    public void addWarehouse(Warehouse warehouse) {
    	warehouses.put(warehouse.getWarehouseName(), warehouse);
    }

    public Warehouse getInventoryByName(String name) {
        return warehouses.get(name);
    }

    public void registerOrder(OrderInfo orderInfo, List<OrderDetailInfo> orderDetailInfos, String warehouseName) {
    	Order order = new Order();
        order.registerOrder(orderInfo);
        for (OrderDetailInfo detailInfo : orderDetailInfos) {
            OrderDetail orderDetail = new OrderDetail(detailInfo);
            order.addOrderDetail(orderDetail);
        }
        
        if ("완료".equals(orderInfo.getStatus())) {
            Warehouse warehouse = warehouses.get(warehouseName);
            if (warehouse != null) {
                for (OrderDetailInfo detailInfo : orderDetailInfos) {
                	warehouse.addProduct(detailInfo);
                }
            }
        }
    }

    public void cancelOrder(String orderId) {
        boolean result = Order.removeOrder(orderId);
        if (result) {
            System.out.println("Order " + orderId + " 의 주문을 취소했습니다..");
        } else {
            System.out.println("Order ID " + orderId + " 를 찾을 수 없습니다.");
        }
    }
    
    public List<Order> getOrders() {
        return Order.getOrders();
    }
    
    public List<Warehouse> getWarehouses() {
        return new ArrayList<>(warehouses.values());
    }
}
