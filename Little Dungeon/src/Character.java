import java.util.*;

public class Character {
	
	Scanner scan = new Scanner(System.in);

			String name;
			int strength;
			int dext;
			int intell;
			int life;
			int mana;
			int armor;
			int magicArmor;
			int nbOfKeys;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getStrength() {
				return strength;
			}
			public void setStrength(int strength) {
				this.strength = strength;
			}
			public int getDext() {
				return dext;
			}
			public void setDext(int dext) {
				this.dext = dext;
			}
			public int getIntell() {
				return intell;
			}
			public void setIntell(int intell) {
				this.intell = intell;
			}
			public int getLife() {
				return life;
			}
			public void setLife(int life) {
				this.life = life;
			}
			public int getMana() {
				return mana;
			}
			public void setMana(int mana) {
				this.mana = mana;
			}
			public int getArmor() {
				return armor;
			}
			public void setArmor(int armor) {
				this.armor = armor;
			}
			public int getMagicArmor() {
				return magicArmor;
			}
			public void setMagicArmor(int magicArmor) {
				this.magicArmor = magicArmor;
			}
			public int getNbOfKeys() {
				return nbOfKeys;
			}
			public void setNbOfKeys(int nbOfKeys) {
				this.nbOfKeys = nbOfKeys;
			}
		
			
			public void fight(Foe ennemi) throws InterruptedException {
				System.out.println("You face a "+ennemi.getName());
				boolean flea = false;
				while(flea==false && ennemi.getLife()>0 && getLife()>0){
					System.out.println("Your turn:\n1-Attack\n2-Magic\n3-Item\n4-Run");
					int x = scan.nextInt();
					if(x==1) {
						System.out.println("You try to land a blow to "+ennemi.getName()+" with your weapon!");
						int y = (int) Math.floor(Math.random() * 11)+ennemi.getDext();
						if(y<15) {
						System.out.println("You land a hit of "+(getStrength()-ennemi.getArmor())+" damages!");
						ennemi.setLife(ennemi.getLife()-(getStrength()-ennemi.getArmor()));
						}
						else {
							System.out.println("You missed!");
						}
					}
					else if(x==2) {
					
					}
					else if(x==3) {
						
					}
					else {
						System.out.println("You try to run away!");
						Thread.sleep(3000);
						int y = (int) Math.floor(Math.random() * 101)+ennemi.getDext();
						if(y<50) {
							System.out.println("You run away from the fight!");
							flea=true;
						}
						else {
							System.out.println("You couldn't run from your foe, the fight continues");
						}
					}
					
					if(ennemi.getLife()>0) {
					
						System.out.println(ennemi.getName()+" attacks!");
						int y = (int) Math.floor(Math.random() * 11)+getDext();
						if(y<25) {
							System.out.println("He lands a hit of "+(ennemi.getStrength()-getArmor())+" damages!");
							setLife(getLife()-(ennemi.getStrength()-getArmor()));
							System.out.println("You have "+getLife()+" health points.");
						}
						else {
							System.out.println(ennemi.getName()+" attack missed!");
						}
					}
				}
				if(flea==true) {
					System.out.println("You managed to escape the fight!");
				}
				else if(ennemi.getLife()<=0) {
					System.out.println("You killed "+ennemi.getName()+"!");
				}
				else if(getLife()==0){
					System.out.println("You died...");
				}
				else {
					System.out.println("Game bug..");
				}
			}
		
}

