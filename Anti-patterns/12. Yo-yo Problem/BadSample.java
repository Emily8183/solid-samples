public class BadSample {
    
    class Employee {
        void work() { System.out.println("Employee is working"); }
    }
    
    class Manager extends Employee {
        @Override void work() { 
            super.work();
            System.out.println("Manager is managing"); 
        }
    }
    
    class SeniorManager extends Manager {
        @Override void work() { 
            super.work();
            System.out.println("Senior Manager is strategizing"); 
        }
    }
    
    class Director extends SeniorManager {
        @Override void work() { 
            super.work();
            System.out.println("Director is making decisions"); 
        }
    }
    
    public class YoYoEmployeeExample {
        public static void main(String[] args) {
            Director director = new Director();
            director.work();
        }
    }


}
