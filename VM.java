import java.io.*;
import java.util.*;
public class VM {
    public static void main(String[] args) {
	Random r = new Random();
	ArrayList<String> itemNames = new ArrayList<String>();
	itemNames.add("Beef Jerky");
	itemNames.add("Sliced Apples");
	itemNames.add("Potato Chips");
	itemNames.add("Chocolate Chip Cookies");
	itemNames.add("Oatmeal Cookies");
	itemNames.add("Airheads");
	itemNames.add("Nacho Chips");
	itemNames.add("Granola Bar");
	itemNames.add("SunChips");
	ArrayList<Items> items = new ArrayList<Items>();
	for(int i = 0; i < 20; i ++){
	    int rand = r.nextInt(9);
	    items.add(new Items(itemNames.get(rand)));
	}
	for(int i = 0; i < 20; i ++){
	    //System.out.println(items.get(i).getname()+":"+items.get(i).getstocks() + "-"+ items.get(i).getsprice() +"/" + items.get(i).getbprice());
	}
    }
}
