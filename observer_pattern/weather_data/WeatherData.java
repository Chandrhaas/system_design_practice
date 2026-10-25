package observer_pattern.weather_data;
import java.util.*;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature, humidity, pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();

    }

    public void registerObserver(Observer o){
        observers.add(o);
    }
    
    public void unregisterObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObserver()
    {
        for(Observer observer : observers ){
            observer.update();
        }
    }
    public void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

    public float getTemperature(){
        return this.temperature;
    }
    public float getPressure(){
        return this.pressure;
    }
    public float getHumidity(){
        return this.humidity;
    }
}
