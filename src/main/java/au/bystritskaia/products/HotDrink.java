package au.bystritskaia.products;

/**
 * Товар: горячий напиток
 */
public class HotDrink extends Product {
    /**
     * Температура напитка
     */
    private float temperature;
    /**
     * Название товара
     */
    private String name = "Горячий напиток";

    /**
     * Конструктор с температурой
     * @param temp Температура
     */
    public HotDrink(int quantity, int price, String name, float temp) {
        super(quantity, price, name);
        this.temperature = temp;
    }

    @Override
    public String getProductType() {
        return "Горячий напиток";
    }

    /**
     * Для вывода названия товара
     * @return Название товара
     */
    @Override
    public String toString() {
        return this.name;
    }
}
