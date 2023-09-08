package au.bystritskaia.view;

import au.bystritskaia.machine.IVendingMachine;
import au.bystritskaia.products.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Root extends JFrame {

    Label label = new Label("Торговый аппарат");

    JPanel productsWrapper = new JPanel();
    JLabel sum = new JLabel("Сумма: ");

    JTextField coins = new JTextField();

    JButton select = new JButton("Выбрать");

    JTextField change = new JTextField();

    JProgressBar progress = new JProgressBar();

    JLabel status = new JLabel("Ожидание выбора");

    IVendingMachine machine;

    public Root(IVendingMachine machine) throws HeadlessException {
        this.machine = machine;
        this.fillProducts();
        this.drawCollector();
        this.drawDisperser();
        this.setSize(800, 800);
        GridLayout layout = new GridLayout(4, 1);
        this.setLayout(layout);
        this.setVisible(true);
    }

    private void drawDisperser() {
        JPanel disperserWrapper = new JPanel();
        disperserWrapper.setSize(new Dimension(800, 200));
        this.change.setText("Ваша сдача: 0");
        disperserWrapper.add(this.change);
        this.add(disperserWrapper);
    }
    private void fillProducts() {
        this.machine.getDisplay().getProducts().stream().map(this::getProductView).forEach(view -> this.productsWrapper.add(view));
        this.productsWrapper.setSize(new Dimension(200, 200));
        GridLayout layout = new GridLayout(2, 2);
        this.productsWrapper.setLayout(layout);
        this.add(this.productsWrapper);
    }

    private void drawCollector() {
        JPanel coinsWrapper = new JPanel();
        coinsWrapper.setSize(400, 300);
        this.sum.setText(this.sum.getText() + "0");
        this.coins.setSize(new Dimension(200, 100));
        coinsWrapper.setAlignmentX(Component.RIGHT_ALIGNMENT);
        coinsWrapper.add(this.sum);
        coinsWrapper.add(this.coins);
        this.add(coinsWrapper);
    }

    private JPanel getProductView(Product p) {
        JPanel productWrapper = new JPanel();
        Label type = new Label(p.getProductType());
        Label name = new Label(p.getName());
        Label price = new Label(p.getPrice() + " р.");
        Label count = new Label(p.getQuantity() + " шт.");
        BoxLayout box = new BoxLayout(productWrapper, BoxLayout.Y_AXIS);
        productWrapper.setAlignmentX(Component.CENTER_ALIGNMENT);
        productWrapper.setLayout(box);
        productWrapper.add(type);
        productWrapper.add(name);
        productWrapper.add(price);
        productWrapper.add(count);
        productWrapper.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        name.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        return productWrapper;
    }


}
