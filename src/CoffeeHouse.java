public class CoffeeHouse {

    public static void main(String[] args) {

        Drink cappuccino = new Coffee(3);
        Drink yellowTea = new Tea(3);

        cappuccino.setIngredients(new Ingredient("Milk"),new Ingredient("Sugar"), new Ingredient("Arabica"));
        yellowTea.setIngredients(new Ingredient("Hot Watter"),new Ingredient("Sugar"), new Ingredient("Green leaves"));

        produceDrink(cappuccino);
        produceDrink(yellowTea);

        produceDrink(cappuccino);

        Ingredient ingredient = new Ingredient("Sugar");
        produceDrink(ingredient);
    }

    static void produceDrink(Drink drink){                                  // Metoda przyjmująca obiekty typu Drink
        System.out.println(drink.getClass().getTypeName());
        System.out.println(drink);
    }

    static <T> void produceDrink(T someObject){                       // Sparametryzowana metoda pryjmująca obiekt każdego typu
        displayProduct(someObject);
        System.out.println(someObject);
    }

    private static <T> void displayProduct(T someObject) {
        System.out.println(someObject.getClass().getTypeName());
    }
}
