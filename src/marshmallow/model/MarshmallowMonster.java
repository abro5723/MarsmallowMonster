package marshmallow.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterNose;
	private double monsterHair;
	private double monsterLegs;
	private boolean monsterBellyButton;

	private MarshmallowMonster()
	{

	}

	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterNose, double monsterHair, double monsterLegs, boolean monsterBellyButton)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterNose = monsterNose;
		this.monsterHair = monsterHair;
		this.monsterLegs = monsterLegs;
		this.monsterBellyButton = monsterBellyButton;
	}

}
