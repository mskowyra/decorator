/*
 * 
 * Maciej Skowyra
 * 
 */

//dodatek z cen¹, skladnikiem i nazwa
public class WithChicken extends PizzaDecorator 
{

    public WithChicken(Pizza decoratedPizza) {
        super(decoratedPizza);
    }
 
    public double getCost() {
        return super.getCost() + 4.50;
    }
 
    public String getIngredients() {
        return super.getIngredients()+ " kurczak";
    }
    
    public String getName() {
        return super.getName()+" plus kurczak,";
    }
    
}
