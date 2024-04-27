package item;

public class Item {
    private ItemType itemtype;
    private int price;

    public ItemType getType(){
        return this.itemtype;
    }

    public void setItemType(ItemType itemtype){
        this.itemtype=itemtype;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price=price;
    }
}
 