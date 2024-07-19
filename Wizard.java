/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */

//(5) - modify Wizard class to enforce the Lockable interface

public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	//(2) finish the constructors
	
	public Wizard() {
		this.name = "";
		this.health = 0;
		this.key = 0;
		this.locked = false;
	
	}//end empty-argument constructor
	
	public Wizard(String name, int health, int key, boolean locked) {
		this.name = name;
		this.health = health;
		this.key = key;
		this.locked = false;
	
	}//end preferred constructor
	
	
	//(3) - implement takeDamage() method
			//if the wizard if protected by a lock, there should not be damage 
			//if a wizard is not protected by a lock, damage (int power) will be subtracted from the wizard's health
	
	//(10) - modify takeDamage()
	
	public void takeDamage(int power) {
		if (!isLocked()) {
			this.health -= power;
		}//end if	
	}//end takeDamage
	
	//(1) set the Getters and Setters 

	public String getName() {
		return name;
	} //end getName - getter for name

	public void setName(String name) {
		this.name = name;
	} //end setName - setter for name

	public int getHealth() {
		return health;
	}  //end getHealth - getter for health

	public void setHealth(int health) {
		this.health = health;
	} //end setHealth - setter for health

	public int getKey() {
		return key;
	} //end getKey - getter for key

	//(6) - implement setKey
	
	public void setKey(int key) {
		if (key > 0 && this.key == 0) {
			this.key = key;	
		} //end if
	} //end setKey - setter for key
	
	//(7) - implement isLocked

	public boolean isLocked() {
		return locked;
	} //end isLocked
	
	//(8) - implement lock
	
	public void lock(int key) {
		if (this.key == key) {
			this.locked = true;
		} //end if
	} //end lock
	
	//(9) - implement unlock
	
	public void unlock(int key) {
		if (this.key == key) {
			this.locked = false;
		} //end if
	} //end unlock
	

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class

