package homework_0704;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    // Getters and Setters
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
