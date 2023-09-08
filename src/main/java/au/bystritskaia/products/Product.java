package au.bystritskaia.products;

/**
 * Товары
 */
public abstract class Product {

    /**
     * Количество
     */
    private int quantity = 0;

    private int price = 0;
    /**
     * Имя товара
     */
    private String name = "Какой-то товар";

    public Product(int quantity, int price, String name) {
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public abstract String getProductType();

    /**
     * Получает количество товара
     */
    public void updateQuantity() {
        quantity -= 1;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

