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
			int legendItem1;
			int legendItem2;
			int legendItem3;
			
			
			public int getLegendItem1() {
				return legendItem1;
			}
			public void setLegendItem1(int legendItem1) {
				this.legendItem1 = legendItem1;
			}
			public int getLegendItem2() {
				return legendItem2;
			}
			public void setLegendItem2(int legendItem2) {
				this.legendItem2 = legendItem2;
			}
			public int getLegendItem3() {
				return legendItem3;
			}
			public void setLegendItem3(int legendItem3) {
				this.legendItem3 = legendItem3;
			}
			public int getHealthPotionNb() {
				return healthPotionNb;
			}
			public void setHealthPotionNb(int healthPotionNb) {
				this.healthPotionNb = healthPotionNb;
			}
			public int getManaPotionNb() {
				return manaPotionNb;
			}
			public void setManaPotionNb(int manaPotionNb) {
				this.manaPotionNb = manaPotionNb;
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
				System.out.println("\nYou face a "+ennemi.getName());
				boolean flea = false;
				while(flea==false && ennemi.getLife()>0 && getLife()>0){
					System.out.println("\nYour turn:\n**********\nLife: "+getLife()+"\nMana: "+getMana()+"\n**********\n1-Attack\n2-Magic\n3-Item\n4-Run");
					int x = scan.nextInt();
					if(x==1) {
						System.out.println("\n");
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
						System.out.println("\n");
						System.out.println("1-"+fireMagic.getName()+" - "+fireMagic.getManaCons()+" MP                2-"+waterMagic.getName()+" - "+waterMagic.getManaCons()+" MP\n3-"+airMagic.getName()+" - "+airMagic.getManaCons()+"MP          4-"+earthMagic.getName()+" - "+earthMagic.getManaCons()+" MP\n5-"+healingMagic.getName()+" - "+healingMagic.getManaCons());
						int z = scan.nextInt();
						if(getMana()>0) {
							if(z==1) {
								if(getMana()>=fireMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous flame spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==2) {
								if(getMana()>=waterMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous drop of water spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==3) {
								if(getMana()>=airMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous light ball spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==4) {
								if(getMana()>=earthMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous stone spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==5) {
								System.out.println("\n");
								System.out.println("You cast "+healingMagic.getName()+", healing "+healingMagic.getDamages()+" HP!");
								setMana(getMana()-healingMagic.getManaCons());
								setLife(getLife()+healingMagic.getDamages());
								if(getLife()>3000) {
									setLife(3000);
								}
								System.out.println("You get healed up to "+getLife()+" HP.");
								Thread.sleep(1500);
							}
							
							}
						else {
							System.out.println("You don't have any mana left!");
						}
											
						
					}
					else if(x==3) {
						System.out.println("\n");
						System.out.println("1-"+healingPotion.getName()+" - "+getHealthPotionNb()+"\n2-"+manaPotion.getName()+" - "+getManaPotionNb());
						int z = scan.nextInt();
						if(z==1) {
							System.out.println("\n");
							if(getHealthPotionNb()>0) {
								System.out.println("You drink a "+healingPotion.getName()+" recovering "+healingPotion.getHealing()+" HP!");
								setLife(getLife()+healingPotion.getHealing());
								setHealthPotionNb(getHealthPotionNb()-1);
								if(getLife()>3000) {
									setLife(3000);
								}
								System.out.println("You get healed up to "+getLife()+"HP.");
								System.out.println(getHealthPotionNb()+" health potion(s) left.");
							}
							else {
								System.out.println("You don't have any health potion!");
							}
						}
						else if(z==2) {
							System.out.println("\n");
							if(getManaPotionNb()>0) {
								System.out.println("You drink a "+manaPotion.getName()+" recovering "+manaPotion.getHealing()+" MP!");
								setMana(getMana()+manaPotion.getHealing());
								setManaPotionNb(getManaPotionNb()-1);
								if(getMana()>300) {
									setMana(300);
								}
								System.out.println("You restore mana up to "+getMana()+"MP.");
								System.out.println(getManaPotionNb()+" mana potion(s) left.");
							}
							else {
								System.out.println("You don't have any mana potion!");
							}
						}
						
						
					}
					else {
						System.out.println("\n");
						System.out.println("You try to run away!");
						Thread.sleep(1500);
						int y = (int) Math.floor(Math.random() * 101)+ennemi.getDext();
						System.out.println("\n");
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
						System.out.println("\n");
						System.out.println(ennemi.getName()+" attacks!");
						int z = (int) Math.floor(Math.random() * 11);
						Thread.sleep(1500);
						
						if(z<=4) {
							System.out.println("\n");
							System.out.println(ennemi.getName()+" uses "+ennemi.foeMagic.getName()+"!");
							if((ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor())<=0) {
								System.out.println("You heroically parry his magic with your "+heroShield.getName()+" and take no damages!");
							}
							else {
							System.out.println("You get hit for "+(ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor())+" damages!");
							setLife(getLife()-(ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor()));
							}
						}
						else {
							System.out.println("\n");
							int y = (int) Math.floor(Math.random() * 101)-(ennemi.getDext()-getDext());
							if(y<70) {
								if((ennemi.getStrength()-getArmor())<=0) {
									System.out.println("You heroically parry the blow with your "+heroShield.getName()+" and take no damages!");
								}
								else {
									System.out.println("He lands a hit of "+(ennemi.getStrength()-getArmor())+" damages!");
									setLife(getLife()-(ennemi.getStrength()-getArmor()));
								}
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
					Thread.sleep(1700);
					int y = (int) Math.floor(Math.random() * 11);
					System.out.println("\n");
					if(y<=2) {
						System.out.println("You found a small key! keep it safe.");
						setNbOfKeys(getNbOfKeys()+1);
						System.out.println("You now have "+getNbOfKeys()+" key(s).");
					}
					else if(y<=5) {
						System.out.println("You found a health potion.");
						setHealthPotionNb(getHealthPotionNb()+1);
						System.out.println("You now have "+getHealthPotionNb()+" health potion(s).");
					}
					else if(y<=8) {
						System.out.println("You found a mana potion.");
						setManaPotionNb(getManaPotionNb()+1);
						System.out.println("You now have "+getManaPotionNb()+" mana potion(s).");
					}
					else {
						System.out.println("You found nothing..");
					}
					Thread.sleep(1700);
				}
				else if(getLife()<=0){
					System.out.println("You died...");
					Thread.sleep(2000);
				}
				else {
					System.out.println("Game bug.. Sorry!");
				}
			}
		
			public void bossFight(Foe ennemi) throws InterruptedException {
				System.out.println("\nYou face "+ennemi.getName()+".");
				while(ennemi.getLife()>0 && getLife()>0){
					System.out.println("\nYour turn:\n**********\nLife: "+getLife()+"\nMana: "+getMana()+"\n**********\n1-Attack\n2-Magic\n3-Item\n4-Run");
					int x = scan.nextInt();
					if(x==1) {
						System.out.println("\n");
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
						System.out.println("\n");
						System.out.println("1-"+fireMagic.getName()+" - "+fireMagic.getManaCons()+" MP                2-"+waterMagic.getName()+" - "+waterMagic.getManaCons()+" MP\n3-"+airMagic.getName()+" - "+airMagic.getManaCons()+"MP          4-"+earthMagic.getName()+" - "+earthMagic.getManaCons()+" MP\n5-"+healingMagic.getName()+" - "+healingMagic.getManaCons());
						int z = scan.nextInt();
						if(getMana()>0) {
							if(z==1) {
								if(getMana()>=fireMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous flame spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==2) {
								if(getMana()>=waterMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous drop of water spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==3) {
								if(getMana()>=airMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous light ball spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==4) {
								if(getMana()>=earthMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous stone spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==5) {
								System.out.println("\n");
								System.out.println("You cast "+healingMagic.getName()+", healing "+healingMagic.getDamages()+" HP!");
								setMana(getMana()-healingMagic.getManaCons());
								setLife(getLife()+healingMagic.getDamages());
								if(getLife()>3000) {
									setLife(3000);
								}
								System.out.println("You get healed up to "+getLife()+" HP.");
								Thread.sleep(1500);
							}
							
							}
						else {
							System.out.println("You don't have any mana left!");
						}
											
						
					}
					else if(x==3) {
						System.out.println("\n");
						System.out.println("1-"+healingPotion.getName()+" - "+getHealthPotionNb()+"\n2-"+manaPotion.getName()+" - "+getManaPotionNb());
						int z = scan.nextInt();
						if(z==1) {
							System.out.println("\n");
							if(getHealthPotionNb()>0) {
								System.out.println("You drink a "+healingPotion.getName()+" recovering "+healingPotion.getHealing()+" HP!");
								setLife(getLife()+healingPotion.getHealing());
								setHealthPotionNb(getHealthPotionNb()-1);
								if(getLife()>3000) {
									setLife(3000);
								}
								System.out.println("You get healed up to "+getLife()+"HP.");
								System.out.println(getHealthPotionNb()+" health potion(s) left.");
							}
							else {
								System.out.println("You don't have any health potion!");
							}
						}
						else if(z==2) {
							System.out.println("\n");
							if(getManaPotionNb()>0) {
								System.out.println("You drink a "+manaPotion.getName()+" recovering "+manaPotion.getHealing()+" MP!");
								setMana(getMana()+manaPotion.getHealing());
								setManaPotionNb(getManaPotionNb()-1);
								if(getMana()>300) {
									setMana(300);
								}
								System.out.println("You restore mana up to "+getMana()+"MP.");
								System.out.println(getManaPotionNb()+" mana potion(s) left.");
							}
							else {
								System.out.println("You don't have any mana potion!");
							}
						}
											
					}
					else {
						System.out.println("\n");
						System.out.println("You try to run away!");
						Thread.sleep(1500);						
						System.out.println("But you can't run away from a boss fight, face your fears hero!");
						
					}
					Thread.sleep(1500);
					if(ennemi.getLife()>0) {
						System.out.println("\n");
						System.out.println(ennemi.getName()+" attacks!");
						int z = (int) Math.floor(Math.random() * 30);
						Thread.sleep(1500);
						
						if(z<=2) {
							System.out.println("\n");
							System.out.println(ennemi.getName()+" uses "+ennemi.foeMagic.getName()+"!");
							if((ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor())<=0) {
								System.out.println("You heroically parry his magic with your "+heroShield.getName()+" and take no damages!");
							}
							else {
							System.out.println("You get hit for "+(ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor())+" damages!");
							setLife(getLife()-(ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor()));
							}
						}
						else if(z<=7) {
							System.out.println("\n");
							System.out.println(ennemi.getName()+" uses "+ennemi.foeMagic2.getName()+"!");
							if((ennemi.foeMagic2.getDamages()+ennemi.getIntell()-getMagicArmor())<=0) {
								System.out.println("You heroically parry his magic with your "+heroShield.getName()+" and take no damages!");
							}
							else {
							System.out.println("You get hit for "+(ennemi.foeMagic2.getDamages()+ennemi.getIntell()-getMagicArmor())+" damages!");
							setLife(getLife()-(ennemi.foeMagic2.getDamages()+ennemi.getIntell()-getMagicArmor()));
							}
						}
						else if(z<=14) {
							System.out.println("\n");
							System.out.println(ennemi.getName()+" uses "+ennemi.foeMagic3.getName()+"!");
							if((ennemi.foeMagic3.getDamages()+ennemi.getIntell()-getMagicArmor())<=0) {
								System.out.println("You heroically parry his magic with your "+heroShield.getName()+" and take no damages!");
							}
							else {
							System.out.println("You get hit for "+(ennemi.foeMagic3.getDamages()+ennemi.getIntell()-getMagicArmor())+" damages!");
							setLife(getLife()-(ennemi.foeMagic3.getDamages()+ennemi.getIntell()-getMagicArmor()));
							}
						}
						else {
							System.out.println("\n");
							int y = (int) Math.floor(Math.random() * 101)-(ennemi.getDext()-getDext());
							if(y<70) {
								int w=(int) Math.floor(Math.random() * 51);
								if(w+(ennemi.getStrength()-getArmor())<=0) {
									System.out.println("You heroically parry the blow with your "+heroShield.getName()+" and take no damages!");
								}
								else {
									System.out.println("He lands a hit of "+(w+(ennemi.getStrength()-getArmor()))+" damages!");
									setLife(getLife()-(w+(ennemi.getStrength()-getArmor())));
								}
							}
							else {
								System.out.println(ennemi.getName()+" attack missed!");
							}
						}
					}
					Thread.sleep(1500);
				}
				 if(ennemi.getLife()<=0) {
					System.out.println("You killed "+ennemi.getName()+"!");
					Thread.sleep(1700);
					
				}
				else if(getLife()<=0){
					System.out.println("You died! You went so far...");
					Thread.sleep(1500);
					System.out.println("only to fail...");
					Thread.sleep(2000);
				}
				else {
					System.out.println("Game bug.. Sorry!");
				}
			}
			
			public void finalBossFight(Foe ennemi) throws InterruptedException {

				System.out.println("\nYou face "+ennemi.getName()+".");
				while(ennemi.getLife()>1 && getLife()>0){
					System.out.println("\nYour turn:\n**********\nLife: "+getLife()+"\nMana: "+getMana()+"\n**********\n1-Attack\n2-Magic\n3-Item\n4-Run");
					int x = scan.nextInt();
					if(x==1) {
						System.out.println("\n");
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
						System.out.println("\n");
						System.out.println("1-"+fireMagic.getName()+" - "+fireMagic.getManaCons()+" MP                2-"+waterMagic.getName()+" - "+waterMagic.getManaCons()+" MP\n3-"+airMagic.getName()+" - "+airMagic.getManaCons()+"MP          4-"+earthMagic.getName()+" - "+earthMagic.getManaCons()+" MP\n5-"+healingMagic.getName()+" - "+healingMagic.getManaCons());
						int z = scan.nextInt();
						if(getMana()>0) {
							if(z==1) {
								if(getMana()>=fireMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous flame spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==2) {
								if(getMana()>=waterMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous drop of water spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==3) {
								if(getMana()>=airMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous light ball spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==4) {
								if(getMana()>=earthMagic.getManaCons()) {
									System.out.println("\n");
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
								}
								else {
									System.out.println("You use whatever mana you had left and a small ridiculous stone spouts out of your hand..");
									setMana(0);
								}
								Thread.sleep(1500);
							}
							else if(z==5) {
								System.out.println("\n");
								System.out.println("You cast "+healingMagic.getName()+", healing "+healingMagic.getDamages()+" HP!");
								setMana(getMana()-healingMagic.getManaCons());
								setLife(getLife()+healingMagic.getDamages());
								if(getLife()>3000) {
									setLife(3000);
								}
								System.out.println("You get healed up to "+getLife()+" HP.");
								Thread.sleep(1500);
							}
							
							}
						else {
							System.out.println("You don't have any mana left!");
						}
											
						
					}
					else if(x==3) {
						System.out.println("\n");
						System.out.println("1-"+healingPotion.getName()+" - "+getHealthPotionNb()+"\n2-"+manaPotion.getName()+" - "+getManaPotionNb());
						int z = scan.nextInt();
						if(z==1) {
							System.out.println("\n");
							if(getHealthPotionNb()>0) {
								System.out.println("You drink a "+healingPotion.getName()+" recovering "+healingPotion.getHealing()+" HP!");
								setLife(getLife()+healingPotion.getHealing());
								setHealthPotionNb(getHealthPotionNb()-1);
								if(getLife()>3000) {
									setLife(3000);
								}
								System.out.println("You get healed up to "+getLife()+"HP.");
								System.out.println(getHealthPotionNb()+" health potion(s) left.");
							}
							else {
								System.out.println("You don't have any health potion!");
							}
						}
						else if(z==2) {
							System.out.println("\n");
							if(getManaPotionNb()>0) {
								System.out.println("You drink a "+manaPotion.getName()+" recovering "+manaPotion.getHealing()+" MP!");
								setMana(getMana()+manaPotion.getHealing());
								setManaPotionNb(getManaPotionNb()-1);
								if(getMana()>300) {
									setMana(300);
								}
								System.out.println("You restore mana up to "+getMana()+"MP.");
								System.out.println(getManaPotionNb()+" mana potion(s) left.");
							}
							else {
								System.out.println("You don't have any mana potion!");
							}
						}
											
					}
					else {
						System.out.println("\n");
						System.out.println("You try to run away!");
						Thread.sleep(1500);						
						System.out.println("But you can't run away from a boss fight, face your fears hero!");
						
					}
					Thread.sleep(1500);
					if(ennemi.getLife()>0) {
						System.out.println("\n");
						System.out.println(ennemi.getName()+" attacks!");
						int z = (int) Math.floor(Math.random() * 30);
						Thread.sleep(1500);
						
						if(z<=2) {
							System.out.println("\n");
							System.out.println(ennemi.getName()+" uses "+ennemi.foeMagic.getName()+"!");
							if((ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor())<=0) {
								System.out.println("You heroically parry his magic with your "+heroShield.getName()+" and take no damages!");
							}
							else {
							System.out.println("You get hit for "+(ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor())+" damages!");
							setLife(getLife()-(ennemi.foeMagic.getDamages()+ennemi.getIntell()-getMagicArmor()));
							}
						}
						else if(z<=7) {
							System.out.println("\n");
							System.out.println(ennemi.getName()+" uses "+ennemi.foeMagic2.getName()+"!");
							if((ennemi.foeMagic2.getDamages()+ennemi.getIntell()-getMagicArmor())<=0) {
								System.out.println("You heroically parry his magic with your "+heroShield.getName()+" and take no damages!");
							}
							else {
							System.out.println("You get hit for "+(ennemi.foeMagic2.getDamages()+ennemi.getIntell()-getMagicArmor())+" damages!");
							setLife(getLife()-(ennemi.foeMagic2.getDamages()+ennemi.getIntell()-getMagicArmor()));
							}
						}
						else if(z<=14) {
							System.out.println("\n");
							System.out.println(ennemi.getName()+" uses "+ennemi.foeMagic3.getName()+"!");
							if((ennemi.foeMagic3.getDamages()+ennemi.getIntell()-getMagicArmor())<=0) {
								System.out.println("You heroically parry his magic with your "+heroShield.getName()+" and take no damages!");
							}
							else {
							System.out.println("You get hit for "+(ennemi.foeMagic3.getDamages()+ennemi.getIntell()-getMagicArmor())+" damages!");
							setLife(getLife()-(ennemi.foeMagic3.getDamages()+ennemi.getIntell()-getMagicArmor()));
							}
						}
						else {
							System.out.println("\n");
							int y = (int) Math.floor(Math.random() * 101)-(ennemi.getDext()-getDext());
							if(y<70) {
								int w=(int) Math.floor(Math.random() * 51);
								if(w+(ennemi.getStrength()-getArmor())<=0) {
									System.out.println("You heroically parry the blow with your "+heroShield.getName()+" and take no damages!");
								}
								else {
									System.out.println("He lands a hit of "+(w+(ennemi.getStrength()-getArmor()))+" damages!");
									setLife(getLife()-(w+(ennemi.getStrength()-getArmor())));
								}
							}
							else {
								System.out.println(ennemi.getName()+" attack missed!");
							}
						}
					}
					Thread.sleep(1500);
				}
				 if(ennemi.getLife()<=1) {
					System.out.println("You defeated "+ennemi.getName()+"!");
					ennemi.setLife(1);
					Thread.sleep(1700);
					
				}
				else if(getLife()<=0){
					System.out.println("You died! You went so far...");
					Thread.sleep(1500);
					System.out.println("only to fail...");
					Thread.sleep(2000);
				}
				else {
					System.out.println("Game bug.. Sorry!");
				}
			}
		}
			


