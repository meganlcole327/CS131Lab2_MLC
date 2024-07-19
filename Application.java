
//(11) - Application class to fully test Wizard class

public class Application {

	public static void main(String[] args) {
		
		//test toString
		
		Wizard wiz = new Wizard("Ruby", 10, 1342, false);
		System.out.println(wiz.toString());
		
		System.out.println("\n=============================\n");
		
		//test name, health, and key
		
		System.out.println("Character's name: " +wiz.getName());
		System.out.println("Initial health: " + wiz.getHealth());
		System.out.println("Key number: " + wiz.getKey());
		
		System.out.println("\n=============================\n");
		
		//test damage while locked
		wiz.lock(1342);
		System.out.println("Let's protect the wizard! Is the key locked? \nTrue/False: " + wiz.isLocked());
		wiz.takeDamage(3);
		System.out.println("Health after the elf tried to attack with the key locked: " + wiz.getHealth() + "\nWoo hoo! " + wiz.getName() + " is safe!");
		
		System.out.println("\n=============================\n");
		
		//test damage while unlocked
		wiz.unlock(1342);
		System.out.println("Let's protect the wizard! Is the key locked? \nTrue/False: " + wiz.isLocked());
		wiz.takeDamage(2);
		System.out.println("Health after the elf tried to attack with the key unlocked: " + wiz.getHealth()+ "\nOh no! " + wiz.getName() + " has lost health after the elf's attack!");
		
		System.out.println("\n=============================\n");
			
		//test setting key - check to make sure a different key does not change the wizard
		wiz.setKey(9876);
		System.out.println("Trying to set a new key!");
		wiz.lock(9876);
		System.out.println("Wizard was locked with new key. (True/False): " + wiz.isLocked());
		
		System.out.println("\n=============================\n");
		
		//re-try lock with correct key
		wiz.lock(1342);
		System.out.println(wiz.getName() + " is locked again with the correct key. (True/False): " + wiz.isLocked());
		wiz.unlock(1342);
		System.out.println(wiz.getName() + " is locked again with the correct key. (True/False): " + wiz.isLocked());
		
	} //end main

} //end class
