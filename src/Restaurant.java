public class Restaurant {
    private String name;
    private Dish[] dishes;
    private Drink[] drinks;
    
    public Restaurant(String name, Dish[] dishes, Drink[] drinks) {
        this.name = name;
        this.dishes = dishes;
        this.drinks = drinks;
    }

    public void stampaMenu() {
        System.out.println("I nostri piatti:");
        for (Dish dish : dishes) {
            System.out.println(dish.getName() + ':' + dish.getPrice() + '€');
        }
        System.out.println("");
        System.out.println("I drink:");
        for (Drink drink : drinks) {
            System.out.println(drink.getName() + ':' + drink.getPrice() + '€');
        }
    }

    public void stampaIngredienti(String drinkScelto) {
        System.out.println("Gli ingedienti di questo cocktail sono:");
        for (Drink drink : drinks) {
            if(drinkScelto.equals(drink.getName())) {
                for (String ing : drink.getIngredienti()) {
                    System.out.println(ing);
                }
            }
        }
    }
}
