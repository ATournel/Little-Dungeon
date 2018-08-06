import java.util.*;

public class Chest {

	
	public void chestFound(Hero perso) {
		Scanner scan4=new Scanner(System.in);
		System.out.println("You found a chest, great!");
		if(perso.getNbOfKeys()>=1) {
			System.out.println("Do you want to open it using a small key?'y'or'n'");
			String heroChest=scan4.nextLine();
			if(heroChest.equals("y")) {
				int chestShuffle=(int) Math.floor(Math.random()*15);
				if(chestShuffle==0) {	//iron sword
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
				else if(chestShuffle==1) {	//steel sword
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
				else if(chestShuffle==2) {	//iron armor
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
				else if(chestShuffle==3) {	//steel armor
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
				else if(chestShuffle==4) {	//iron shield
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
				else if(chestShuffle==5) {	//steel shield
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
				else if(chestShuffle==6) {	//fire magic 1
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
				else if(chestShuffle==7) {	//fire magic 2
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
				else if(chestShuffle==8) {	//water magic 1
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
				else if(chestShuffle==9) {	//water magic 2
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
				else if(chestShuffle==10) {	//air magic 1
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
				else if(chestShuffle==11) {	//air magic 2
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
				else if(chestShuffle==12) {	//earth magic 1
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
				else if(chestShuffle==13) {	//earth magic 2
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
				else if(chestShuffle==14) {	//heal magic 1
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
				else if(chestShuffle==15) {	//heal magic 2
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
	
}
