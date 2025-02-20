class OrderService{
    private OrderRepository repository;
    private EmailService emailService;

    public OrderService(OrderRepository repository,EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }
}

// @Repository 
public interface OrderRepository extends JpaRepository<Order, Long> {
}

// @Service
public class SmtpEmailService implements EmailService {
    // Implementation here
}


