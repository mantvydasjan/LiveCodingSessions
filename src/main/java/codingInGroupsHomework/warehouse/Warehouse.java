package codingInGroupsHomework.warehouse;

import java.util.List;

public class Warehouse {

    private Car car;
    private Computer computer;
    private Furniture furniture;
    List<Gadget> smallThings;
    private double totalPrice;


    public double getTotalPrice() {

        for (Gadget smallThing : smallThings) {
            totalPrice = totalPrice + smallThing.getPrice();

        }

        totalPrice = totalPrice + car.getPrice()+computer.getPrice()+ furniture.getPrice();

        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Warehouse(Car car, Computer computer, Furniture furniture, List<Gadget> smallThings) {
        this.car = car;
        this.computer = computer;
        this.furniture = furniture;
        this.smallThings = smallThings;

    }

    public Warehouse(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public List<Gadget> getSmallThings() {
        return smallThings;
    }

    public void setSmallThings(List<Gadget> smallThings) {
        this.smallThings = smallThings;
    }


    @Override
    public String toString() {
        return "Warehouse{" +
                "car=" + car +
                ", computer=" + computer +
                ", furniture=" + furniture +
                ", smallThings=" + smallThings +
                ", totalPrice=" + totalPrice +
                '}';
    }
}