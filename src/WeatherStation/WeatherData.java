package WeatherStation;

import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.ArrayList;

public class WeatherData implements ObservableValue<WeatherDataValues> {

    private final ArrayList<ChangeListener<? super WeatherDataValues>> observers;
    private WeatherDataValues latestData;

    public WeatherData() {
        observers = new ArrayList<>();
        latestData = new WeatherDataValues(0,0,0);
    }

    @Override
    public void addListener(ChangeListener<? super WeatherDataValues> listener) {
        observers.add(listener);
    }

    @Override
    public void removeListener(ChangeListener<? super WeatherDataValues> listener) {
        observers.remove(listener);
    }

    @Override
    public WeatherDataValues getValue() {
        return latestData;
    }

    @Override
    public void addListener(InvalidationListener listener) {
    }

    @Override
    public void removeListener(InvalidationListener listener) {
    }

    public void setData(float temperature, float humidity, float pressure){
        WeatherDataValues oldData = latestData;
        latestData = new WeatherDataValues(temperature,humidity,pressure);
        updateListeners(oldData, latestData);
    }

    private void updateListeners(WeatherDataValues oldData, WeatherDataValues newData){
        for (ChangeListener<? super WeatherDataValues> listener : observers) {
            listener.changed(this, oldData, newData);

        }
    }
}
