import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Rose extends Flower
{	
	public Rose ()
	{
		super();
		
		cropType = "Rose";
		harvestTime = 1;
		seedCost = 5;
		basePrice = 5;
		waterNeeded = 1;
		fertilizerNeeded = 0;
	}
	
	public void plant (Tile tile);
	{
		if (tile.isPlowed && !tile.withRocks && !tile.isOccupied)
		{
			amountHeld--;
			tile.crop = new Rose ();
			tile.setIsOccupied (true);
		}
	}
}