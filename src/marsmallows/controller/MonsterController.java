package marsmallows.controller;

import marshmallow.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster ashMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 4;
		double legs = 8;
		int nose = 1;
		double hair = 2;
		boolean hasBellyButton = false;
		String name = "Spindle the Spider";
		
		myOutput = new MarshmallowOutput();
		ashMonster = new MarshmallowMonster(name, eyes, nose, hair, legs, hasBellyButton);	
	}

	public void start()
	{
		myOutput.displayMonsterInfo(ashMonster.toString());
	}

}
