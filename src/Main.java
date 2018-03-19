import Interfaces.IOutputString;
import StarBuzz.Condiments.Mocha;
import StarBuzz.Condiments.Soy;
import StarBuzz.Condiments.Whip;
import StarBuzz.Drinks.DarkRoast;
import StarBuzz.Drinks.Espresso;
import StarBuzz.Drinks.HouseBlend;
import StarBuzz.IBeverage;
import StarBuzz.PrintBeverage;
import Tools.ConsoleOutput;

public class Main {
    public static void main(String[] args){
        IOutputString output = new ConsoleOutput();

        ///////////////////////
        // Decorator pattern //
        ///////////////////////
        PrintBeverage print = new PrintBeverage(output);
        IBeverage espresso = new Espresso();
        print.Out(espresso);

        IBeverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        print.Out(darkRoast);

        IBeverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        print.Out(houseBlend);

        //////////////////////
        // Strategy Pattern //
        //////////////////////
//        Duck duck = new RubberDuck(output);
//
//        duck.performFly();
//        duck.performQuack();
//
//        duck.setFlyBehavior(new FlyWithTurboJetEngine(output));
//        duck.performFly();

        //////////////////////
        // Observer pattern //
        //////////////////////
//        WeatherData weatherData = new WeatherData();
//        CurrentWeather currentWeather = new CurrentWeather(output);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(output);
//
//        weatherData.addListener(currentWeather);
//        weatherData.addListener(statisticsDisplay);
//
//        weatherData.setData(80.0f, 65f, 30.4f);
//        weatherData.setData(82.0f, 70f, 29.2f);
//        weatherData.setData(78.0f, 90f, 29.2f);
    }
}
