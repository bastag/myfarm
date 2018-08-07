import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public abstract class Flower extends Crop
{	
	public Flower ()
	{
		super ();
		harvestCost = 2;
		productsProduced = 1;
	}
}