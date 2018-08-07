import java.util.*;

public class Game {
	

	public static void main(String[] args) throws InterruptedException {
		Hero hero = new Hero();
		Foe bossF = new Foe();
		Foe bossF2 = new Foe();
		BigTexts text1 = new BigTexts();
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		hero.setLife(1);
		bossF.setLife(1);
		bossF2.setLife(1);
		
	//Title and Intro
		//text1.printTitle();
		//text1.printIntro();
		
		String x = scan.nextLine();
		while(x.equals("y") && hero.getLife()>0 && bossF.getLife()>0) {
			
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
			hero.setLife((hero.getStrength()-10)*100);
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
			System.out.println("Magic armor: "+hero.getMagicArmor());
			System.out.println("\nYou will start your adventure with your "+Character.heroWeapon.getName()+", your " +Character.heroArmor.getName()+",\nyour "+Character.heroShield.getName()+", a few basic magics and a few potions.");
			System.out.println("\n\nDo you want to keep this character?\nType 'y' or 'n':");
			s = scan.nextLine();
			}while(s.equals("n"));
						
			
			hero.setHealthPotionNb(2);
			hero.setManaPotionNb(1);
			
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
			
			Character.healingPotion.setName("healing potion");
			Character.healingPotion.setHealing(200);
			Character.manaPotion.setName("mana potion");
			Character.manaPotion.setHealing(60);
			
			Foe ennemi = new Foe();
			Foe ennemi2 = new Foe();
			Foe ennemi3 = new Foe();
			
			
			Room room1 = new Room();
			Chest chest1 = new Chest();
			
		/*	
			
	//Opening tower text
			text1.openingTowerText();
	//First round of rooms
			
			for(int i=0; i<=6; i++) {
				int trap=((int) Math.floor(Math.random() * 20));
				Thread.sleep(1700);
				if(trap<=1) {
					if(hero.getStrength()>=16) {
						System.out.println("You nearly fall into a pitfall as you enter the room but you were strong enough to hold yourself out!");
					}
					else {
						System.out.println("You fall into a pitfall as you enter the room, you eventually manage to get yourself out: 50 damages!");
						hero.setLife(hero.getLife()-50);
					}
				}
				else if(trap<=3) {
					if(hero.getDext()>=16) {
						System.out.println("A huge rock falls over your head as you enter the room but you were nimble enough to dodge it!");
					}
					else {
						System.out.println("A huge rock falls over your head as you enter the room, you dodge it but your back still gets hurt: 50 damages!");
						hero.setLife(hero.getLife()-50);
					}
					
				}
				else if(trap<=5) {
					if(hero.getIntell()>=16) {
						System.out.println("A wave of pure magic hurls at you but you were clever enough to send it to oblivion with a few magic signs!");
					}
					else {
						System.out.println("A wave of pure magic hurls at you, you raise your shield at the last moment but still get hit: 50 damages!");
						hero.setLife(hero.getLife()-50);
					}
					
				}Thread.sleep(1700);
				int shuffle = (int) Math.floor(Math.random() * 10);
				Thread.sleep(1700);
				if(shuffle==0) {
					room1.setName("small altar room");
					room1.setDescription("The air in this room feels strange and suddenly gets thicker!");
					room1.explore1(hero, ennemi);
				}
				else if(shuffle==1) {
					room1.setName("dark room");
					room1.setDescription("Don't you hear something? It sounds like......wing flaps!");
					room1.explore2(hero, ennemi);
				}
				else if(shuffle==2) {
					room1.setName("laboratory");
					room1.setDescription("You see multiple broken glass cylinders and the floor feels sticky under your boots.");
					room1.explore3(hero, ennemi);
				}
				else if(shuffle==3) {
					room1.setName("bloody room");
					room1.setDescription("Woaw, a chill shivers down your spine...You've got a baaad feeling about this one.");
					room1.explore4(hero, ennemi);
				}
				else if(shuffle==4) {
					room1.setName("inside graveyard");
					room1.setDescription("It stinks! How the hell can it stinks that bad?!");
					room1.explore5(hero, ennemi);
				}
				else if(shuffle==5) {
					room1.setName("nesting room");
					room1.setDescription("In the center of the room lies a nest with several eggs in it..Are they eatable?");
					room1.explore6(hero, ennemi);
				}
				else if(shuffle==6) {
					room1.setName("large room");
					room1.setDescription("In the center, you see a large pile of bones. Suddenly, they seem to be moving..");
					room1.explore7(hero, ennemi);
				}
				else if(shuffle==7) {
					room1.setName("tresor room");
					room1.setDescription("Laying all over the room floor are gold coins. What kind of sick man would keep is tresor in this tower?");
					room1.explore8(hero, ennemi);
				}
				else if(shuffle==8) {
					room1.setName("large altar room");
					room1.setDescription("Ok, there is something not funny about this one, not funny at all..");
					room1.explore9(hero, ennemi);
				}
				else if(shuffle==9) {
					room1.setName("water basin room");
					room1.setDescription("You can see something moving in this basin. You bet it won't be a dolphin..");
					room1.explore10(hero, ennemi);
				}
				
				int chest=(int) Math.floor(Math.random());
				if(chest==0) {
					chest1.chestFound(hero);
				}
				
				System.out.println("This room is empty, will you proceed to the next one?\n'y'or'n'?");
				String choix="n";
				while(choix.equals("n")) {
					Scanner scan3=new Scanner(System.in);
					choix=scan3.nextLine();
					if(choix.equals("y")) {
						System.out.println("You walk towards the door, let us go further..");
						Thread.sleep(1700);
					}
					else if(choix.equals("n")){
						System.out.println("Ok hero, take a minute to catch your breath..");
						Thread.sleep(1700);
						System.out.println("Ready now?'y'or'n'?");
					}
					
				}
			}		
		
	//First boss text
		*/text1.firstBossText();	/*
	//First boss fight
			Foe boss1 = new Foe();
			boss1.setName("Lady Pestilence");
			boss1.setArmor(20);
			boss1.setStrength(20);
			boss1.setDext(20);
			boss1.setIntell(20);
			boss1.setLife((boss1.getStrength()-10)*100);
			boss1.setType("earth");
			boss1.foeMagic.setName("Plague Breath");
			boss1.foeMagic.setDamages(80);
			boss1.foeMagic2.setName("Decaying Touch");
			boss1.foeMagic2.setDamages(60);
			boss1.foeMagic3.setName("Smell of Diseases");
			boss1.foeMagic3.setDamages(40);
			hero.bossFight(boss1);
	//First boss chest and fight end text
			
			chest1.bossChest1(hero);
			
	//Second round of rooms
			
			for(int i=0; i<=6; i++) {
				int trap=((int) Math.floor(Math.random() * 20));
				Thread.sleep(1700);
				if(trap<=1) {
					if(hero.getStrength()>=16) {
						System.out.println("You nearly fall into a pitfall as you enter the room but you were strong enough to hold yourself out!");
					}
					else {
						System.out.println("You fall into a pitfall as you enter the room, you eventually manage to get yourself out: 50 damages!");
						hero.setLife(hero.getLife()-50);
					}
				}
				else if(trap<=3) {
					if(hero.getDext()>=16) {
						System.out.println("A huge rock falls over your head as you enter the room but you were nimble enough to dodge it!");
					}
					else {
						System.out.println("A huge rock falls over your head as you enter the room, you dodge it but your back still gets hurt: 50 damages!");
						hero.setLife(hero.getLife()-50);
					}
					
				}
				else if(trap<=5) {
					if(hero.getIntell()>=16) {
						System.out.println("A wave of pure magic hurls at you but you were clever enough to send it to oblivion with a few magic signs!");
					}
					else {
						System.out.println("A wave of pure magic hurls at you, you raise your shield at the last moment but still get hit: 50 damages!");
						hero.setLife(hero.getLife()-50);
					}
					
				}Thread.sleep(1700);
				int shuffle = (int) Math.floor(Math.random() * 10);
				Thread.sleep(1700);
				if(shuffle==0) {
					room1.setName("small altar room");
					room1.setDescription("The air in this room feels strange and suddenly gets thicker!");
					room1.explore1(hero, ennemi);
				}
				else if(shuffle==1) {
					room1.setName("dark room");
					room1.setDescription("Don't you hear something? It sounds like......wing flaps!");
					room1.explore2(hero, ennemi);
				}
				else if(shuffle==2) {
					room1.setName("laboratory");
					room1.setDescription("You see multiple broken glass cylinders and the floor feels sticky under your boots.");
					room1.explore3(hero, ennemi);
				}
				else if(shuffle==3) {
					room1.setName("bloody room");
					room1.setDescription("Woaw, a chill shivers down your spine...You've got a baaad feeling about this one.");
					room1.explore4(hero, ennemi);
				}
				else if(shuffle==4) {
					room1.setName("inside graveyard");
					room1.setDescription("It stinks! How the hell can it stinks that bad?!");
					room1.explore5(hero, ennemi);
				}
				else if(shuffle==5) {
					room1.setName("nesting room");
					room1.setDescription("In the center of the room lies a nest with several eggs in it..Are they eatable?");
					room1.explore6(hero, ennemi);
				}
				else if(shuffle==6) {
					room1.setName("large room");
					room1.setDescription("In the center, you see a large pile of bones. Suddenly, they seem to be moving..");
					room1.explore7(hero, ennemi);
				}
				else if(shuffle==7) {
					room1.setName("tresor room");
					room1.setDescription("Laying all over the room floor are gold coins. What kind of sick man would keep is tresor in this tower?");
					room1.explore8(hero, ennemi);
				}
				else if(shuffle==8) {
					room1.setName("large altar room");
					room1.setDescription("Ok, there is something not funny about this one, not funny at all..");
					room1.explore9(hero, ennemi);
				}
				else if(shuffle==9) {
					room1.setName("water basin room");
					room1.setDescription("You can see something moving in this basin. You bet it won't be a dolphin..");
					room1.explore10(hero, ennemi);
				}
				
				int chest=(int) Math.floor(Math.random());
				if(chest==0) {
					chest1.chestFound(hero);
				}
				
				System.out.println("This room is empty, will you proceed to the next one?\n'y'or'n'?");
				String choix="n";
				while(choix.equals("n")) {
					Scanner scan3=new Scanner(System.in);
					choix=scan3.nextLine();
					if(choix.equals("y")) {
						System.out.println("You walk towards the door, let us go further..");
						Thread.sleep(1700);
					}
					else if(choix.equals("n")){
						System.out.println("Ok hero, take a minute to catch your breath..");
						Thread.sleep(1700);
						System.out.println("Ready now?'y'or'n'?");
					}
					
				}
			}
			
	//Second boss text
		*/	text1.secondBossText();/*
	//Second boss fight
			
			Foe boss2 = new Foe();
			boss2.setName("Lord Sorrow");
			boss2.setArmor(25);
			boss2.setStrength(25);
			boss2.setDext(25);
			boss2.setIntell(25);
			boss2.setLife((boss2.getStrength()-10)*100);
			boss2.setType("water");
			boss2.foeMagic.setName("Sadness of the Deads");
			boss2.foeMagic.setDamages(85);
			boss2.foeMagic2.setName("Personal Sorrow");
			boss2.foeMagic2.setDamages(65);
			boss2.foeMagic3.setName("Tear Drop");
			boss2.foeMagic3.setDamages(45);
			hero.bossFight(boss2);
			
	//Second boss chest and fight end text
			chest1.bossChest2(hero);
	//Third round of rooms
			
			for(int i=0; i<=6; i++) {
				int trap=((int) Math.floor(Math.random() * 20));
				Thread.sleep(1700);
				if(trap<=1) {
					if(hero.getStrength()>=16) {
						System.out.println("You nearly fall into a pitfall as you enter the room but you were strong enough to hold yourself out!");
					}
					else {
						System.out.println("You fall into a pitfall as you enter the room, you eventually manage to get yourself out: 50 damages!");
						hero.setLife(hero.getLife()-50);
					}
				}
				else if(trap<=3) {
					if(hero.getDext()>=16) {
						System.out.println("A huge rock falls over your head as you enter the room but you were nimble enough to dodge it!");
					}
					else {
						System.out.println("A huge rock falls over your head as you enter the room, you dodge it but your back still gets hurt: 50 damages!");
						hero.setLife(hero.getLife()-50);
					}
					
				}
				else if(trap<=5) {
					if(hero.getIntell()>=16) {
						System.out.println("A wave of pure magic hurls at you but you were clever enough to send it to oblivion with a few magic signs!");
					}
					else {
						System.out.println("A wave of pure magic hurls at you, you raise your shield at the last moment but still get hit: 50 damages!");
						hero.setLife(hero.getLife()-50);
					}
					
				}Thread.sleep(1700);
				int shuffle = (int) Math.floor(Math.random() * 10);
				Thread.sleep(1700);
				if(shuffle==0) {
					room1.setName("small altar room");
					room1.setDescription("The air in this room feels strange and suddenly gets thicker!");
					room1.explore1(hero, ennemi);
				}
				else if(shuffle==1) {
					room1.setName("dark room");
					room1.setDescription("Don't you hear something? It sounds like......wing flaps!");
					room1.explore2(hero, ennemi);
				}
				else if(shuffle==2) {
					room1.setName("laboratory");
					room1.setDescription("You see multiple broken glass cylinders and the floor feels sticky under your boots.");
					room1.explore3(hero, ennemi);
				}
				else if(shuffle==3) {
					room1.setName("bloody room");
					room1.setDescription("Woaw, a chill shivers down your spine...You've got a baaad feeling about this one.");
					room1.explore4(hero, ennemi);
				}
				else if(shuffle==4) {
					room1.setName("inside graveyard");
					room1.setDescription("It stinks! How the hell can it stinks that bad?!");
					room1.explore5(hero, ennemi);
				}
				else if(shuffle==5) {
					room1.setName("nesting room");
					room1.setDescription("In the center of the room lies a nest with several eggs in it..Are they eatable?");
					room1.explore6(hero, ennemi);
				}
				else if(shuffle==6) {
					room1.setName("large room");
					room1.setDescription("In the center, you see a large pile of bones. Suddenly, they seem to be moving..");
					room1.explore7(hero, ennemi);
				}
				else if(shuffle==7) {
					room1.setName("tresor room");
					room1.setDescription("Laying all over the room floor are gold coins. What kind of sick man would keep is tresor in this tower?");
					room1.explore8(hero, ennemi);
				}
				else if(shuffle==8) {
					room1.setName("large altar room");
					room1.setDescription("Ok, there is something not funny about this one, not funny at all..");
					room1.explore9(hero, ennemi);
				}
				else if(shuffle==9) {
					room1.setName("water basin room");
					room1.setDescription("You can see something moving in this basin. You bet it won't be a dolphin..");
					room1.explore10(hero, ennemi);
				}
				
				int chest=(int) Math.floor(Math.random());
				if(chest==0) {
					chest1.chestFound(hero);
				}
				
				System.out.println("This room is empty, will you proceed to the next one?\n'y'or'n'?");
				String choix="n";
				while(choix.equals("n")) {
					Scanner scan3=new Scanner(System.in);
					choix=scan3.nextLine();
					if(choix.equals("y")) {
						System.out.println("You walk towards the door, let us go further..");
						Thread.sleep(1700);
					}
					else if(choix.equals("n")){
						System.out.println("Ok hero, take a minute to catch your breath..");
						Thread.sleep(1700);
						System.out.println("Ready now?'y'or'n'?");
					}
					
				}
			}
			
	//Third boss text
		*/	text1.thirdBossText();/*
	//Third boss fight
			
			Foe boss3 = new Foe();
			boss3.setName("Lady Pain");
			boss3.setArmor(30);
			boss3.setStrength(30);
			boss3.setDext(30);
			boss3.setIntell(30);
			boss3.setLife((boss3.getStrength()-10)*100);
			boss3.setType("air");
			boss3.foeMagic.setName("Origin of Pain");
			boss3.foeMagic.setDamages(60);
			boss3.foeMagic2.setName("Infused Pain");
			boss3.foeMagic2.setDamages(70);
			boss3.foeMagic3.setName("Direct Pain");
			boss3.foeMagic3.setDamages(50);
			hero.bossFight(boss3);
			
	//Third boss chest and fight end text
		*/chest1.bossChest3(hero);
	//Final boss text
			
	//Final boss!
		
	//Final boss2 text
		
	//Final boss2!
		
	//Endings
			
			
			}
		if(x.equals("n")) {
			text1.losingText();
		}
		else if(hero.getLife()<=0){
			text1.dyingText();		
		}
		else if(bossF.getLife()<=0){
			
		}
		else if(bossF2.getLife()<=0) {
			
		}
		text1.gameOver();
	}

}
