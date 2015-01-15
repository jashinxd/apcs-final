import java.io.*;
import java.util.*;
public class VM {
    private ArrayList<String> itemNames;
    private ArrayList<Items> items;
    public VM(){
	Random r = new Random();
        itemNames = new ArrayList<String>();
	itemNames.add("Beef Jerky");
	itemNames.add("Sliced Apples");
	itemNames.add("Potato Chips");
	itemNames.add("Chocolate Chip Cookies");
	itemNames.add("Oatmeal Cookies");
	itemNames.add("Airheads");
	itemNames.add("Nacho Chips");
	itemNames.add("Granola Bar");
	itemNames.add("SunChips");
	itemNames.add("Skittles");
	itemNames.add("Fruit Snacks");
	itemNames.add("Jello");
	itemNames.add("Chocolate Bar");
	itemNames.add("Graham Crackers");
	itemNames.add("Rice Krispies");
	itemNames.add("Starburst");
	itemNames.add("Haribo's");
	
        items = new ArrayList<Items>();
	//adds the items into the arraylist for later use
	//The Items are random and CAN repeat, like a real vending machine
	for(int i = 0; i < 20; i ++){
	    int rand = r.nextInt(17);
	    items.add(new Items(itemNames.get(rand)));
	}
    }
    public ArrayList<Items> getItems(){
	    return items;
	} 
}
