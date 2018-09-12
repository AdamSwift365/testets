package demo1;
public class Player extends Item{
	
	private Bag bag = new Bag();
	private int last_x;
	private int last_y;
	
	public Player(int x,int y,String name) {
		super(x,y,name);
	}
	
	public Bag getBag(){
		return this.bag;
	}
	public boolean pickup(String i) {
		
		switch(i) {
			case "$":
				bag.addTreasure();
				return true;
			case "K":
				
				return bag.addKey();
			case "O":
				bag.addBomb();
				return true;
			case "A":
				bag.addArrow();
				return true;
			case "S":
				return bag.addSword();
			case "I":
				bag.addInvPotion();
				return true;
			case "P":
				bag.addHovPotion();
				return true;
				
				default:
					return false;
		}
		
		
	}
	public boolean useitem(String i) {
		switch(i) {
		
		case "D":
			//use key
			return bag.useKey();
			
		case "O":
			return bag.useBomb();
		case "A":
			//use Arrow	
			return bag.useArrow();
			
		case "S":
			//Sword	
			return bag.useSword();
			
		case "I":
			//Invincibility potionxs
			return bag.useInvPotion();
			
		case "H":
			return bag.getHover_potion();
			default:
					return false;
	}
		
	}
	public void pushBoulder(Item i,Board board) {
		//move bounder
		//move people
		
	}

	public int getLast_x() {
		return last_x;
	}

	public void setLast_x(int last_x) {
		this.last_x = last_x;
	}

	public int getLast_y() {
		return last_y;
	}

	public void setLast_y(int last_y) {
		this.last_y = last_y;
	}

	
	
	
	
}
