abstract class PizzaDecorator implements Pizza{
    protected Pizza decoratedPizza; //字类可以直接访问

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription(); //将请求转发给内部的对象（被装饰的对象）
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }

}
