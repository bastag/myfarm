import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Mango extends FruitTree
{	
	public Mango ()
	{
		super();
		
		cropType = "Mango";
		harvestTime = 7;
		seedCost = 50;
		basePrice = 4;
		waterNeeded = 7;
		fertilizerNeeded = 4;
		productsProduced = 10;
	}
}