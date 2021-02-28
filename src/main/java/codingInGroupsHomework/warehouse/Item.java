package codingInGroupsHomework.warehouse;

public class Item {
    private ItemAddOn itemAddOn;
    private String name;
    private int quantity;
    private int unitPrice;

    public Item(ItemAddOn itemAddOn, String name, int quantity, int unitPrice) {
        this.itemAddOn = itemAddOn;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }


    public ItemAddOn getItemAddOn() {
        return itemAddOn;
    }

    public void setItemAddOn(ItemAddOn itemAddOn) {
        this.itemAddOn = itemAddOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
