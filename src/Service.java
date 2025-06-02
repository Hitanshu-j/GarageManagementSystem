public class Service {
    private String serviceName;
    private double servicePrice;

    public Service(String name, double price) {
        this.serviceName = name;
        this.servicePrice = price;
    }

    public String getName() {
        return serviceName;
    }

    public double getPrice() {
        return servicePrice;
    }
}
