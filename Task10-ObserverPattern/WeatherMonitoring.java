import java.util.ArrayList;
import java.util.List;

// Subject interface
interface WeatherSensor {
    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}

// Concrete Subject
class TemperatureSensor implements WeatherSensor {
    private double temperature;
    private List<WeatherObserver> observers = new ArrayList<>();

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }
}

// Observer interface
interface WeatherObserver {
    void update(double temperature);
}

// Concrete Observer
class WeatherDisplay implements WeatherObserver {
    private String name;

    public WeatherDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(double temperature) {
        System.out.println(name + " - Temperature is now: " + temperature);
    }
}

public class WeatherMonitoring {
    public static void main(String[] args) {
        // Create the subject (Temperature Sensor)
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Create some observers (Weather Displays)
        WeatherObserver display1 = new WeatherDisplay("Display 1");
        WeatherObserver display2 = new WeatherDisplay("Display 2");

        // Register observers with the temperature sensor
        temperatureSensor.registerObserver(display1);
        temperatureSensor.registerObserver(display2);

        // Update the temperature, which will notify the observers
        temperatureSensor.setTemperature(25.5);
        temperatureSensor.setTemperature(28.0);

        // Remove an observer
        temperatureSensor.removeObserver(display1);

        // Update the temperature again
        temperatureSensor.setTemperature(30.2);
    }
}
