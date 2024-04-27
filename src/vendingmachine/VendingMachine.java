package vendingmachine;
import inventory.Inventory;
import coin.Coin;
import java.util.*;

public class VendingMachine {

    private VendingMachineState vendingmachinestate;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingmachinestate = new VendingMachineState();
        inventory =new Inventory(10);
        coinList= new ArrayList<>();
    }
    public VendingMachineState getVendingMachineState(){
        return this.vendingmachinestate;
    }

    public void setVendingMachineState(VendingMachineState vendingmachinestate){
        this.vendingmachinestate=vendingmachinestate;
    }

    public Inventory gInventory(){
         return this.inventory;

    }

    public void setInventory(Inventory inventory){
        this.inventory=inventory;
    }

    public List<Coin> getCoinList(){
        return this.coinList;
    }

    public void setCoinList(List<Coin> coinList){
        this.coinList=coinList;
    }
}
