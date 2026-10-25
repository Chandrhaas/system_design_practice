package observer_pattern.weather_data;

public class CurrentConditions  implements  DisplayElement,Observer{

    private float temperature, humidity, pressure;
    private WeatherData weatherdata;

    public CurrentConditions(WeatherData weatherdata){
        this.weatherdata = weatherdata;
        weatherdata.registerObserver(this);
    }

    public void update(){
        this.temperature = weatherdata.getTemperature();
        this.pressure = weatherdata.getPressure();
        this.humidity = weatherdata.getHumidity();
        display();
    }

    public void display(){
        System.out.println("Current conditions: "+ temperature + "degrees and humidity = " +humidity);
    }

}
