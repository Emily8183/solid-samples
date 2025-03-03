// Composition Instead of Deep Inheritance

public class GoodSample {

    interface WorkStrategy {
        void work();
    }
    
    class BasicWork implements WorkStrategy {
        @Override public void work() { System.out.println("Employee is working"); }
    }
    
    class ManagementWork implements WorkStrategy {
        @Override public void work() { System.out.println("Manager is managing"); }
    }
    
    class StrategyWork implements WorkStrategy {
        @Override public void work() { System.out.println("Senior Manager is strategizing"); }
    }
    
    class DecisionMakingWork implements WorkStrategy {
        @Override public void work() { System.out.println("Director is making decisions"); }
    }
    
    public class Employee {
        private WorkStrategy workStrategy;

        public Employee(WorkStrategy workStrategy) {
            this.workStrategy = workStrategy;
        }

        public void perform() {
            workStrategy.work();
        }
    }

    public class main {
        public static void main(String[] args) {
            WorkStrategy decisionMakingWork = new DecisionMakingWork();
            Employee director = new Employee(decisionMakingWork);

            director.perform();
        }
    }
    
    
}
