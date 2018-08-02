import java.util.*;

public class Game {

	public static void main(String[] args) throws InterruptedException {
		Hero hero = new Hero();
		BigTexts text1 = new BigTexts();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		hero.setLife(1);
		
		
		text1.printTitle();
		text1.printIntro();
		
		String x = scan.nextLine();
		while(x.equals("y") && hero.getLife()>0) {
			
			text1.statExplained();
		
//Character creation
		
			String s = "n";
			do {
			System.out.println("What will be your name?");
			hero.setName(scan.nextLine());
			
			System.out.println("Distribute your points:");
			System.out.print("Strength: ");
			hero.setStrength(scan2.nextInt()+10);
			System.out.print("Dexterity: ");
			hero.setDext(scan2.nextInt()+10);
			System.out.print("Intelligence: ");
			hero.setIntell(scan2.nextInt()+10);
			hero.setLife(hero.getStrength()*100);
			hero.setMana(hero.getIntell()*10);
			hero.setArmor(hero.getStrength()-10);
			hero.setMagicArmor(hero.getDext()-10);
			System.out.println("\n\n\nHere are your stats:\n");
			System.out.println("Name: "+hero.getName());
			System.out.println("\nStrength: "+hero.getStrength());
			System.out.println("\nDexterity: "+hero.getDext());
			System.out.println("\nIntelligence: "+hero.getIntell());
			System.out.println("\nLife: "+hero.getLife());
			System.out.println("\nMana: "+hero.getMana());
			System.out.println("\nArmor: "+hero.getArmor());
			System.out.println("\nMagic armor: "+hero.getMagicArmor());
			System.out.println("\n\nDo you want to keep this character?\nType 'y' or 'n':");
			s = scan.nextLine();
			}while(s.equals("n"));
		
			Foe bat1 = new Foe();
			bat1.setName("Scary Vampire");
			bat1.setArmor(15);
			bat1.setStrength(500);
			bat1.setDext(500);
			bat1.setLife(500);
			
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
