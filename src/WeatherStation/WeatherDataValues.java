package WeatherStation;

public class WeatherDataValues {
    private float Temperature;

    private float Humidity;

    private float Pressure;

    public WeatherDataValues(float temperature, float humidity, float pressure) {
        Temperature = temperature;
        Humidity = humidity;
        Pressure = pressure;
    }

    public float getPressure() {
        return Pressure;
    }

    public float getHumidity() {
        return Humidity;
    }

    public float getTemperature() {
        return Temperature;
    }
}
