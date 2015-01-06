import java.io.*;
import java.util.*;
public class Items{
    private String name;
    private double Bprice;
    private double Sprice;
    private int stocks;
    public Items(String n){
	Random r = new Random();
	int s = r.nextInt(15) + 1;
	name = n;
	if (n.equals("Beef Jerky")){
	    Bprice = 1.00;
	    Sprice = 1.50;
	    stocks = s;
	}
	if (n.equals("Sliced Apples")){
	    Bprice = 0.75;
	    Sprice = 1.00;
	    stocks = s;
	}
	if (n.equals("Potato Chips")){
	    Bprice = 0.50;
	    Sprice = 1.00;
	    stocks = s;
	}
	if (n.equals("Chocolate Chip Cookies")){
	    Bprice = 1.0;
	    Sprice = 1.75;
	    stocks = s;
	}
	if (n.equals("Oatmeal Cookies")){
	    Bprice = 1.0;
	    Sprice = 1.5;
	    stocks = s;
	}
	if (n.equals("Airheads")){
	    Bprice = 0.5;
	    Sprice = 1.0;
	    stocks = s;
	}
	if (n.equals("Nacho Chips")){
	    Bprice = 0.5;
	    Sprice = 1.0;
	    stocks = s;
	}
	if (n.equals("Granola Bar")){
	    Bprice = 0.25;
	    Sprice = 1.0;
	    stocks = s;
	}
	if (n.equals("SunChips")){
	    Bprice = 0.50;
	    Sprice = 1.0;
	    stocks = s;
	}
	if (n.equals("Skittles")){
	    Bprice = 0.25;
	    Sprice = 1.0;
	    stocks = s;
	}
	if (n.equals("Fruit Snacks")){
	    Bprice = 0.25;
	    Sprice = 0.75;
	    stocks = s;
	}
	if (n.equals("Jello")){
	    Bprice = 0.50;
	    Sprice = 1.25;
	    stocks = s;
	}
	if (n.equals("Chocolate Bar")){
	    Bprice = 0.25;
	    Sprice = 1.0;
	    stocks = s;
	}
	if (n.equals("Graham Crackers")){
	    Bprice = 0.50;
	    Sprice = 1.0;
	    stocks = s;
	}
	if (n.equals("Rice Krispies")){
	    Bprice = 0.75;
	    Sprice = 1.25;
	    stocks = s;
	}
	if (n.equals("Starburst")){
	    Bprice = 0.25;
	    Sprice = 0.75;
	    stocks = s;
	}
    }
    public String getname(){
	return name;
    }
    public double getbprice(){
	return Bprice;
    }
    public double getsprice(){
	return Sprice;
    }
    public int getstocks(){
	return stocks;
    }
}
