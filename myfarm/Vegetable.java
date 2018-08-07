import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public abstract class Vegetable extends Crop
{	
	public Vegetable ()
	{
		super ();
		harvestCost = 1;
	}
}