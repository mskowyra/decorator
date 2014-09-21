/*
 * 
 * Maciej Skowyra
 * 
 */

// standardowa nieudekorowana pizza 
public class PodstawowaPizza implements Pizza 
{
	
	public double getCost() {
        return 10;
    }
 
    public String getIngredients() {
        return "sos pieczarki ser";
    }
    
    public String getName() {
        return "Podstawowa Pizza,";
    }

    
}
