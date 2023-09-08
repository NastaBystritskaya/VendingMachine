package au.bystritskaia.machine;

import au.bystritskaia.products.Product;

import java.util.LinkedList;
import java.util.List;

public class DisplayMenu {

    List<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public Product select(String productName) {
        Product selected = this.products
                .parallelStream()
                .filter(pr -> pr.getName().equalsIgnoreCase(productName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Не найден товар с наименованием " + productName));
        selected.updateQuantity();
        return selected;
    }

}
