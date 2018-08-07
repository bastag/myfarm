import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Turnip extends Vegetable
{	
	public Turnip ()
	{
		super();
		
		cropType = "Turnip";
		harvestTime = 1;
		seedCost = 5;
		basePrice = 6;
		waterNeeded = 1;
		fertilizerNeeded = 0;
		productsProduced = 1;
	}
	
	public void plant (Tile tile);
	{
		if (tile.isPlowed && !tile.withRocks && !tile.isOccupied)
		{
			amountHeld--;
			tile.crop = new Turnip ();
			tile.setIsOccupied (true);
		}
	}
}