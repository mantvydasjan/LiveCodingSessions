package codingInGroupsHomework.warehouse;

public class Pencil extends Gadget {

    private String color;

    public Pencil(int price, String brand, String color) {
        super(price, brand);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "color='" + color + '\'' +
                '}';
    }
}
