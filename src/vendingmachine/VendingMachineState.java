package vendingmachine;
import coin.Coin;
import item.Item;
import java.util.*;

public class VendingMachineState {
    public VendingMachineState(){
        System.out.println("Currently machine is in Idle state");
    }

    public void clickOnStartProductSelectionButton(){
        System.out.println("Vending machine is in HasMoney State");
    }

    public void InsertCoin(VendingMachine vendingMachine,Coin coin){
        System.out.println("vending machine is in Hasmoney state");
        System.out.println("Accepted the coin");
        vendingMachine.getCoinList();
    }

    public List<Coin> reFundFullMoney(VendingMachine vendingMachine){
        System.out.println("returned the full money back in coin dispense tray");
        vendingMachine.setVendingMachineState(new VendingMachineState());
        return vendingMachine.getCoinList();
    }

    public void updateInventory(VendingMachine vendingMachine,Item item,int itemCodeNumber){
        vendingMachine.gInventory().addItem(item,itemCodeNumber);
    }

    public void dispenseProduct(VendingMachine vendingMachine,int itemCodeNumber){
        System.out.println("Curetly vending machine is in dispense state");
        System.out.println("Product has been dispensed");
        vendingMachine.gInventory().updateSoldOutItem(itemCodeNumber);
        vendingMachine.setVendingMachineState(new VendingMachineState());
    }

    public void chooseProduct(VendingMachine vendingMachine,int itemCodeNumber){
        //1.get item for item code number
        //2.total amount paid by user
        //3.compare product and amount paid by the user
        //4.Dispense the product
        Item item = vendingMachine.gInventory().getItem(itemCodeNumber);

        int paidByUser=0;
        for(Coin coin:vendingMachine.getCoinList()){
            paidByUser += coin.getValue();
        }
        if(item.getPrice()>paidByUser){
            reFundFullMoney(vendingMachine);
            return;
        }
        else{
            getChange(item.getPrice(),paidByUser);
            dispenseProduct(vendingMachine, itemCodeNumber);
            return;
        }

    }

    public void getChange(int itemPrice,int paidByUser){
        System.out.println("Returned the change in coin dispensery tray"+(paidByUser-itemPrice)); 
    }

     


}
