import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Carrot extends Vegetable
{	
	public Carrot ()
	{
		super();
		
		cropType = "Carrot";
		harvestTime = 1.5;
		seedCost = 10;
		basePrice = 9;
		waterNeeded = 1;
		fertilizerNeeded = 0;
		productsProduced = 2;
	}
	
	public void plant (Tile tile);
	{
		if (tile.isPlowed && !tile.withRocks && !tile.isOccupied)
		{
			amountHeld--;
			tile.crop = new Carrot ();
			tile.setIsOccupied (true);
		}
	}
}