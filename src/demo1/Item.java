package demo1;
public class Item {
	private int x;
	private int y;
	private String name;
	public Item(int x,int y,String s){
		this.setX(x);
		this.setY(y);
		this.setName(s);
		
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
