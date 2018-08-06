import java.util.*;

public class Chest {

	
	public void chestFound(Hero perso) throws InterruptedException {
		Scanner scan4=new Scanner(System.in);
		System.out.println("You found a chest after clearing the room, great!");
		Thread.sleep(1700);
		if(perso.getNbOfKeys()>=1) {
			System.out.println("Do you want to open it using a small key?'y'or'n'");
			String heroChest=scan4.nextLine();
			Thread.sleep(1700);
			if(heroChest.equals("y")) {
				int chestShuffle=(int) Math.floor(Math.random()*100);
				if(chestShuffle<=6) {	//iron sword
					System.out.println("You found an iron sword, it does "+(30-(perso.heroWeapon.getDamage()))+" more damages than your "+perso.heroWeapon.getName()+"!");
					System.out.println("Would you like to equip it?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the iron sword!");
						perso.heroWeapon.setName("iron sword");
						perso.heroWeapon.setDamage(30);
						perso.setDamages(perso.getStrength()+Character.heroWeapon.getDamage());
					}
					else {
						System.out.println("You chose not to equip it.");
					}
				}
				else if(chestShuffle<=12) {	//steel sword
						System.out.println("You found a steel sword, it does "+(40-(perso.heroWeapon.getDamage()))+" more damages than your "+perso.heroWeapon.getName()+"!");
						System.out.println("Would you like to equip it?'y'or'n'");
						String heroChest2=scan4.nextLine();
						if(heroChest2.equals("y")) {
							System.out.println("You equip the steel sword!");
							perso.heroWeapon.setName("steel sword");
							perso.heroWeapon.setDamage(40);
							perso.setDamages(perso.getStrength()+Character.heroWeapon.getDamage());
						}
						else {
							System.out.println("You chose not to equip it.");
						}
					}
				else if(chestShuffle<=18) {	//iron armor
					System.out.println("You found an iron armor, it has "+(8-(perso.heroArmor.getArmor()))+" more defence than your "+perso.heroArmor.getName()+"\n");
					System.out.println("and "+(5-(perso.heroArmor.getMagicArmor()))+" more magic defence!");
					System.out.println("Would you like to equip it?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the iron armor!");
						perso.heroArmor.setName("iron armor");
						perso.heroArmor.setArmor(8);
						perso.heroArmor.setMagicArmor(5);
						perso.setArmor((perso.getStrength()-10)+Character.heroArmor.getArmor()+Character.heroShield.getArmor());
						perso.setMagicArmor((perso.getDext()-10)+Character.heroArmor.getMagicArmor()+Character.heroShield.getMagicArmor());
					}
					else {
						System.out.println("You chose not to equip it.");
					}
				}
				else if(chestShuffle<=24) {	//steel armor
					System.out.println("You found a steel armor, it has "+(11-(perso.heroArmor.getArmor()))+" more defence than your "+perso.heroArmor.getName()+"\n");
					System.out.println("and "+(8-(perso.heroArmor.getMagicArmor()))+" more magic defence!");
					System.out.println("Would you like to equip it?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the steel armor!");
						perso.heroArmor.setName("steel armor");
						perso.heroArmor.setArmor(11);
						perso.heroArmor.setMagicArmor(8);
						perso.setArmor((perso.getStrength()-10)+Character.heroArmor.getArmor()+Character.heroShield.getArmor());
						perso.setMagicArmor((perso.getDext()-10)+Character.heroArmor.getMagicArmor()+Character.heroShield.getMagicArmor());
					}
					else {
						System.out.println("You chose not to equip it.");
					}
				}
				else if(chestShuffle<=30) {	//iron shield
					System.out.println("You found a iron shield, it has "+(5-(perso.heroShield.getArmor()))+" more defence than your "+perso.heroShield.getName()+"\n");
					System.out.println("and "+(3-(perso.heroShield.getMagicArmor()))+" more magic defence!");
					System.out.println("Would you like to equip it?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the iron shield!");
						perso.heroShield.setName("iron shield");
						perso.heroShield.setArmor(5);
						perso.heroShield.setMagicArmor(3);
						perso.setArmor((perso.getStrength()-10)+Character.heroArmor.getArmor()+Character.heroShield.getArmor());
						perso.setMagicArmor((perso.getDext()-10)+Character.heroArmor.getMagicArmor()+Character.heroShield.getMagicArmor());
					}
					else {
						System.out.println("You chose not to equip it.");
					}
				}
				else if(chestShuffle<=36) {	//steel shield
					System.out.println("You found a steel shield, it has "+(7-(perso.heroShield.getArmor()))+" more defence than your "+perso.heroShield.getName()+"\n");
					System.out.println("and "+(5-(perso.heroShield.getMagicArmor()))+" more magic defence!");
					System.out.println("Would you like to equip it?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the steel shield!");
						perso.heroShield.setName("steel shield");
						perso.heroShield.setArmor(7);
						perso.heroShield.setMagicArmor(5);
						perso.setArmor((perso.getStrength()-10)+Character.heroArmor.getArmor()+Character.heroShield.getArmor());
						perso.setMagicArmor((perso.getDext()-10)+Character.heroArmor.getMagicArmor()+Character.heroShield.getMagicArmor());
					}
					else {
						System.out.println("You chose not to equip it.");
					}
				}
				else if(chestShuffle<=42) {	//fire magic 1
					System.out.println("You found the big fire ball scroll, it does "+((60+perso.getIntell())-perso.fireMagic.getDamages())+" more damages than your "+perso.fireMagic.getName()+"\n");
					System.out.println("and consumes "+(25-(perso.fireMagic.getManaCons()))+" more mana!");
					System.out.println("Would you like to replace your fire magic?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the big fire ball!");
						perso.fireMagic.setName("big fire ball");
						perso.fireMagic.setDamages(60+perso.getIntell());
						perso.fireMagic.setManaCons(25);						
					}
					else {
						System.out.println("You chose not to replace it.");
					}
				}
				else if(chestShuffle<=48) {	//fire magic 2
					System.out.println("You found the huge fire ball scroll, it does "+((70+perso.getIntell())-perso.fireMagic.getDamages())+" more damages than your "+perso.fireMagic.getName()+"\n");
					System.out.println("and consumes "+(30-(perso.fireMagic.getManaCons()))+" more mana!");
					System.out.println("Would you like to replace your fire magic?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the huge fire ball!");
						perso.fireMagic.setName("huge fire ball");
						perso.fireMagic.setDamages(70+perso.getIntell());
						perso.fireMagic.setManaCons(30);						
					}
					else {
						System.out.println("You chose not to replace it.");
					}
				}
				else if(chestShuffle<=54) {	//water magic 1
					System.out.println("You found the big water beam scroll, it does "+((60+perso.getIntell())-perso.waterMagic.getDamages())+" more damages than your "+perso.fireMagic.getName()+"\n");
					System.out.println("and consumes "+(25-(perso.waterMagic.getManaCons()))+" more mana!");
					System.out.println("Would you like to replace your water magic?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the big water beam!");
						perso.waterMagic.setName("big water beam");
						perso.waterMagic.setDamages(60+perso.getIntell());
						perso.waterMagic.setManaCons(25);						
					}
					else {
						System.out.println("You chose not to replace it.");
					}
				}
				else if(chestShuffle<=60) {	//water magic 2
					System.out.println("You found the huge water beam scroll, it does "+((70+perso.getIntell())-perso.waterMagic.getDamages())+" more damages than your "+perso.fireMagic.getName()+"\n");
					System.out.println("and consumes "+(30-(perso.waterMagic.getManaCons()))+" more mana!");
					System.out.println("Would you like to replace your water magic?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the huge water beam!");
						perso.waterMagic.setName("huge water beam");
						perso.waterMagic.setDamages(70+perso.getIntell());
						perso.waterMagic.setManaCons(30);						
					}
					else {
						System.out.println("You chose not to replace it.");
					}
				}
				else if(chestShuffle<=66) {	//air magic 1
					System.out.println("You found the big lightning strike scroll, it does "+((60+perso.getIntell())-perso.airMagic.getDamages())+" more damages than your "+perso.fireMagic.getName()+"\n");
					System.out.println("and consumes "+(25-(perso.airMagic.getManaCons()))+" more mana!");
					System.out.println("Would you like to replace your air magic?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the big lightning strike!");
						perso.airMagic.setName("big lightning strike");
						perso.airMagic.setDamages(60+perso.getIntell());
						perso.airMagic.setManaCons(25);						
					}
					else {
						System.out.println("You chose not to replace it.");
					}
				}
				else if(chestShuffle<=73) {	//air magic 2
					System.out.println("You found the huge lightning strike scroll, it does "+((70+perso.getIntell())-perso.airMagic.getDamages())+" more damages than your "+perso.fireMagic.getName()+"\n");
					System.out.println("and consumes "+(30-(perso.airMagic.getManaCons()))+" more mana!");
					System.out.println("Would you like to replace your air magic?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the huge lightning strike!");
						perso.airMagic.setName("huge lightning strike");
						perso.airMagic.setDamages(70+perso.getIntell());
						perso.airMagic.setManaCons(30);						
					}
					else {
						System.out.println("You chose not to replace it.");
					}
				}
				else if(chestShuffle<=80) {	//earth magic 1
					System.out.println("You found the big boulder throw scroll, it does "+((60+perso.getIntell())-perso.earthMagic.getDamages())+" more damages than your "+perso.fireMagic.getName()+"\n");
					System.out.println("and consumes "+(25-(perso.earthMagic.getManaCons()))+" more mana!");
					System.out.println("Would you like to replace your earth magic?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the big boulder throw!");
						perso.earthMagic.setName("big boulder throw");
						perso.earthMagic.setDamages(60+perso.getIntell());
						perso.earthMagic.setManaCons(25);						
					}
					else {
						System.out.println("You chose not to replace it.");
					}
				}
				else if(chestShuffle<=87) {	//earth magic 2
					System.out.println("You found the huge boulder throw scroll, it does "+((70+perso.getIntell())-perso.earthMagic.getDamages())+" more damages than your "+perso.fireMagic.getName()+"\n");
					System.out.println("and consumes "+(30-(perso.earthMagic.getManaCons()))+" more mana!");
					System.out.println("Would you like to replace your earth magic?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the huge boulder throw!");
						perso.earthMagic.setName("huge boulder throw");
						perso.earthMagic.setDamages(70+perso.getIntell());
						perso.earthMagic.setManaCons(30);						
					}
					else {
						System.out.println("You chose not to replace it.");
					}
				}
				else if(chestShuffle<=94) {	//heal magic 1
					System.out.println("You found the heal scroll, it heals "+((250+perso.getIntell())-perso.healingMagic.getDamages())+" more HP than your "+perso.healingMagic.getName()+"\n");
					System.out.println("and consumes "+(25-(perso.healingMagic.getManaCons()))+" more mana!");
					System.out.println("Would you like to replace your healing magic?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the heal magic!");
						perso.healingMagic.setName("heal");
						perso.healingMagic.setDamages(250+perso.getIntell());
						perso.healingMagic.setManaCons(25);						
					}
					else {
						System.out.println("You chose not to replace it.");
					}
				}
				else {	//heal magic 2
					System.out.println("You found the large heal scroll, it heals "+((300+perso.getIntell())-perso.healingMagic.getDamages())+" more HP than your "+perso.healingMagic.getName()+"\n");
					System.out.println("and consumes "+(30-(perso.healingMagic.getManaCons()))+" more mana!");
					System.out.println("Would you like to replace your healing magic?'y'or'n'");
					String heroChest2=scan4.nextLine();
					if(heroChest2.equals("y")) {
						System.out.println("You equip the large heal magic!");
						perso.healingMagic.setName("large heal");
						perso.healingMagic.setDamages(300+perso.getIntell());
						perso.healingMagic.setManaCons(30);						
					}
					else {
						System.out.println("You chose not to replace it.");
					}
				}
				//chest shuffle end
				perso.setNbOfKeys(perso.getNbOfKeys()-1);
			}
			else {
				System.out.println("You chose not to open the chest.");
			}
		}
		else {
			System.out.println("But you don't have any key left...");
		}
	}
	
	public void bossChest1(Hero perso) throws InterruptedException {
		/*System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                                      Lady Pestilence vanishes in a cloud of green and stinky gas.");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");Thread.sleep(5000);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                         You feel sick at the smell of it and almost throw up the few bits of lunch you last had...");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");Thread.sleep(5000);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                            Eventually, the cloud itself disappears and the air starts to be breathable again.");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");Thread.sleep(5000);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                                Where last stood your remaining ennemi is a digusting pile of entrails,");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");Thread.sleep(5000);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                                            covering what seems to be quite a large chest.");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");Thread.sleep(5000);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");*/
		
		System.out.println("You approach the chest, cleaning some of the entrails on it you uncover three locks..");
		Thread.sleep(2000);
		if(perso.getNbOfKeys()<3) {
			System.out.println("Unfortunately you don't have enough keys to open it.");
			Thread.sleep(2000);
			System.out.println("You feel like you might just have missed something important here...");
		}
		else {
			System.out.println("Would you like to use three keys to open it?'y'or'n'");
			Scanner scan5 = new Scanner(System.in);
			String bc = scan5.nextLine();
			if(bc.equals("y")) {
				System.out.println("You carrefully open the three locks and slowly raise the heavy lid...");
				Thread.sleep(2000);
				System.out.println("A blinding light illuminates the inside of the chest!");
				Thread.sleep(2000);
				System.out.println("It suddenly darkens and you get your eyesight back..");
				Thread.sleep(2000);
				System.out.print("Inside the chest you find a ");
				int h = (int) Math.floor(Math.random()*100);
				if(h<=30) {
					System.out.println("Superb Sword!");
					Thread.sleep(2000);
					System.out.println("It has your name on it, strange..");
					Thread.sleep(2000);
					System.out.println("Would you like to equip it(honestly you should..)?'y'or'n'");
					bc=scan5.nextLine();
					Thread.sleep(2000);
					if(bc.equals("y")) {
						System.out.println("You equip "+perso.getName()+"'s Sword, you can feel its raw power!");
						perso.heroWeapon.setName(perso.getName()+"'s Sword");
						perso.heroWeapon.setDamage(50);
						perso.setDamages(perso.getStrength()+Character.heroWeapon.getDamage());
						perso.setLegendItem1(1);
						Thread.sleep(2000);
					}
					else {
						System.out.print("You really should have!");
						Thread.sleep(2000);
					}
					
				}
				else if(h<=60) {
					System.out.println("Superb Armor!");
					Thread.sleep(2000);
					System.out.println("It has your name on it, strange..");
					Thread.sleep(2000);
					System.out.println("Would you like to equip it(honestly you should..)?'y'or'n'");
					bc=scan5.nextLine();
					if(bc.equals("y")) {
						System.out.println("You equip "+perso.getName()+"'s Armor, you can feel its raw power!");
						perso.heroArmor.setName(perso.getName()+"'s Armor");
						perso.heroArmor.setArmor(14);
						perso.heroArmor.setMagicArmor(11);
						perso.setArmor((perso.getStrength()-10)+Character.heroArmor.getArmor()+Character.heroShield.getArmor());
						perso.setMagicArmor((perso.getDext()-10)+Character.heroArmor.getMagicArmor()+Character.heroShield.getMagicArmor());
						perso.setLegendItem1(2);
						Thread.sleep(2000);
					}
					else {
						System.out.print("You really should have!");
						Thread.sleep(2000);
					}
				}
				else {
					System.out.println("Superb Shield!");
					Thread.sleep(2000);
					System.out.println("It has your name on it, strange..");
					Thread.sleep(2000);
					System.out.println("Would you like to equip it(honestly you should..)?'y'or'n'");
					bc=scan5.nextLine();
					if(bc.equals("y")) {
						System.out.println("You equip "+perso.getName()+"'s Shield, you can feel its raw power!");
						perso.heroShield.setName(perso.getName()+"'s Shield");
						perso.heroShield.setArmor(9);
						perso.heroShield.setMagicArmor(7);
						perso.setArmor((perso.getStrength()-10)+Character.heroArmor.getArmor()+Character.heroShield.getArmor());
						perso.setMagicArmor((perso.getDext()-10)+Character.heroArmor.getMagicArmor()+Character.heroShield.getMagicArmor());
						perso.setLegendItem1(3);
						Thread.sleep(2000);
					}
					else {
						System.out.print("You really should have!");
						Thread.sleep(2000);
					}
				}
				perso.setNbOfKeys(perso.getNbOfKeys()-3);
			}
			else {
				System.out.println("You chose not to open that chest...");
				Thread.sleep(2000);
				System.out.println("You feel like you might just have made a mistake...");
				Thread.sleep(2000);
			}
		}
		
		
	}
	
	
}
