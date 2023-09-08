package au.bystritskaia.products;

/**
 * Товар: бутылка воды
 */
public class BottleOfWater extends Product {
    /**
     * Имя товара
     */
    private String name = "Бутылка воды";

    public BottleOfWater(int quantity, int price, String name) {
        super(quantity, price, name);
    }

    @Override
    public String getProductType() {
        return "Бутылка воды";
    }

    /**
     * Для вывода названия
     * @return Возвращает название товара
     */
    @Override
    public String toString() {
        return this.name;
    }
}
