package WeatherStation.WeatherDisplay;

import Interfaces.IOutputString;
import WeatherStation.WeatherDataValues;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class StatisticsDisplay implements ChangeListener<WeatherDataValues> {
    private final IOutputString output;
    private float sum;
    private int count;

    private float minimum;
    private float maximum;
    private float average;

    public StatisticsDisplay(IOutputString output) {
        this.output = output;
    }

    @Override
    public void changed(ObservableValue<? extends WeatherDataValues> observable, WeatherDataValues oldValue, WeatherDataValues newValue) {
        float newTemperature = newValue.getTemperature();
        if (count == 0){
            minimum = newTemperature;
            maximum = newTemperature;
        }

        sum += newTemperature;
        count ++;

        average = sum / count;

        if (newTemperature < minimum){
            minimum = newTemperature;
        }
        if (maximum < newTemperature){
            maximum = newTemperature;
        }

        display();
    }

    private void display() {
        String outputString = "Avg/Min/Max temperature: "
                            + average + ", "
                            + minimum + ", "
                            + maximum;
        output.Out(outputString);
    }
}
