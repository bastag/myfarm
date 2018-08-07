import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Stargazer extends Flower
{	
	public Stargazer ()
	{
		super();
		
		cropType = "Stargazer";
		harvestTime = 2.5;
		seedCost = 10;
		basePrice = 9;
		waterNeeded = 2;
		fertilizerNeeded = 0;
	}
	
	public void plant (Tile tile);
	{
		if (tile.isPlowed && !tile.withRocks && !tile.isOccupied)
		{
			amountHeld--;
			tile.crop = new Stargazer ();
			tile.setIsOccupied (true);
		}
	}
}