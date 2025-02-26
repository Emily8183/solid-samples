public class Main {

    public static void main(String[] args) {
        WeatherStationIn weatherStationIn = new WeatherStationIn();

        ScreenDisplay screenDisplay = new ScreenDisplay("ScreenDisplay");

        MobileDisplay mobileDisplay = new MobileDisplay("Mobile display");

        weatherStationIn.attach(screenDisplay);

        weatherStationIn.attach(mobileDisplay);

        weatherStationIn.setTemperature(25.9f);

        
    }
 
}
