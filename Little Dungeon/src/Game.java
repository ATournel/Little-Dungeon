import java.util.*;

public class Game {

	public static void main(String[] args) throws InterruptedException {
		Hero hero = new Hero();
		BigTexts text1 = new BigTexts();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		hero.setLife(1);
		
		
		//text1.printTitle();
		//text1.printIntro();
		
		String x = scan.nextLine();
		while(x.equals("y") && hero.getLife()>0) {
			
			text1.statExplained();
		
//Character creation
		
			String s = "n";
			do {
			System.out.println("What will be your name?");
			hero.setName(scan.nextLine());
			
			Character.heroWeapon.setName("short family sword");
			Character.heroWeapon.setDamage(20);
			
			Character.heroArmor.setName("leather family armor");
			Character.heroArmor.setArmor(5);
			Character.heroArmor.setMagicArmor(2);
			
			Character.heroShield.setName("small family shield");
			Character.heroShield.setArmor(3);
			Character.heroShield.setMagicArmor(1);
			
			System.out.println("Distribute your points:");
			System.out.print("Strength: ");
			hero.setStrength(scan2.nextInt()+10);
			System.out.print("Dexterity: ");
			hero.setDext(scan2.nextInt()+10);
			System.out.print("Intelligence: ");
			hero.setIntell(scan2.nextInt()+10);
			hero.setLife(hero.getStrength()*100);
			hero.setMana(hero.getIntell()*10);
			hero.setArmor((hero.getStrength()-10)+Character.heroArmor.getArmor()+Character.heroShield.getArmor());
			hero.setMagicArmor((hero.getDext()-10)+Character.heroArmor.getMagicArmor()+Character.heroShield.getMagicArmor());
			hero.setDamages(hero.getStrength()+Character.heroWeapon.getDamage());
			System.out.println("\n\n\nHere are your stats:\n");
			System.out.println("Name: "+hero.getName());
			System.out.println("\nStrength: "+hero.getStrength());
			System.out.println("\nDexterity: "+hero.getDext());
			System.out.println("\nIntelligence: "+hero.getIntell());
			System.out.println("\nLife: "+hero.getLife());
			System.out.println("\nMana: "+hero.getMana());
			System.out.println("\nArmor: "+hero.getArmor());
			System.out.println("\nMagic armor: "+hero.getMagicArmor());
			System.out.println("You will start your adventure with your "+Character.heroWeapon.getName()+", your " +Character.heroArmor.getName()+", your "+Character.heroShield.getName()+" and a few basic magics.");
			System.out.println("\n\nDo you want to keep this character?\nType 'y' or 'n':");
			s = scan.nextLine();
			}while(s.equals("n"));
						
			
			Character.fireMagic.setName("Fire ball");
			Character.fireMagic.setDamages(50+hero.getIntell());
			Character.fireMagic.setManaCons(20);
			
			Character.waterMagic.setName("Water beam");
			Character.waterMagic.setDamages(50+hero.getIntell());
			Character.waterMagic.setManaCons(20);
			
			Character.airMagic.setName("Ligthning strike");
			Character.airMagic.setDamages(50+hero.getIntell());
			Character.airMagic.setManaCons(20);
			
			Character.earthMagic.setName("Boulder throw");
			Character.earthMagic.setDamages(50+hero.getIntell());
			Character.earthMagic.setManaCons(20);
			
			Character.healingMagic.setName("Small Heal");
			Character.healingMagic.setDamages(200+hero.getIntell());
			Character.healingMagic.setManaCons(20);
			
			Character.healingPotion.setName("small healing potion");
			Character.healingPotion.setHealing(200);
			Character.manaPotion.setName("small mana potion");
			Character.manaPotion.setHealing(20);
			
		
			Foe bat1 = new Foe();
			bat1.setName("Scary Vampire");
			bat1.setArmor(10);
			bat1.setStrength(15);
			bat1.setDext(15);
			bat1.setIntell(15);
			bat1.setLife(500);
			bat1.setType("fire");
			bat1.foeMagic.setName("Blood suck");
			bat1.foeMagic.setDamages(20);
			
			hero.fight(bat1);
			
			}
		if(x.equals("n")) {
			text1.losingText();
		}
		else if(hero.getLife()<=0){
			text1.dyingText();		
		}
		else {
			
		}
		text1.gameOver();
	}

}
