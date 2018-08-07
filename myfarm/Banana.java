import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Banana extends FruitTree
{	
	public Banana ()
	{
		super();
		
		cropType = "Banana";
		harvestTime = 8;
		seedCost = 60;
		basePrice = 3.5;
		waterNeeded = 8;
		fertilizerNeeded = 5;
		productsProduced = 15;
	}
	
	
}