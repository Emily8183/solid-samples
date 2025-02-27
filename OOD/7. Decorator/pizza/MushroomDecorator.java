public class MushroomDecorator extends PizzaDecorator{ 

    public MushroomDecorator (Pizza pizza) { //面向接口编程（Programming to an Interface）,传入Pizza(接口），任何 Pizza 的实现都能被装饰
        super(pizza);
    }

    @Override
        public String getDescription() {
            return super.getDescription() + " mushroom ";
        }

        @Override
        public double getCost() {
            return super.getCost() + 2;
        }


}