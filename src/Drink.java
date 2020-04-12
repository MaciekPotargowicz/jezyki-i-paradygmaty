import java.util.Arrays;

public abstract class Drink {

    Ingredient [] ingredients;

    @Override
    public String toString() {
        return "ingredients=" + Arrays.toString(ingredients);
    }

    public Drink(Integer ingredientsSize) {
        this.ingredients = new Ingredient[ingredientsSize];
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient... args) {                // Metoda wariadyczna
        for (int i = 0; i<this.ingredients.length;i++){
            this.ingredients[i] = args[i];
        }
    }
}
