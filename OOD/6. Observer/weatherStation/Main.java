public class Main {

    public static void main(String[] args) {
        WeatherStationIn weatherStationIn = new WeatherStationIn();

        Observer screenDisplay = new ScreenDisplay("ScreenDisplay");

        Observer mobileDisplay = new MobileDisplay("Mobile display");

        weatherStationIn.attach(screenDisplay);

        weatherStationIn.attach(mobileDisplay);

        weatherStationIn.setTemperature(25.9f);

        // weatherStationIn.notifyObservers(); this step is involved in the setTemperature method

        
    }
 
}
