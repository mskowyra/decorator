/*
 * 
 * Maciej Skowyra
 * 
 */

//dodatek z cen¹, skladnikiem i nazwa
public class WithoutMushrooms extends PizzaDecorator 
{
	public WithoutMushrooms(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
 
    public double getCost() {
    	if (super.getIngredients().contains("pieczarki"))
    		return super.getCost() - 3.50;
    	else
    		return super.getCost();
    }
 
    public String getIngredients() {
    	if (super.getIngredients().contains("pieczarki"))
    		return super.getIngredients().replace(" pieczarki", "");
    	else
    		return super.getIngredients();
    }
    
    public String getName() {
    	if (super.getIngredients().contains("pieczarki"))
    		return super.getName()+" minus pieczarki,";
    	else
    		return super.getName();
    }
}
