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
			int damages;
			int shieldArmor;
			int healthPotionNb;
			int manaPotionNb;
			
			
			public int getHealthPotion() {
				return healthPotionNb;
			}
			public void setHealthPotion(int healthPotion) {
				this.healthPotionNb = healthPotion;
			}
			public int getManaPotion() {
				return manaPotionNb;
			}
			public void setManaPotion(int manaPotion) {
				this.manaPotionNb = manaPotion;
			}
			public int getDamages() {
				return damages;
			}
			public void setDamages(int Damages) {
				this.damages = Damages;
			}
			public int getShieldArmor() {
				return shieldArmor;
			}
			public void setShieldArmor(int shieldArmor) {
				this.shieldArmor = shieldArmor;
			}
			
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
		
			
			static Magic fireMagic = new Magic();
			static Magic waterMagic = new Magic();
			static Magic airMagic = new Magic();
			static Magic earthMagic = new Magic();
			static Magic healingMagic = new Magic();
			static Potion healingPotion = new Potion();
			static Potion manaPotion = new Potion();
			static Weapon heroWeapon = new Weapon();
			static Armor heroArmor = new Armor();
			static Armor heroShield = new Armor();
			
			
			public void fight(Foe ennemi) throws InterruptedException {
				System.out.println("You face a "+ennemi.getName());
				boolean flea = false;
				while(flea==false && ennemi.getLife()>0 && getLife()>0){
					System.out.println("\n\nYour turn:\n1-Attack\n2-Magic\n3-Item\n4-Run");
					int x = scan.nextInt();
					if(x==1) {
						System.out.println("You try to land a blow to "+ennemi.getName()+" with your "+heroWeapon.getName()+"!");
						Thread.sleep(1500);
						int y = (int) Math.floor(Math.random() * 101)+(ennemi.getDext()-getDext());
						if(y<70) {
							int z=(int) Math.floor(Math.random() * 51);
							if(z>40) {
								System.out.println("Critical hit!");
								System.out.println("You land a hit of "+(z+getDamages()-ennemi.getArmor()-ennemi.getShieldArmor())+" damages!");
								ennemi.setLife(ennemi.getLife()-(getDamages()-ennemi.getArmor()-ennemi.getShieldArmor()));
							}
							else {
								System.out.println("You land a hit of "+(z+getDamages()-ennemi.getArmor()-ennemi.getShieldArmor())+" damages!");
								ennemi.setLife(ennemi.getLife()-(z+getDamages()-ennemi.getArmor()-ennemi.getShieldArmor()));
							}
						}
						else {
							System.out.println("You missed!");
						}
					}
					else if(x==2) {
						
						System.out.println("1-"+fireMagic.getName()+" - "+fireMagic.getManaCons()+" MP                2-"+waterMagic.getName()+" - "+waterMagic.getManaCons()+" MP\n3-"+airMagic.getName()+" - "+airMagic.getManaCons()+"MP          4-"+earthMagic.getName()+" - "+earthMagic.getManaCons()+" MP\n5-"+healingMagic.getName()+" - "+healingMagic.getManaCons());
						int z = scan.nextInt();
						if(z==1) {
							System.out.println("You cast a "+fireMagic.getName()+" at "+ennemi.getName()+"!");
							Thread.sleep(1500);
							setMana(getMana()-fireMagic.getManaCons());
							if(ennemi.getType().equals("fire")) {
								System.out.println("Your "+fireMagic.getName()+" gets absorb by "+ennemi.getName()+", making him stronger!");
								System.out.println(ennemi.getName()+" heals "+(fireMagic.getDamages()-ennemi.getMagicArmor())+" HP!");
								ennemi.setLife(ennemi.getLife()+(fireMagic.getDamages()-ennemi.getMagicArmor()));
							}
							else if(ennemi.getType().equals("water")){
								System.out.println(ennemi.getName()+" resists your "+fireMagic.getName()+" taking only half damages!");
								System.out.println(ennemi.getName()+" takes "+(fireMagic.getDamages()/2-ennemi.getMagicArmor())+" damages.");
								ennemi.setLife(ennemi.getLife()-(fireMagic.getDamages()/2-ennemi.getMagicArmor()));
							}
							else if(ennemi.getType().equals("earth")){
								System.out.println(ennemi.getName()+" gets badly hurt by your "+fireMagic.getName()+", taking double damages!");
								System.out.println(ennemi.getName()+" takes "+(fireMagic.getDamages()*2-ennemi.getMagicArmor())+" damages.");
								ennemi.setLife(ennemi.getLife()-(fireMagic.getDamages()*2)-ennemi.getMagicArmor());
							}
							else {
								System.out.println(ennemi.getName()+" gets hit by your "+fireMagic.getName()+", taking "+(fireMagic.getDamages()-ennemi.getMagicArmor())+" damages!");								
								ennemi.setLife(ennemi.getLife()-(fireMagic.getDamages()-ennemi.getMagicArmor()));
							}
							Thread.sleep(1500);
						}
						else if(z==2) {
							System.out.println("You cast a "+waterMagic.getName()+" at "+ennemi.getName()+"!");
							Thread.sleep(1500);
							setMana(getMana()-waterMagic.getManaCons());
							if(ennemi.getType().equals("water")) {
								System.out.println("Your "+waterMagic.getName()+" gets absorb by "+ennemi.getName()+", making him stronger!");
								System.out.println(ennemi.getName()+" heals "+(waterMagic.getDamages()-ennemi.getMagicArmor())+" HP!");
								ennemi.setLife(ennemi.getLife()+(waterMagic.getDamages()-ennemi.getMagicArmor()));
							}
							else if(ennemi.getType().equals("air")){
								System.out.println(ennemi.getName()+" resists your "+waterMagic.getName()+" taking only half damages!");
								System.out.println(ennemi.getName()+" takes "+(waterMagic.getDamages()/2-ennemi.getMagicArmor())+" damages.");
								ennemi.setLife(ennemi.getLife()-(waterMagic.getDamages()/2-ennemi.getMagicArmor()));
							}
							else if(ennemi.getType().equals("fire")){
								System.out.println(ennemi.getName()+" gets badly hurt by your "+waterMagic.getName()+", taking double damages!");
								System.out.println(ennemi.getName()+" takes "+(waterMagic.getDamages()*2-ennemi.getMagicArmor())+" damages.");
								ennemi.setLife(ennemi.getLife()-(waterMagic.getDamages()*2-ennemi.getMagicArmor()));
							}
							else {
								System.out.println(ennemi.getName()+" gets hit by your "+waterMagic.getName()+", taking "+(waterMagic.getDamages()-ennemi.getMagicArmor())+" damages!");								
								ennemi.setLife(ennemi.getLife()-(waterMagic.getDamages()-ennemi.getMagicArmor()));
							}
							Thread.sleep(1500);
						}
						else if(z==3) {
							System.out.println("You cast a "+airMagic.getName()+" at "+ennemi.getName()+"!");
							Thread.sleep(1500);
							setMana(getMana()-airMagic.getManaCons());
							if(ennemi.getType().equals("air")) {
								System.out.println("Your "+airMagic.getName()+" gets absorb by "+ennemi.getName()+", making him stronger!");
								System.out.println(ennemi.getName()+" heals "+(airMagic.getDamages()-ennemi.getMagicArmor())+" HP!");
								ennemi.setLife(ennemi.getLife()+(airMagic.getDamages()-ennemi.getMagicArmor()));
								
							}
							else if(ennemi.getType().equals("earth")){
								System.out.println(ennemi.getName()+" resists your "+airMagic.getName()+" taking only half damages!");
								System.out.println(ennemi.getName()+" takes "+(airMagic.getDamages()/2-ennemi.getMagicArmor())+" damages.");
								ennemi.setLife(ennemi.getLife()-(airMagic.getDamages()/2-ennemi.getMagicArmor()));
							}
							else if(ennemi.getType().equals("water")){
								System.out.println(ennemi.getName()+" gets badly hurt by your "+airMagic.getName()+", taking double damages!");
								System.out.println(ennemi.getName()+" takes "+(airMagic.getDamages()*2-ennemi.getMagicArmor())+" damages.");
								ennemi.setLife(ennemi.getLife()-(airMagic.getDamages()*2-ennemi.getMagicArmor()));
							}
							else {
								System.out.println(ennemi.getName()+" gets hit by your "+airMagic.getName()+", taking "+(airMagic.getDamages()-ennemi.getMagicArmor())+" damages!");								
								ennemi.setLife(ennemi.getLife()-(airMagic.getDamages()-ennemi.getMagicArmor()));
							}
							Thread.sleep(1500);
						}
						else if(z==4) {
							System.out.println("You cast a "+earthMagic.getName()+" at "+ennemi.getName()+"!");
							Thread.sleep(1500);
							setMana(getMana()-earthMagic.getManaCons());
							if(ennemi.getType().equals("earth")) {
								System.out.println("Your "+earthMagic.getName()+" gets absorb by "+ennemi.getName()+", making him stronger!");
								System.out.println(ennemi.getName()+" heals "+(earthMagic.getDamages()-ennemi.getMagicArmor())+" HP!");
								ennemi.setLife(ennemi.getLife()+(earthMagic.getDamages()-ennemi.getMagicArmor()));
								
							}
							else if(ennemi.getType().equals("fire")){
								System.out.println(ennemi.getName()+" resists your "+earthMagic.getName()+" taking only half damages!");
								System.out.println(ennemi.getName()+" takes "+(earthMagic.getDamages()/2-ennemi.getMagicArmor())+" damages.");
								ennemi.setLife(ennemi.getLife()-(earthMagic.getDamages()/2-ennemi.getMagicArmor()));
							}
							else if(ennemi.getType().equals("air")){
								System.out.println(ennemi.getName()+" gets badly hurt by your "+earthMagic.getName()+", taking double damages!");
								System.out.println(ennemi.getName()+" takes "+(earthMagic.getDamages()*2-ennemi.getMagicArmor())+" damages.");
								ennemi.setLife(ennemi.getLife()-(earthMagic.getDamages()*2-ennemi.getMagicArmor()));
							}
							else {
								System.out.println(ennemi.getName()+" gets hit by your "+earthMagic.getName()+", taking "+(earthMagic.getDamages()-ennemi.getMagicArmor())+" damages!");								
								ennemi.setLife(ennemi.getLife()-(earthMagic.getDamages()-ennemi.getMagicArmor()));
							}
							Thread.sleep(1500);
						}
						else if(z==5) {
							System.out.println("You cast "+healingMagic.getName()+", healing "+healingMagic.getDamages()+" HP!");
							setMana(getMana()-healingMagic.getManaCons());
							setLife(getLife()+healingMagic.getDamages());
							if(getLife()>3000) {
								setLife(3000);
							}
							System.out.println("You get healed up to "+getLife()+" HP.");
							Thread.sleep(1500);
						}
						System.out.println("You have "+getMana()+" MP.");
											
						
					}
					else if(x==3) {
						System.out.println("1-"+healingPotion.getName()+"\n2-"+manaPotion.getName());
						int z = scan.nextInt();
						if(z==1) {
							System.out.println("You drink a "+healingPotion.getName()+" recovering "+healingPotion.getHealing()+" HP!");
							setLife(getLife()+healingPotion.getHealing());
							if(getLife()>3000) {
								setLife(3000);
							}
							System.out.println("You get healed up to "+getLife()+" HP.");
						}
						else if(z==2) {
							System.out.println("You drink a "+manaPotion.getName()+" recovering "+manaPotion.getHealing()+" MP!");
							setMana(getMana()+manaPotion.getHealing());
							if(getMana()>300) {
								setMana(300);
							}
							System.out.println("You restore mana up to "+getMana()+" HP.");
						}
						
					}
					else {
						System.out.println("You try to run away!");
						Thread.sleep(1500);
						int y = (int) Math.floor(Math.random() * 101)+ennemi.getDext();
						if(y<50) {
							System.out.println("You run away from the fight!");
							flea=true;
						}
						else {
							System.out.println("You couldn't run from your foe, the fight continues");
						}
					}
					Thread.sleep(1500);
					if(ennemi.getLife()>0) {
					
						System.out.println(ennemi.getName()+" attacks!");
						int z = (int) Math.floor(Math.random() * 11);
						Thread.sleep(1500);
						
						if(z<=4) {
							System.out.println(ennemi.getName()+" uses "+ennemi.foeMagic.getName()+"!");
							System.out.println("You get hit for "+(ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor())+"!");
							setLife(getLife()-(ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor()));
							System.out.println("You have "+getLife()+" health points.");
						}
						else {
							int y = (int) Math.floor(Math.random() * 101)+(ennemi.getDext()-getDext());
							if(y>50) {
								System.out.println("He lands a hit of "+(ennemi.getStrength()-getArmor()-getShieldArmor())+" damages!");
								setLife(getLife()-(ennemi.getStrength()-getArmor()-getShieldArmor()));
								System.out.println("You have "+getLife()+" health points.");
							}
							else {
								System.out.println(ennemi.getName()+" attack missed!");
							}
						}
					}
					Thread.sleep(1500);
				}
				if(flea==true) {
					System.out.println("You managed to escape the fight!");
				}
				else if(ennemi.getLife()<=0) {
					System.out.println("You killed "+ennemi.getName()+"!");
					int y = (int) Math.floor(Math.random() * 11);
					if(y<=2) {
						System.out.println("You found a small key! keep it safe.");
						setNbOfKeys(getNbOfKeys()+1);
					}
					else if(y<=5) {
						System.out.println("You found a health potion.");
					}
					else if(y<=8) {
						System.out.println("You found a mana potion.");
					}
					else {
						System.out.println("You found nothing..");
					}
				}
				else if(getLife()<=0){
					System.out.println("You died...");
					Thread.sleep(2000);
				}
				else {
					System.out.println("Game bug.. Sorry!");
				}
			}
		
}

