package inventory;

import item.ItemShelf;
import item.Item;

public class Inventory {
    private ItemShelf[] inventory;

    public Inventory(int n){
        inventory=new ItemShelf[n];
        initialEmptyInventory();
    }

    public ItemShelf[] getInventory(){
        return this.inventory;
    }

    public void setInventory(ItemShelf[] inventory){
        this.inventory=inventory;
    }

    public void initialEmptyInventory(){
        int startcode=101;
        for(int i=0;i<inventory.length;i++){
            ItemShelf itemShelf=new ItemShelf();
            itemShelf.setitemcode(startcode);
            itemShelf.setSoldOut(true);
            inventory[i]=itemShelf;
            startcode++;
        }
    }

    public void addItem(Item item,int itemcode){
        for(ItemShelf shelf:inventory){
            if(shelf.getItemcode()==itemcode){
                if(shelf.getSoldOut()==true){
                    shelf.setItem(item);
                    shelf.setSoldOut(false);
                }
            }
        }
    }

    public Item getItem(int itemcode){
        for(ItemShelf shelf: inventory){
            if(shelf.getItemcode() == itemcode){
                if(shelf.getSoldOut()){
                    System.out.println("Item is already soldout");
                    return new Item();
                }else{
                    return shelf.getItem();
                }
            }
        }
        System.out.println("Inalid item code");
        return new Item(); 
    }

    public void updateSoldOutItem(int itemCodeNumber){
        for(ItemShelf shelf:inventory){
            if(shelf.getItemcode()==itemCodeNumber){
                shelf.setSoldOut(true);
            }
        }
    }

}
