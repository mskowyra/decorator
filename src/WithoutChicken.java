/*
 * 
 * Maciej Skowyra
 * 
 */

//dodatek z cen¹, skladnikiem i nazwa
public class WithoutChicken extends PizzaDecorator 
{

	public WithoutChicken(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
 
    public double getCost() {
    	if (super.getIngredients().contains("kurczak"))
    		return super.getCost() - 4.50;
    	else
    		return super.getCost();
    }
 
    public String getIngredients() {
    	if (super.getIngredients().contains("kurczak"))
    		return super.getIngredients().replace("kurczak", "");
    	else
    		return super.getIngredients();
    }
    
    public String getName() {
    	if (super.getIngredients().contains("kurczak"))
    		return super.getName().replace(" plus kurczak,", "");
    	else
    		return super.getName();
    }
    
}
