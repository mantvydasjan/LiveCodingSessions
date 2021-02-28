package codingInGroupsHomework.warehouse;

public class Paper extends Gadget {

    private String size;

    public Paper(int price, String brand, String size) {
        super(price, brand);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "size='" + size + '\'' +
                '}';
    }
}
