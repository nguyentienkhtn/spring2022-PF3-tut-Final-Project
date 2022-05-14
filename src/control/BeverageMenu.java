package control;

import jdk.swing.interop.SwingInterOpUtils;
import model.Beverage;

import java.util.ArrayList;
import java.util.List;

public class BeverageMenu {
    private List<Beverage> menu;

    public BeverageMenu() {
        menu = new ArrayList<>();
    }

    public void add(Beverage newItem){
        menu.add(newItem);
    }

    public void remove (Beverage removeItem)
    {
        menu.remove(removeItem);
    }
    public void update(String itemID, double price){
        int temp = search(itemID);
        if(temp == -1)
        {
            System.out.println("non existing id! Failed to update");
            return;
        }
        menu.get(temp).setPrice(price);
    }
    
    public int search(String itemID){
        for (int i = 0; i < menu.size(); i++) {
            if(menu.get(i).getId().equals(itemID))
                return i;
        }
        return -1;
    }

}
