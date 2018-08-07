import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Tomato extends Vegetable
{	
	public Tomato ()
	{
		super();
		
		cropType = "Tomato";
		harvestTime = 2.5;
		seedCost = 20;
		basePrice = 15;
		waterNeeded = 3;
		fertilizerNeeded = 1;
		productsProduced = 3;
	}
	
	public void plant (Tile tile);
	{
		if (tile.isPlowed && !tile.withRocks && !tile.isOccupied)
		{
			amountHeld--;
			tile.crop = new Tomato ();
			tile.setIsOccupied (true);
		}
	}
}