public class PizzaApp {
    public static void main(String[] args) {
        //basic pizza
        Pizza pizza = new BasicPizza();

        pizza = new CheeseDecorator(pizza);//把原来的pizza封装，加到CheeseDecorator
        pizza = new MushroomDecorator(pizza); //再次打包，加到MushroomDecorator

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        
    }
}
