public class CheeseDecorator extends PizzaDecorator{ 

    public CheeseDecorator (Pizza pizza) { //面向接口编程（Programming to an Interface）,传入Pizza(接口），任何 Pizza 的实现都能被装饰
        super(pizza);
    }

    @Override
        public String getDescription() {
            return super.getDescription() + " cheese";
        }

        @Override
        public double getCost() {
            return super.getCost() + 1;
        }


}
