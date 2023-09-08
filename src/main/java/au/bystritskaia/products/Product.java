package au.bystritskaia.products;

/**
 * Товары
 */
public class Product {

    /**
     * Количество
     */
    private int quantity = 0;
    /**
     * Имя товара
     */
    private String name = "Какой-то товар";

    /**
     * Получает количество товара
     */
    public void updateQuantity() {
        quantity = quantity + 1;
    }

    /**
     * Выводит название товара
     * @return Название товара
     */
    @Override
    public String toString() {
        return this.name;
    }
}

