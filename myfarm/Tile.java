import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*
import javax.swing.*

public class Tile throws Exception
{	
	public Crop crop;
	boolean isPlowed, withRocks, isWithered, isOccupied, isBlooming;
	int timesWatered, timesFertilized;
	

	public Tile ()
	{
		isPlowed = false; 
		withRocks = false;
		isWithered = false;
		isOccupied = false;
		isBlooming = false;
		timesWatered = 0;
		timesFertilized = 0;
	}
	
	public void displayInformation()
	{
		toString ();
	}
	
	public void harvest(Person person)
	{
		int value = crop.basePrice + person.levelBonus;
		
		if (timesWatered > 0)
			value += timesWatered + crop.basePrice / 4;
		
		if (timesFertilizeded > 0)
			value += timesFertilizeded + crop.basePrice / 2;
		
		if (isBlooming)
			value += (timesWatered + crop.basePrice / 4 + timesFertilizeded + crop.basePrice / 2) / 20;
		
		person.setWallet (value);
		
	}
	
	public void grow ()
	{
		Timer timer = new  Timer (1000, new ActionListener);
		int holder;
		
		@Override
		publc void actionPerformed (ActionEvent e)
		{
			holder++;
		}
		
		timer.start();
		if (holder = 60)
			timer.stop();
		
		
	}
	
	public boolean getIsPlowed()
	{
		return isPlowed;
	}
	
	public String getCrop()
	{
		return crop;
	}
	
	public boolean getWithRocks()
	{
		return withRocks;
	}
	
	public boolean getIsWithered()
	{
		return isWithered;
	}
	
	public boolean getIsOccupied()
	{
		return isOccupied;
	}
	
	public void setBloom ()
	{
		if (cropType instanceof Flower)
			isBlooming = true;
	}

	public String toString()
	{
		
	}
}
