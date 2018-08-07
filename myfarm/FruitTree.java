import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public abstract class FruitTree extends Crop
{	
	public FruitTree ()
	{
		super ();
		harvestCost = 3;
	}
}