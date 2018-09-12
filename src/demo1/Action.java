package demo1;
public class Action {
	private Board board;
	private Item player;
	
	public Action(Board b,Item player){
		this.board = b;
		this.player = player;
		
				
	}
	public void moveup() {
		int new_x = player.getX()-1;
		int new_y = player.getY();
		
		if(checkmove(new_x,new_y)) {
			
			move(new_x,new_y);
		}
		else {
			System.out.print("You can not move up\n");
		}
	}
	public void movedown() {
		int new_x = player.getX()+1;
		int new_y = player.getY();
		if(checkmove(new_x,new_y)) {
			move(new_x,new_y);
		}
		else {
			System.out.print("You can not move down\n");
		}
	}
	public void moveleft() {
		int new_x = player.getX();
		int new_y = player.getY()-1;
		if(checkmove(new_x,new_y)) {
			move(new_x,new_y);
		}
		else {
			System.out.print("You can not move left\n");
		}
	}
	public void moveright() {
		int new_x = player.getX();
		int new_y = player.getY()+1;
		
		if(checkmove(new_x,new_y)) {
			move(new_x,new_y);
			
		}
		else {
			System.out.print("You can not move right\n");
		}
	}
	//public abstract boolean checkup();
	
	
	public void move(int new_x,int new_y) {
		//remove the old player in hashmap list
		
		this.board.EditMap(new_x, new_y, player.getX(), player.getY(), player.getName(),null);
		//set the new player in hashmap list
		this.player.setX(new_x);
		this.player.setY(new_y);
		
	}
	
	public boolean checkmove(int new_x,int new_y) {
		
		if(new_x<0||new_y<0||new_x>(this.board.getSize()-1)||new_y>(this.board.getSize()-1)) {
			return false;
		}
		
		String s = board.getMap()[new_x][new_y];
		if(player.getName().equals("p")) {
			Player p = (Player)player;
			switch(s) {
			case "*":
				return false;
			case "E":
				if(board.get_win()) {
					return true;
				}
				return false;
			case "D":
				if(p.getBag().hasKey()) {
					return true;
				}
				return false;
			case "+":
				/*if() {
					
				}*/
				//set the dir for two that can not push
				return false;
			case "=":
				//push the 
				return false;
			case "_":
				if(p.getBag().getHover_potion()) {
					return true;
				}
				default:
					return true;
			
			}
		}
		else {
			if(s.equals(" ")) {
				return true;
			}
			
		}
	
	return true;
	}

}
