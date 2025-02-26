public class Main {

    public static void main(String[] args) {
        AppSettings appSettings1 = AppSettings.getInstance();

        AppSettings appSettings2 = AppSettings.getInstance();

        //same object (or same instance) in memory
        System.out.println(appSettings1 == appSettings2);
        
    }

}
