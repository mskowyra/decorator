/*
 * 
 * Maciej Skowyra
 * 
 */

// abstrakcyjny dekorator 

abstract public class PizzaDecorator implements Pizza 
{
	protected final Pizza decoratedPizza;
 
    public PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }
 
    public double getCost() { 
        return decoratedPizza.getCost();
    }
 
    public String getIngredients() {
        return decoratedPizza.getIngredients();
    }
    
    public String getName()
    {
    	return decoratedPizza.getName();
    }
    

}
