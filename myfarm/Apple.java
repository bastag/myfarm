import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Apple extends FruitTree
{	
	public Apple ()
	{
		super();
		
		cropType = "Apple";
		harvestTime = 7;
		seedCost = 55;
		basePrice = 3.5;
		waterNeeded = 7;
		fertilizerNeeded = 5;
		productsProduced = 10;
	}
}