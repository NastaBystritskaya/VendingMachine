package au.bystritskaia.machine;

import au.bystritskaia.products.Product;

import java.util.LinkedList;
import java.util.List;

/**
 * Торговый автомат
 */
public class VendingMachine {

    /**
     * Список продуктов в торговом автомате
     */
    private List<Product> products = new LinkedList<>();

    /**
     * Заполняет товары в торговом автомате
     * @param prods Список продуктов
     */
    public void initProducts (List <Product> prods) {
        this.products = prods;

    }

    /**
     * Получает список продуктов в торговом автомате
     * @return Список продуктов
     */
    public List<Product> getProducts() {
        return this.products;
    }
}
