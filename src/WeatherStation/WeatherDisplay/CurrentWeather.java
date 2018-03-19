package WeatherStation.WeatherDisplay;

import Interfaces.IOutputString;
import WeatherStation.WeatherDataValues;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class CurrentWeather implements ChangeListener<WeatherDataValues> {
    private final IOutputString output;
    private float humidity;
    private float temperature;

    public CurrentWeather(IOutputString output) {
        this.output = output;
    }

    @Override
    public void changed(ObservableValue<? extends WeatherDataValues> observable, WeatherDataValues oldValue, WeatherDataValues newValue) {
        temperature = newValue.getTemperature();
        humidity = newValue.getHumidity();

        Display();
    }

    private void Display(){
        String outputLine = "Current conditions: " + temperature + "F degrees and " +
                humidity + "% humidity.";
        output.Out(outputLine);
    }
}
