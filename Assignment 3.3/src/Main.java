public class Main {
    public static void main(String[] args) {
        MenuComponent pizza = new MenuItem("Pizza", "Cheese pizza with tomato sauce", 8.99);
        MenuComponent pasta = new MenuItem("Pasta", "Spaghetti with marinara sauce", 7.99);
        MenuComponent salad = new MenuItem("Salad", "Caesar salad with croutons", 5.99);
        MenuComponent dessert = new MenuItem("Dessert", "Chocolate cake slice", 3.99);

        MenuComponent mainMenu = new Menu("Main Menu", "Main restaurant menu");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Lunch specials");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Dinner specials");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Desserts");

        mainMenu.add(lunchMenu);
        mainMenu.add(dinnerMenu);

        lunchMenu.add(pizza);
        lunchMenu.add(salad);

        dinnerMenu.add(pasta);
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(dessert);

        mainMenu.print();
    }
}
