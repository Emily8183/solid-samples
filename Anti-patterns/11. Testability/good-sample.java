class OrderService {
    private DatabaseInterface db;
    private EmailInterface emailServer;
    
    OrderService(DatabaseInterface db, EmailInterface emailServer) {
        this.db = db;
        this.emailServer = emailServer;
    }
    
    void processOrder() {
        db.save();
        emailServer.send();
    }
}

//similiar to No.7 Tight Coupling
