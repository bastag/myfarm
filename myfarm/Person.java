import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Person
{	
	String name, rank;
	float wallet, levelBonus;
	int level, xp;

	public Person (String name)
	{
		this.name = name;
		rank = "Farmer";
		wallet = ;
		level = 0;
		xp = 0;
	}
	
	public void displayInformation()
	{
		toString ();
	}
	
	public void harvest()
	{
		
	}
	
	public void IncreaseRank ()
	{
		int cost = 10;
		
		if (wallet > cost)
			if (rank.equals ("Farmer") && level == 10)
			{
				wallet -= 200;
				rank = "Registered Farmer";
				levelBonus = 2;
			}
			
			else if (rank.equals ("Registered Farmer") && level == 15)
			{
				wallet -= 15;
				rank = "Distinguished Farmer";
				levelBonus ++;
			}
			
			else if (rank.equals ("Distinguished Farmer") && level == 20)
			{
				wallet -= 20;
				rank = "Honorable Farmer";
				levelBonus++;
			}
		
		else
			System.out.println ("Insufficient requirements");
	}

	public String getName()
	{
		return name;
	}
	
	public float getWallet()
	{
		return wallet;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public int getXP()
	{
		return xp;
	}
	
	public String getRank ()
	{
		return rank;
	}
	
	public void setWallet (float value)
	{
		wallet += value;
	}

	public String toString()
	{
		System.out.println ("Name: " + name + "Amount of funds" + wallet + "FC" + "Level:" + level + "Experience: " + xp + "Rank: ": + rank)
	}
}
