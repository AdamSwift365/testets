package demo1;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author mac
 *
 */
/*    player                p
 *    Wall                  *
 *    Exit                  E
 *    treasure              $
 *    Door                  D
 *    Key                   K
 *    Boulder               +
 *    Floor switch          =
 *    Unlit bomb	        O
 *    Pit                   _
 *    hunter	            h
 *    strategist            s
 *    hound                 H
 *    coward				c
 *    Sword					S
 *    Arrow					A
 *    Invincibility potion  I
 *    Hover potion			P
 */
public class Board{
	private int size;
	private String[][] map;
	private Player player;
	private HashMap<Point2D.Double,Enemy> enemy = new HashMap<Point2D.Double,Enemy>();
	private HashMap<Point2D.Double,Item> ItemList = new HashMap<Point2D.Double,Item>();
	
	public Board(int size,String[][] text) {
		this.setSize(size);
		this.map = new String[size][size];
		setInitMap(size,text);
		
	}
	/**
	 * init the map and the itemlist
	 * @param size
	 * @param text
	 */
	public void setInitMap(int size,String[][] text) {
		for(int i=0;i<this.size;i++) {
			for(int j=0;j<this.size;j++) {
				this.map[i][j] = text[i][j];
				if(map[i][j].equals("p")) {
					setPlayer(i,j,map[i][j]);
				}
				else if(map[i][j].equals("h")||map[i][j].equals("s")||map[i][j].equals("H")||map[i][j].equals("c")) {
					setEnemy(i,j,map[i][j]);
				}
				else if(!(map[i][j].equals(" ")||map[i][j].equals("*"))){
					setItemList(i,j,map[i][j]);
				}
			}
		}
		
		
	}
	
	
	public String[][] getMap() {
		return this.map;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * edit the item list
	 * @param i
	 */
	
	/**
	 * edit the map
	 * @param new_x
	 * @param new_y
	 * @param x
	 * @param y
	 * @param name
	 */
	public void EditMap(int new_x,int new_y,int x,int y,String name1,String name2) {
		if(name2==null) {
			name2 = " ";
		}
		map[x][y] = name2;
		map[new_x][new_y] = name1;
		
		
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(int x,int y,String name) {
		this.player = new Player(x,y,name);
	}
	public void setEnemy(int x,int y,String name) {
		Enemy e = new Enemy(x,y,name);
		Point2D.Double p = new Point2D.Double(x,y);
		enemy.put(p,e);
	}
	public HashMap<Point2D.Double,Enemy> getEnemy() {
		return this.enemy;
	}
	public HashMap<Point2D.Double,Item> getItemList() {
		return ItemList;
	}
	public void setItemList(int x,int y,String name) {
		Item e = new Item(x,y,name);
		Point2D.Double p = new Point2D.Double(x,y);
		ItemList.put(p,e);
	}
	public boolean get_win() {
		System.out.print("\nYou are not win");
		return false;
	}
	
	
	
}
	
	
	

