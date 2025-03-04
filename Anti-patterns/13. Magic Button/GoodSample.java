import java.util.Scanner;

public class GoodSample {
    public class Validator {
        public boolean validateInput(String input) {
            return input != null && !input.trim().isEmpty();
        }
    }

    
    public class DataProcessor {
        public String process(String validatedString) {
            return validatedString + " is processed";
        }
    }

    public class DataSavingService {
        public void dataSaving(String processedData) {
            System.out.println("Saving to database...");
            // Fake database interaction
            System.out.println("Data saved: " + processedData);
        }
    }

    public class UIUpdator {
        public void updateUI(String message) {
            System.out.println("Updating UI...");
            System.out.println(message);
        }
    }

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("input your string");

            String text = input.nextLine();

            Validator validator = new Validator();
            DataProcessor dataProcessor = new DataProcessor();
            DataSavingService dataSavingService = new DataSavingService();
            UIUpdator uiUpdater = new UIUpdator();

            if (!validator.validateInput(text)) {
                uiUpdater.updateUI("Invalid input! Please try again.");
                return;
            }
            
            String processedData = dataProcessor.process(text);
            dataSavingService.dataSaving(processedData);
            uiUpdater.updateUI("Form succesfully submitted");
            
        }
    }

}

//Stateless classes, no need to have explicit constructor
//all the functioanlities are separated, single responsibility principle

