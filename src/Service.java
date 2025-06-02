public class Service {
    private String serviceName;
    private double price;

    public Service(String name, double price) {
        this.serviceName = name;
        this.price = price;
    }

    public String getName() {
        return serviceName;
    }

    public double getPrice() {
        return price;
    }
}
