public class Drink {
    private String name;
    private float price;
    private String[] ingredienti;

    public Drink(String name, float price, String[] ingredienti) {
        this.name = name;
        this.price = price;
        this.ingredienti = ingredienti;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String[] getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String[] ingredienti) {
        this.ingredienti = ingredienti;
    }
}
