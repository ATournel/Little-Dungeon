import java.util.Scanner;

public class Room {

	Hero hero;
	String name;
	int NbOfFoes;
	String description;
	int trap;
	
	public int getTrap() {
		return trap;
	}

	public void setTrap(int trap) {
		this.trap = trap;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNbOfFoes() {
		return NbOfFoes;
	}

	public void setNbOfFoes(int nbOfFoes) {
		NbOfFoes = nbOfFoes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		//spirits several
	public void explore1(Hero perso, Foe ennemi) throws InterruptedException {
		System.out.println("You find yourself into a "+getName()+".\n");
		Thread.sleep(1700);		
		System.out.println(getDescription()+"\n");
		Thread.sleep(1700);
		setNbOfFoes((int) Math.floor(Math.random() * 10));		
		if(getNbOfFoes()<=2) {
			System.out.println("An ennemi attacks you!\n");
			Thread.sleep(1700);
			ennemi.setName("fire spirit");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(15);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("fire");
			ennemi.foeMagic.setName("fire breath");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if(getNbOfFoes()<=5) {
			System.out.println("Two ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("fire spirit");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(15);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("fire");
			ennemi.foeMagic.setName("fire breath");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("water spirit");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(15);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("ice spike");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if (getNbOfFoes()<=8) {
			System.out.println("Three ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("fire spirit");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(15);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("fire");
			ennemi.foeMagic.setName("fire breath");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("water spirit");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(15);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("ice spike");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("wind spirit");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(15);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("wind slash");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
		}
		else {
			System.out.println("You go through this "+getName()+" undangered.. Feels quiet, too quiet..");
		}
		Thread.sleep(1700);
		
		
	}
		//bats air
	public void explore2(Hero perso, Foe ennemi) throws InterruptedException {
		System.out.println("You find yourself into a "+getName()+".\n");
		Thread.sleep(1700);		
		System.out.println(getDescription()+"\n");
		Thread.sleep(1700);
		setNbOfFoes((int) Math.floor(Math.random() * 10));		
		if(getNbOfFoes()<=2) {
			System.out.println("An ennemi attacks you!\n");
			Thread.sleep(1700);
			ennemi.setName("bat");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("Fang attack");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if(getNbOfFoes()<=5) {
			System.out.println("Two ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("bat");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("Fang attack");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("bat");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("Fang attack");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if (getNbOfFoes()<=8) {
			System.out.println("Three ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("bat");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("Fang attack");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("bat");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("Fang attack");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("huge bat");
			ennemi.setArmor(6);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("Huge fang attack");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
		}
		else {
			System.out.println("You go through this "+getName()+" undangered.. Feels quiet, too quiet..");
		}
		Thread.sleep(1700);
		
		
	}
		//blobs water
	public void explore3(Hero perso, Foe ennemi) throws InterruptedException {
		System.out.println("You find yourself into a "+getName()+".\n");
		Thread.sleep(1700);		
		System.out.println(getDescription()+"\n");
		Thread.sleep(1700);
		setNbOfFoes((int) Math.floor(Math.random() * 10));		
		if(getNbOfFoes()<=2) {
			System.out.println("An ennemi attacks you!\n");
			Thread.sleep(1700);
			ennemi.setName("blob");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("blob spit");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if(getNbOfFoes()<=5) {
			System.out.println("Two ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("blob");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("blob spit");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("blob");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("blob spit");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if (getNbOfFoes()<=8) {
			System.out.println("Three ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("blob");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("blob spit");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("blob");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("blob spit");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("bigger blob");
			ennemi.setArmor(6);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("water beam");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
		}
		else {
			System.out.println("You go through this "+getName()+" undangered.. Feels quiet, too quiet..");
		}
		Thread.sleep(1700);
		
	}
		//vampires neutral
	public void explore4(Hero perso, Foe ennemi) throws InterruptedException {
		System.out.println("You find yourself into a "+getName()+".\n");
		Thread.sleep(1700);
		System.out.println(getDescription()+"\n");
		Thread.sleep(1700);
		setNbOfFoes((int) Math.floor(Math.random() * 10));		
		if(getNbOfFoes()<=2) {
			System.out.println("An ennemi attacks you!\n");
			Thread.sleep(1700);
			ennemi.setName("vampire");
			ennemi.setArmor(5);
			ennemi.setStrength(11);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-5)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("blood suck");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if(getNbOfFoes()<=5) {
			System.out.println("Two ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("vampire");
			ennemi.setArmor(5);
			ennemi.setStrength(11);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-5)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("blood suck");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("vampire");
			ennemi.setArmor(5);
			ennemi.setStrength(11);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-5)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("blood suck");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if (getNbOfFoes()<=8) {
			System.out.println("Three ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("vampire");
			ennemi.setArmor(5);
			ennemi.setStrength(11);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-5)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("blood suck");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("vampire");
			ennemi.setArmor(5);
			ennemi.setStrength(11);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-5)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("blood suck");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("higher vampire");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(15);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-5)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("life drain");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
		}
		else {
			System.out.println("You go through this "+getName()+" undangered.. Feels quiet, too quiet..");
		}
		Thread.sleep(1700);
		
	}
		//undeads earth
	public void explore5(Hero perso, Foe ennemi) throws InterruptedException {
		System.out.println("You find yourself into a "+getName()+".\n");
		Thread.sleep(1700);
		System.out.println(getDescription()+"\n");
		Thread.sleep(1700);
		setNbOfFoes((int) Math.floor(Math.random() * 10));		
		if(getNbOfFoes()<=2) {
			System.out.println("An ennemi attacks you!\n");
			Thread.sleep(1700);
			ennemi.setName("undead");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("undead bite");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if(getNbOfFoes()<=5) {
			System.out.println("Two ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("undead");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("undead bite");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("undead");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("undead bite");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if (getNbOfFoes()<=8) {
			System.out.println("Three ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("undead");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("undead bite");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("undead");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("undead bite");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("undead knight");
			ennemi.setArmor(6);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("death bite");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
		}
		else {
			System.out.println("You go through this "+getName()+" undangered.. Feels quiet, too quiet..");
		}
		Thread.sleep(1700);
		
	}
		//harpies air
	public void explore6(Hero perso, Foe ennemi) throws InterruptedException {
		System.out.println("You find yourself into a "+getName()+".\n");
		Thread.sleep(1700);
		System.out.println(getDescription()+"\n");
		Thread.sleep(1700);
		setNbOfFoes((int) Math.floor(Math.random() * 10));		
		if(getNbOfFoes()<=2) {
			System.out.println("An ennemi attacks you!\n");
			Thread.sleep(1700);
			ennemi.setName("harpie");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("claw strike");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if(getNbOfFoes()<=5) {
			System.out.println("Two ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("harpie");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("claw strike");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("harpie");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("claw strike");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if (getNbOfFoes()<=8) {
			System.out.println("Three ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("harpie");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("claw strike");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("harpie");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("claw strike");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("harpie mother");
			ennemi.setArmor(6);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("air");
			ennemi.foeMagic.setName("double claw strike");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
		}
		else {
			System.out.println("You go through this "+getName()+" undangered.. Feels quiet, too quiet..");
		}
		Thread.sleep(1700);
	}
		//squelettons earth
	public void explore7(Hero perso, Foe ennemi) throws InterruptedException {
		System.out.println("You find yourself into a "+getName()+".\n");
		Thread.sleep(1700);
		System.out.println(getDescription()+"\n");
		Thread.sleep(1700);
		setNbOfFoes((int) Math.floor(Math.random() * 3));		
		if(getNbOfFoes()<=2) {
			System.out.println("An ennemi attacks you!\n");
			Thread.sleep(1700);
			ennemi.setName("squeletton");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("bone slash");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if(getNbOfFoes()<=5) {
			System.out.println("Two ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("squeletton");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("bone slash");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("squeletton");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("bone slash");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if (getNbOfFoes()<=8) {
			System.out.println("Three ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("squeletton");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("bone slash");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("squeletton");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("bone slash");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("giant squeletton");
			ennemi.setArmor(6);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-8)*100);
			ennemi.setType("earth");
			ennemi.foeMagic.setName("heavy bone slash");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else {
			System.out.println("You go through this "+getName()+" undangered.. Feels quiet, too quiet..");
		}
		Thread.sleep(1700);
	}
		//goblins neutral
	public void explore8(Hero perso, Foe ennemi) throws InterruptedException {
		System.out.println("You find yourself into a "+getName()+".\n");
		Thread.sleep(1700);
		System.out.println(getDescription()+"\n");
		Thread.sleep(1700);
		setNbOfFoes((int) Math.floor(Math.random() * 3));		
		if(getNbOfFoes()<=2) {
			System.out.println("An ennemi attacks you!\n");
			Thread.sleep(1700);
			ennemi.setName("goblin");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("coin toss");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if(getNbOfFoes()<=5) {
			System.out.println("Two ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("goblin");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("coin toss");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("goblin");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("coin toss");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if (getNbOfFoes()<=8) {
			System.out.println("Three ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("goblin");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("coin toss");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("goblin");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("coin toss");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("goblin king");
			ennemi.setArmor(6);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("neutral");
			ennemi.foeMagic.setName("coin chest strike");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
		}
		else {
			System.out.println("You go through this "+getName()+" undangered.. Feels quiet, too quiet..");
		}
		Thread.sleep(1700);
	}
		//demons fire
	public void explore9(Hero perso, Foe ennemi) throws InterruptedException {
		System.out.println("You find yourself into a "+getName()+".\n");
		Thread.sleep(1700);
		System.out.println(getDescription()+"\n");
		Thread.sleep(1700);
		setNbOfFoes((int) Math.floor(Math.random() * 3));		
		if(getNbOfFoes()<=2) {
			System.out.println("An ennemi attacks you!\n");
			Thread.sleep(1700);
			ennemi.setName("fire sword demon");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("fire");
			ennemi.foeMagic.setName("fire sword slash");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
		}
		else if(getNbOfFoes()<=5) {
			System.out.println("Two ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("fire sword demon");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("fire");
			ennemi.foeMagic.setName("fire sword slash");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
			
			ennemi.setName("fire axe demon");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("fire");
			ennemi.foeMagic.setName("fire axe strike");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
		}
		else if (getNbOfFoes()<=8) {
			System.out.println("Three ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("fire sword demon");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("fire");
			ennemi.foeMagic.setName("fire sword slash");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
			
			ennemi.setName("fire axe demon");
			ennemi.setArmor(10);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("fire");
			ennemi.foeMagic.setName("fire axe strike");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
			
			ennemi.setName("fire hammer demon");
			ennemi.setArmor(10);
			ennemi.setStrength(18);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-10)*100);
			ennemi.setType("fire");
			ennemi.foeMagic.setName("fire hammer smash");
			ennemi.foeMagic.setDamages(80);
			perso.fight(ennemi);
		}
		else {
			System.out.println("You go through this "+getName()+" undangered.. Feels quiet, too quiet..");
		}
		Thread.sleep(1700);
	}
		//dryade water
	public void explore10(Hero perso, Foe ennemi) throws InterruptedException {
		System.out.println("You find yourself into a "+getName()+".\n");
		Thread.sleep(1700);
		System.out.println(getDescription()+"\n");
		Thread.sleep(1700);
		setNbOfFoes((int) Math.floor(Math.random() * 10));		
		if(getNbOfFoes()<=2) {
			System.out.println("An ennemi attacks you!\n");
			Thread.sleep(1700);
			ennemi.setName("dryade");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-9)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("scale trhow");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if(getNbOfFoes()<=5) {
			System.out.println("Two ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("dryade");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-9)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("scale trhow");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("dryade");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-9)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("scale trhow");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
		}
		else if (getNbOfFoes()<=8) {
			System.out.println("Three ennemies attack you!\n");
			Thread.sleep(1700);
			ennemi.setName("dryade");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-9)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("scale trhow");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("dryade");
			ennemi.setArmor(3);
			ennemi.setStrength(11);
			ennemi.setDext(5);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-9)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("scale trhow");
			ennemi.foeMagic.setDamages(20);
			perso.fight(ennemi);
			
			ennemi.setName("dryade queen");
			ennemi.setArmor(6);
			ennemi.setStrength(15);
			ennemi.setDext(10);
			ennemi.setIntell(15);
			ennemi.setLife((ennemi.getStrength()-9)*100);
			ennemi.setType("water");
			ennemi.foeMagic.setName("scale tornado");
			ennemi.foeMagic.setDamages(40);
			perso.fight(ennemi);
		}
		else {
			System.out.println("You go through this "+getName()+" undangered.. Feels quiet, too quiet..");
		}
		Thread.sleep(1700);
	}
}
