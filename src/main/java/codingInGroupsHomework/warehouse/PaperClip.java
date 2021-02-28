package codingInGroupsHomework.warehouse;

public class PaperClip extends Gadget {

    private String material;

    public PaperClip(int price, String brand, String material) {
        super(price, brand);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "PaperClip{" +
                "material='" + material + '\'' +
                '}';
    }
}
