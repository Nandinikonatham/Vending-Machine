package item;

public class ItemShelf {
    private int itemcode;
    private Item item;
    private boolean soldout;

    public Item getItem(){
        return this.item;
    }

    public void setItem(Item item){
        this.item=item;
    }

    public int getItemcode(){
        return this.itemcode;
    }

    public void setitemcode(int itemcode){
        this.itemcode = itemcode;
    }

    public boolean getSoldOut(){
        return this.soldout;
    }

    public void setSoldOut(boolean soldout){
        this.soldout=soldout;
    }
}
