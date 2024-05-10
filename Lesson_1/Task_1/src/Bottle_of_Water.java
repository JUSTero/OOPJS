public class Bottle_of_Water extends Product{

    private double volume;

    public Bottle_of_Water(String name, int price) {
        super(name, price);
    }

    public Bottle_of_Water(String name, int price, double volume) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bottle_OF_Water{" + "name='" + getName() + '\'' + 
        ", price=" + getPrice() + ", volume=" + volume + '}';
    }

}
