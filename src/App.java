import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Dish primo = new Dish("Carbonara", 12);
        Dish secondo = new Dish("Carne e patatine", 17);
        Dish[] arr = new Dish[] {primo,secondo};
        Drink mojito = new Drink("Mojito", 12.50f, new String[] {"menta", "lime", "zucchero", "rum bianco"});
        Drink negroni = new Drink("Negroni", 9.50f, new String[] {"campari", "vermouth", "gin", "arance"});
        Drink[] arr2 = new Drink[] {mojito,negroni};
        Restaurant cicco = new Restaurant("ciccio", arr, arr2);
        cicco.stampaMenu();
        System.out.println("scegli un drink");
        Scanner scan = new Scanner(System.in);
        String drinkScelto = scan.nextLine();
        cicco.stampaIngredienti(drinkScelto);
    }
}
