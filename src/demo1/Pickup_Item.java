package demo1;
public class Pickup_Item extends Item{
	static int key=0;
	static int Sword =0;
	
	public Pickup_Item(int x, int y, String name) {
		super(x, y, name);
		
	}
	
	public int getSword() {
	
		return Sword;
		
	}
	
	public void setPickup(String name) {
		if(name.equals("K")) {
			key++;
		}
		if(name.equals("S")) {
			Sword++;
		}
	}
	

}
