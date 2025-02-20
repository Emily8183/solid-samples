class OrderService {
    private Database db = new Database();
    private EmailServer emailServer = new EmailServer();
    
    void processOrder() {
        db.save();
        emailServer.send();
    }
}
