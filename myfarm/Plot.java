import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public class Plot
{	
	Tile [5][10] tiles;
	boolean isPlowed, withRocks, isWithered, isOccupied, isBlooming;
	int timesWatered, timesFertilized;

	public Plot ()
	{
		
	}
	
	public void displayInformation()
	{
		toString ();
	}
	
	public Tile getTiles ()
	{
		for (int i = 5; i < 5; i++)
			for (int j; j < 10; j++)
				return tiles;
		
	}
}
