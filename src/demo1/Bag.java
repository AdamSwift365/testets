package demo1;
public class Bag {
	 private int treasure;
	 private boolean key;
	 private int unlit_bomb;
	 private int invincible_potion;
	 private boolean hover_potion;
	 private boolean sword;
	 private int useTime_sword;
	 private int arrows;
	 
	 public Bag() {
	  treasure = 0;
	  key = false;
	  unlit_bomb = 0;
	  invincible_potion = 0;
	  hover_potion = false;
	  sword = false;
	  arrows = 0;
	  useTime_sword = 0;
	 }
	 
	 public boolean addKey() {
	  if(hasKey()) {
		  System.out.println("already has a key");
	   	  return false;
	  }
	  else {
		  key = true;
		  return true;
	  }
	 }
	 
	 public void addTreasure() {
	  this.treasure++;
	 }

	 public void addBomb() {
	  this.unlit_bomb++;
	 }

	 public boolean addSword() {
	  if(hasSword()) {
	   System.out.println("already has a sword");
	  return false;
	  }
	  else {
	   sword = true;
	   this.useTime_sword = 5;
	   return true;
	  }
	 }

	 public void addArrow() {
	  this.arrows++;
	 }

	 public void addInvPotion() {
	  this.invincible_potion++;
	 }

	 public void addHovPotion() {
	  this.hover_potion = true;
	 }
	 
	 //get method
	 public int getTreasure() {
	  return treasure;
	 }

	 public boolean hasKey() {
	  return key;
	 }

	 public int getUnlit_bomb() {
	  return unlit_bomb;
	 }

	 public int getInvincible_potion() {
	  return invincible_potion;
	 }

	 public boolean getHover_potion() {
	  return hover_potion;
	 }

	 public boolean hasSword() {
	  return sword;
	 }

	 public int getArrows() {
	  return arrows;
	 }

	 public boolean useKey() {
		 if(key == false) {
			 System.out.println("you do not have key");
			 return false;
		 }
		 else {
			 key = false;
			 return true;
		 }
	 }
	 
	 public boolean useSword() {
	  if(hasSword() && this.useTime_sword != 0) {
	   this.useTime_sword--;
	   if(this.useTime_sword == 0)
	    sword = false;
	  }else {
	   System.out.println("no sword in bag");
	  }
	  return false;
	 }

	 public boolean useBomb() {
	  if(this.unlit_bomb != 0) {
	   unlit_bomb--;
	   return true;
	  }
	  return false;
	 }

	 public boolean useArrow() {
	  if(this.arrows != 0) {
	   arrows--;
	   return true;
	  }
	  return false;
	 }

	 public boolean useInvPotion() {
	  if(this.invincible_potion != 0) {
	   this.invincible_potion--;
	   return true;
	  }
	  return false;
	 }
	 public String toString() {
		 return "\n treasure          " + this.treasure+
		 		"\n key               " + this.key+
		 		"\n unlit_bomb        " + this.unlit_bomb+
		 		"\n invincible_potion " + this.invincible_potion+
		 		"\n hover_potion      " + this.hover_potion+
		 		"\n sword             " + this.sword+
		 		"\n arrows            "+this.arrows;
	 }
}
