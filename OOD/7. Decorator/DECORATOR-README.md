1/ 需要abstract class Decoration  
  
2/ Pizza pizza = new Pizza();  //这是不对的，因为Pizza 是一个接口（interface）或抽象类，它不能被直接实例化。  
  
因此，我们需要Class BasicPizza (具体的Pizza实现类)  

3/ BasicPizza pizza = new BasicPizza()也不对，因为：  
public CheeseDecorator(Pizza pizza) { super(pizza); }  
指定了 pizza 变量必须是 Pizza，无法存储 CheeseDecorator。