import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Potato extends Vegetable
{	
	public Potato ()
	{
		super();
		
		cropType = "Potato";
		harvestTime = 5;
		seedCost = 25;
		basePrice = 13;
		waterNeeded = 4;
		fertilizerNeeded = 2;
		productsProduced = 6;
	}
	
	public void plant (Tile tile);
	{
		if (tile.isPlowed && !tile.withRocks && !tile.isOccupied)
		{
			amountHeld--;
			tile.crop = new Potato ();
			tile.setIsOccupied (true);
		}
	}
}