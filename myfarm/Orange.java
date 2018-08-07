import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Orange extends FruitTree
{	
	public Orange ()
	{
		super();
		
		cropType = "Orange";
		harvestTime = 8;
		seedCost = 65;
		basePrice = 4.5;
		waterNeeded = 8;
		fertilizerNeeded = 6;
		productsProduced = 15;
	}
}