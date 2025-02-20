**GOOD**
1) Split large classes into smaller, more cohesive classes
2) Apply the Single Responsibility Principle (SRP)

@Service
class OrderProcessor {
    private OrderValidator validator;
    private OrderCalculator calculator;
   	private OrderRepository repository;
    private NotificationService notifier;
    private PaymentService payments;
  
    @Autowired //autowired the repository，Spring 4.3+ 后，只有一个构造函数时，没有 @Autowired 也可以
  	public OrderProcessor(OrderValidator validator, OrderCalculator calculator,
                          OrderRepository repository, OrderNotifier notifier, PaymentService payments) {
        this.validator = validator;
        this.calculator = calculator;
        this.repository = repository;
        this.notifier = notifier;
       	this.payments = payments;
    }
  
    public void processOrder(Order order) { //method，因此要用动词
    		validator.validate(order);
        double total = calculator.calculateTotal(order); // 计算总价 & 折扣
        repository.save(order);      // 保存订单到数据库
        notifier.notifyCustomer(order); // 发送通知
    		payment.processPayment(order);
    }
}
  
//OrderValidator class
@Service
public class OrderValidator {
    public void validate(Order order) {
        if (order.getCustomer() == null) throw new IllegalArgumentException("Customer is required");
        if (!order.getCustomer().isActive()) throw new IllegalStateException("Customer is not active");
    }
}

//OrderCalculator class
@Service
public class OrderCalculator {
    public double calculateTotal(Order order) {
        double total = order.getItems().stream()
                           .mapToDouble(item -> item.getPrice() * item.getQuantity())
                           .sum();

        if (total > 100) {
            total *= 0.9; // 10% 折扣
        }

        return total;
    }
}

//OrderRepository
import org.springframework.data.jpa.repository.JpaRepository;

@Repository 
<!-- this annotation can be removed -->

public interface OrderRepository extends JpaRepository<Order, Long>  { 
<!-- 分页（pagination）、排序（sorting）、批量操作（batch processing），就用 JpaRepository -->
}

//NotificationService class
@Service
public class NotificationService {
    public void notifyCustomer(Order order) {
        System.out.println("Sending email notification for order: " + order);
    }
}

//PaymentService class
@Service
public class PaymentService {
    public void processPayment(Order order) {
        System.out.println("payment has done");
    }
}