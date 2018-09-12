package demo1;
import java.awt.geom.Point2D.Double;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		int size = 10;
		String[][] c = {
				{"p","*"," "," "," "," "," "," "," "," "," "},
				{" ","*"," "," "," "," "," "," "," "," "," "},
				{" ","*"," "," "," "," "," "," "," "," "," "},
				{" ","*"," ","*"," "," "," "," ","*","*","*"},
				{"$","*"," ","*"," ","D"," "," ","*","D","*"},
				{" ","$"," ","*","K","*"," "," ","*"," "," "},
				{" "," "," ","*","*","*"," "," "," "," "," "},
				{" ","*"," "," "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "," "," "," "},
				{"*","*","*","*","*","*","*","*","*","E"," "},
				{" "," "," "," "," "," "," "," "," "," "," "},
		};
		String[] action = {
			"D","D","D","L","D","R","D","R","R","U","U","U","R","R","D","D","D","U","R","R","R","R"
				
		};
		
		Board b = new Board(size,c);
		
		printBoard(b);
		Game_Switch gs = new Game_Switch(b);
		
		for(int i=0;i<action.length;i++) {
			System.out.print("\nAround"+i+"\n");
			
			gs.Player_Action(action[i]);
			gs.Enemy_Action(action[i]);
			
			printBoard(b);
		}
		
		printItemList(b);
		printBagList(b);
		
	}
	static public void printBoard(Board b) {
		for(int i=0;i<b.getSize();i++) {
			for(int j=0;j<b.getSize();j++) {
				System.out.print(b.getMap()[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	static public void printItemList(Board b) {
		System.out.print("\nprintItemList\n");
		for (Entry<Double, Item> me : b.getItemList().entrySet()) {
			System.out.println(me.getKey()+"          "+me.getValue().getName());
			
			
		}
	}
	static public void printBagList(Board b) {
		System.out.print("\nprintBagList\n");
		System.out.print(b.getPlayer().getBag().toString()+"\n");
	}
}
