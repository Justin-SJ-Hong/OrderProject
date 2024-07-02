package homework_diagram;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	private String warehouseName;
    private String warehouseAddress;
    private String warehousePhone;
    private List<OrderDetailInfo> warehouseItems;
    
    public Warehouse(String Name, String Address, String Phone) {
        this.warehouseName = Name;
        this.warehouseAddress = Address;
        this.warehousePhone = Phone;
        this.warehouseItems = new ArrayList<>();
    }
    
	public String getWarehouseName() {
		return warehouseName;
	}
	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}
	public String getWarehouseAddress() {
		return warehouseAddress;
	}
	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}
	public String getWarehousePhone() {
		return warehousePhone;
	}
	public void setWarehousePhone(String warehousePhone) {
		this.warehousePhone = warehousePhone;
	}
	public List<OrderDetailInfo> getWarehouseItems() {
		return warehouseItems;
	}
	public void setWarehouseItems(List<OrderDetailInfo> warehouseItems) {
		this.warehouseItems = warehouseItems;
	}
	
	public void addProduct(OrderDetailInfo detailInfo) {
		warehouseItems.add(detailInfo);
    }
	
}
