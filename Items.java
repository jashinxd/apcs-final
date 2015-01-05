public class Items{

    private String name;
    private double Bprice;
    private double Sprice;
    private int stocks;
        
    public Items(String n) {
	name = n;
	if (name.equals("Beef Jerky")){
	    Bprice = 1.0;
	    Sprice = 1.5;
	}
	if (name.equals("Sliced Apples")){
	    Bprice = 0.75;
	    Sprice = 1.0;
	}
	if (name.equals("Potato Chips")){
	    Bprice = 0.5;
	    Sprice = 1.0;
	}
	if (name.equals("Chocolate Chip Cookies")){
	    Bprice = 1.0;
	    Sprice = 1.75;
	}
	if (name.equals("Oatmeal Cookies")){
	    Bprice = 1.0;
	    Sprice = 1.5;
	}
	if (name.equals("Airheads")){
	    Bprice = 0.5;
	    Sprice = 1.0;
	}
	if (name.equals("Nacho Chips")){
	    Bprice = 0.5;
	    Sprice = 1.0;
	}
	if (name.equals("Granola Bar")){
	    Bprice = 0.25;
	    Sprice = 1.0;
	}
	if (name.equals("SunChips")){
	    Bprice = 0.25;
	    Sprice = 1.0;
	}
    }

    
    
    
}
