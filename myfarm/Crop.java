import java.lang.*
import java.util.*
import javafx.*
import java.io.*
import java.time.*

public abstract class Crop
{
	String cropType;
	float harvestTime, harvestCost, seedCost, basePrice;
	int waterNeeded, fertilizerNeeded, productsProduced, amountHeld;
	
	public Crop ()
	{
		amountHeld = 0;
	}
	
	public void displayInformation ()
	{
		toString ();
	}
	
	public void buyMore ();
	{
		player.setWallet ( -1 * seedCost);
		amountHeld++;
	}
	
	public void plant ();
	
	public String getCropType ()
	{
		return cropType;
	}
	
	public float getHarvestTime ()
	{
		return harvestTime;
	}
	
	public float getHarvestCost ();
	{
		return harvestCost;
	}
	
	public float getSeedCost ();
	{
		return seedCost;
	}
	
	public float getBasePrice ();
	{
		return basePrice;
	}
	
	public int getWaterNeeded ();
	{
		return waterNeeded;
	}
	
	public int getFertilizerNeeded ();
	{
		return fertilizerNeeded;
	}
	
	public int getProductsProduced ();
	{
		return productsProduced;
	}
	
	public int getAmountHeld ();
	{
		return amountHeld;
	}
	
	@Override
	public String toString ()
	{
		System.out.println ("Name:" + cropType + "Harvest Time:" + harvestTime + "minutes" + "Harvest Cost:" + harvestCost 
							+ "Seed Cost:" + seedCost + "Base Price:" + basePrice + "Water Needed:" + waterNeeded 
							+ "Fertilizer Needed:" + fertilizerNeeded + "Products Produced:" + productsProduced + "Amount Held:" + amountHeld)
	}
}