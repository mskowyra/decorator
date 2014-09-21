/*
 * 
 * Maciej Skowyra
 * 
 */

//dodatek z cen¹, skladnikiem i nazwa
public class WithExtraCheese extends PizzaDecorator
{
	public WithExtraCheese(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
 
    public double getCost() {
        return super.getCost() + 2.50;
    }
 
    public String getIngredients() {
        return super.getIngredients()+ " dodatkowy ser";
    }
    
    public String getName() {
        return super.getName()+ " plus dodatkowy ser,";
    }
    
}
