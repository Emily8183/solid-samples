//a bad sample showing button click event does everything—validates input, processes data, interacts with the database, and updates the UI.

public class BadSample {
    // Step 1: Input Validator
class FormValidator {
    public boolean validate(String input) {
        System.out.println("Validating input...");
        return input != null && !input.trim().isEmpty();
    }
}

// Step 2: Form Processor
class FormProcessor {
    public String process(String input) {
        System.out.println("Processing data...");
        return "Processed: " + input;
    }
}

// Step 3: Database Handler
class DatabaseService {
    public void save(String data) {
        System.out.println("Saving to database...");
        System.out.println("Data saved: " + data);
    }
}

// Step 4: UI Handler
class UIUpdater {
    public void updateUI(String message) {
        System.out.println("Updating UI...");
        System.out.println(message);
    }
}

// Step 5: Button Click Event (Main Logic)
public class StructuredButtonExample {
    public static void main(String[] args) {
        System.out.println("Click the Submit button to process the form:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        FormValidator validator = new FormValidator();
        FormProcessor processor = new FormProcessor();
        DatabaseService database = new DatabaseService();
        UIUpdater uiUpdater = new UIUpdater();

        if (!validator.validate(userInput)) {
            uiUpdater.updateUI("Invalid input! Please try again.");
            return;
        }

        String processedData = processor.process(userInput);
        database.save(processedData);
        uiUpdater.updateUI("Form successfully submitted!");
    }
}

    
}
