package codingInGroupsHomework.warehouse;

public class Furniture {
    private double price;
    private String material;
    private String type;

    public Furniture(double price, String material, String type) {
        this.price = price;
        this.material = material;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
