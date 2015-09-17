package marsmallows.controller;

import java.util.Scanner;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster ashMonster;
	private MarshmallowMonster userMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 4;
		double legs = 8;
		int nose = 1;
		double hair = 2;
		boolean hasBellyButton = false;
		String name = "Spindle the Spider";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		ashMonster = new MarshmallowMonster(name, eyes, nose, hair, legs, hasBellyButton);	
	}

	public void start()
	{
		ashMonster.toString();
		myOutput.displayMonsterInfo(ashMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info" + ashMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		
		System.out.println("Type in a new number of eyes");
		int betterMonsterEyes = monsterScanner.nextInt();
		
		System.out.println("Type in a new number of legs");
		double betterMonsterLegs = monsterScanner.nextDouble();
		
		System.out.println("Type in a new number of noses");
		int betterMonsterNose = monsterScanner.nextInt();
		
		System.out.println("Type in a new number of hair");
		double betterMonsterHair = monsterScanner.nextDouble();
		
		System.out.println("Will it have a bellybutton?(True/False)");
		boolean betterMonsterBellyButton = monsterScanner.nextBoolean();
		
		ashMonster.setMonsterName(betterMonsterName);
		ashMonster.setMonsterEyes(betterMonsterEyes);
		ashMonster.setMonsterLegs(betterMonsterLegs);
		ashMonster.setMonsterNose(betterMonsterNose);
		ashMonster.setMonsterHair(betterMonsterHair);
		ashMonster.setMonsterBellyButton(betterMonsterBellyButton);
	}

	/**
	 * This method will get the information to create an instance of a MarshmallowMonster.
	 */
	private void makeUserMonster()
	{
		//Step one: Get variables
		String userName;
		int userEyes;
		int userNoseCount
		
	}
}
