public interface Employee {
    double REGULAR_RATE = 10.0; //double蕞长15位, 常量变量名一般都用大写
    double calculateEmployeeIncome(int workingHours);
}

public class PermanentEmployee implements Employee {

    @Override
    public double calculateEmployeeIncome(int workingHours) {
        return workingHours * Employee.REGULAR_RATE;
    }
}

public class Contractor implements Employee {
    
    private static final double BONUS_RATE = 1.2;

    @Override
    public double calculateEmployeeIncome(int workingHours) {
        return workingHours * Employee.REGULAR_RATE * BONUS_RATE;
    }
}

public class Intern implements Employee {
    
    private static final double DEPRECIATION_RATE = 0.8;

    @Override
    public double calculateEmployeeIncome(int workingHours) {
        return workingHours * Employee.REGULAR_RATE * DEPRECIATION_RATE;
    }
}

public class Main {

    public static void main(String[] args) {
        int hours = 10;

        Employee permanentEmployee = new PermanentEmployee();
    
        Employee contractor = new Contractor();
    
        Employee intern = new Intern();
    
        System.out.println("The permanent employees' income is " + permanentEmployee.calculateEmployeeIncome(hours));
        System.out.println("The contractors' income is " + contractor.calculateEmployeeIncome(hours));
        System.out.println("The interns' income is " + intern.calculateEmployeeIncome(hours));
    }   
}




