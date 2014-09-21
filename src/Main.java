/*
 * 
 * Maciej Skowyra
 * 
 */


public class Main {

	//skladamy zamowienie na pizze
	public static void main(String[] args) 
	{

		Pizza pizza = new PodstawowaPizza();
        System.out.println("\nNazwa: "+pizza.getName()+" \nCena: " + pizza.getCost() +"PLN"+ "\nSk³adniki: " + pizza.getIngredients());
 
        pizza = new WithoutChicken(pizza);
        System.out.println("\nNazwa: "+pizza.getName()+" \nCena: " + pizza.getCost() +"PLN"+ "\nSk³adniki: " + pizza.getIngredients());
     
        pizza = new WithChicken(pizza);
        System.out.println("\nNazwa: "+pizza.getName()+" \nCena: " + pizza.getCost() +"PLN"+ "\nSk³adniki: " + pizza.getIngredients());

        pizza = new WithSalami(pizza);
        System.out.println("\nNazwa: "+pizza.getName()+" \nCena: " + pizza.getCost() +"PLN"+ "\nSk³adniki: " + pizza.getIngredients());

        pizza = new WithExtraCheese(pizza);
        System.out.println("\nNazwa: "+pizza.getName()+" \nCena: " + pizza.getCost() +"PLN"+ "\nSk³adniki: " + pizza.getIngredients());
        
        pizza = new WithoutMushrooms(pizza);
        System.out.println("\nNazwa: "+pizza.getName()+" \nCena: " + pizza.getCost() +"PLN"+ "\nSk³adniki: " + pizza.getIngredients());
     
        pizza = new WithoutChicken(pizza);
        System.out.println("\nNazwa: "+pizza.getName()+" \nCena: " + pizza.getCost() +"PLN"+ "\nSk³adniki: " + pizza.getIngredients());
     
	}
	

}
