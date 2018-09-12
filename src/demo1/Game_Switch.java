package demo1;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import java.util.Map.Entry;

public class Game_Switch {
	private Board board;
	
	public Game_Switch(Board b) {
		this.setBoard(b);
		//set enemy
		
	}
	public void Player_Action(String Action) {
		//action up down left right
		Action action = new Action(board,board.getPlayer());
		board.getPlayer().setLast_x(board.getPlayer().getX());
		board.getPlayer().setLast_y(board.getPlayer().getY());
		if(Action.equals("U")) {
			action.moveup();
		}
		else if(Action.equals("D")) {
			action.movedown();		
		}
		else if(Action.equals("R")) {
			action.moveright();
		}
		else if(Action.equals("L")) {
			action.moveleft();
		}
		else if(Action.equals("O")) {
			//check the around to find someone can be kill
		}
		else if(Action.equals("A")) {
			//check the around to find someone can be kill
		}
		else if(Action.equals("S")) {
			//check the around to find someone can be kill
		}
		else if(Action.equals("I")) {
			//check the around to find someone can be kill
		}
		//action pickup 
		Point2D.Double p = new Point2D.Double(board.getPlayer().getX(),board.getPlayer().getY());
		Item i = board.getItemList().get(p);
		if(i!=null) {
			if(board.getPlayer().pickup(i.getName())) {
				board.getItemList().remove(p);
			}
			else {
				if(board.getPlayer().useitem(i.getName())) {
					board.getItemList().remove(p);

				}
				else {
					//can not use and backwords
					System.out.print("Player can not pass\n");
					
					
					
				}
			}
			
			
		}
		//action kill 
		//action put boom
		//action push boulder
	}
	public void Enemy_Action(String Action) {
		//action up down left right
		for (Entry<Double, Enemy> me : board.getEnemy().entrySet()) {
			Action action = new Action(board,me.getValue());
		
			if(Action.equals("U")) {
				action.moveup();
			}
			else if(Action.equals("D")) {
				action.movedown();		
			}
			else if(Action.equals("R")) {
				action.moveright();
			}
			else if(Action.equals("L")) {
				action.moveleft();
			}
			
			else if(Action.equals("O")) {
				//check the around to find someone can be kill
			}
			else if(Action.equals("A")) {
				//check the around to find someone can be kill
			}
			else if(Action.equals("S")) {
				//check the around to find someone can be kill
			}
			else if(Action.equals("I")) {
				//check the around to find someone can be kill
			}
		}
		//close to enemy
		//firstly close to enemy and then away from enemy
	}
	
	
	
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	
	
}
