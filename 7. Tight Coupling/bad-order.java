// BAD

class OrderService {
    private MySqlOrderRepository repository = new MySqlOrderRepository();
    private SmtpEmailService emailService = new SmtpEmailService();
}
