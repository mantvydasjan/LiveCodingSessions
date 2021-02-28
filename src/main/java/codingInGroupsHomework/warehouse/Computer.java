package codingInGroupsHomework.warehouse;

public class Computer {
    private double price;
    private String brand;
    private int memory;

    public Computer(double price, String brand, int memory) {
        this.price = price;
        this.brand = brand;
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
