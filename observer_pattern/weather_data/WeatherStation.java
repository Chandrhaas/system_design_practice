package observer_pattern.weather_data;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherdata = new WeatherData(); //object of the subject which is common to observers

        CurrentConditions current = new CurrentConditions(weatherdata);

        weatherdata.setMeasurements(30, 50, 100);
        weatherdata.setMeasurements(40, 40, 100);
    }
}
