public class MealBuilder {
    public String mainDish;
    public String sideDish;
    public String drink;
    public String dessert = "Default Dessert";
    public String appetizer = "Default Appetizer";

    public MealBuilder(String mainDish, String sideDish, String drink) {
        // Initialize MealBuilder components using the provided parameters.
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.drink = drink;
    }

    public MealBuilder setDessert(String dessert) {
        // Initialize the MealBuilder dessert field with the provided dessert parameter.
        this.dessert = dessert;
        
        return this;
    }

    public MealBuilder setAppetizer(String appetizer) {
        // Initialize the MealBuilder appetizer field with the provided dessert parameter.
        this.appetizer = appetizer;
        
        return this;
    }

    public Meal build() {
        // Write the return statement to complete the object construction process.
        return Meal.getInstance(this);
        
    }
}
