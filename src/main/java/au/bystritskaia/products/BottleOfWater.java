package au.bystritskaia.products;

/**
 * Товар: бутылка воды
 */
public class BottleOfWater extends Product {
    /**
     * Имя товара
     */
    private String name = "Бутылка воды";

    /**
     * Для вывода названия
     * @return Возвращает название товара
     */
    @Override
    public String toString() {
        return this.name;
    }
}
