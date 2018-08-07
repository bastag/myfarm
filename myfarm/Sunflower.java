import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Sunflower extends Flower
{	
	public Sunflower ()
	{
		super();
		
		cropType = "Sunflower";
		harvestTime = 3.5;
		seedCost = 20;
		basePrice = 19;
		waterNeeded = 2;
		fertilizerNeeded = 1;
	}
	
	public void plant (Tile tile);
	{
		if (tile.isPlowed && !tile.withRocks && !tile.isOccupied)
		{
			amountHeld--;
			tile.crop = new Sunflower ();
			tile.setIsOccupied (true);
		}
	}
}