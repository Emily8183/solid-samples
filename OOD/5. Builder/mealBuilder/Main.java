import java.util.Scanner;

public class Main {

    // public void run() {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get full meal components from user
        System.out.println("whats your full Main Dish");
        String fullMainDish = sc.nextLine();
        
        System.out.println("whats your full Side Dish");
        String fullSideDish = sc.nextLine();
        
        System.out.println("whats your full Drink");
        String fullDrink = sc.nextLine();
        
        System.out.println("whats your full Dessert");
        String fullDessert = sc.nextLine();
        
        System.out.println("whats your full Appetizer");
        String fullAppetizer = sc.nextLine();
        
        // Construct a full meal using MealBuilder with the provided components.
        Meal full_meal = new MealBuilder(fullMainDish, fullSideDish, fullDrink)
                            .setDessert(fullDessert)
                            .setAppetizer(fullAppetizer)
                            .build();
        
                            
        System.out.println("Full Meal Summary:");
        
        // Print the summary of the constructed full meal.
        full_meal.printMealSummary();;

        // Get simple meal components from user
        System.out.println("whats your Simple Main Dish");
        String simpleMainDish = sc.nextLine();

        System.out.println("whats your Simple side Dish");
        String simpleSideDish = sc.nextLine();
        
        System.out.println("whats your Simple Drink");
        String simpleDrink = sc.nextLine();

        // Construct a simple meal using MealBuilder with the provided components.
        Meal simple_meal = new MealBuilder(simpleMainDish, simpleSideDish, simpleDrink)
                          .build();
              
        System.out.println("Simple Meal Summary:");
        
        // Print the summary of the constructed simple meal.
        simple_meal.printMealSummary();
        
        sc.close();
    }

}
