/*
 * 
 * Maciej Skowyra
 * 
 */

//dodatek z cen¹, skladnikiem i nazwa
public class WithSalami extends PizzaDecorator 
{
	public WithSalami(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
 
    public double getCost() {
        return super.getCost() + 3.00;
    }
 
    public String getIngredients() {
        return super.getIngredients()+ " salami";

    }
    
    public String getName() {
        return super.getName()+ " plus salami,";
    }

    
}
