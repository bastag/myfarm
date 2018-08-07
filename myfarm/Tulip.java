import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Tulip extends Flower
{	
	public Tulip ()
	{
		super();
		
		cropType = "Tulip";
		harvestTime = 1.5;
		seedCost = 7;
		basePrice = 7;
		waterNeeded = 2;
		fertilizerNeeded = 0;
	}
	
	public void plant (Tile tile);
	{
		if (tile.isPlowed && !tile.withRocks && !tile.isOccupied)
		{
			amountHeld--;
			tile.crop = new Tulip ();
			tile.setIsOccupied (true);
		}
	}
}