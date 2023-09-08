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
    public HotDrink(float temp) {
        this.temperature = temp;
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
