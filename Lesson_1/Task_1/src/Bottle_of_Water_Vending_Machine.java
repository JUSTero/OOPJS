import java.util.List;

public class Bottle_of_Water_Vending_Machine implements Vending_Machine {

private final List<Product> productList;

private int money;

public Bottle_of_Water_Vending_Machine(List<Product> productList) {
    this.productList = productList;
}

    @Override
    public Product getProduct(String name) {
            for (Product product : productList) {
                if (product.getName().equals(name)) {
                    money += product.getPrice();
                    return product;
                }
            }
            return null;
        }  

    public Bottle_of_Water getProduct(String name, int volume) {
        for (Product product: productList) {
            if (product instanceof Bottle_of_Water) {
                if (product.getName().equals(name) && ((Bottle_of_Water) product).getVolume() == volume) {
                    return (Bottle_of_Water) product;
                }
            }
        }
        return null;
    }
}

