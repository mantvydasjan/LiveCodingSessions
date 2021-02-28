package codingInGroupsHomework.warehouse;

public class Gadget {
    private int price;
    private String brand;

    public Gadget(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
