public class Main {
    public static void main(String[] args) {
        Pizza margheritaPizza = new MargheritaPizza();
        margheritaPizza = new CheeseTopping(margheritaPizza);
        margheritaPizza = new MushroomTopping(margheritaPizza);


        System.out.println("Order 1: " + margheritaPizza.getDescription());
        System.out.println("Total Cost: $" + margheritaPizza.getCost());

        Pizza vegetarianPizza = new VegetarianPizza();
        vegetarianPizza = new PepperoniTopping(vegetarianPizza);
        vegetarianPizza = new CheeseTopping(vegetarianPizza);

        System.out.println("\nOrder 2: " + vegetarianPizza.getDescription());
        System.out.println("Total Cost: $" + vegetarianPizza.getCost());
    }
}
