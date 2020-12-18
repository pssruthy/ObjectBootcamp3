package measurment.temperature;

import measurment.ComparisonResult;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureTest {
    
    @Test
    public void shouldCompareGivenTemperatureInCelsiusAndFahrenheitAreEqual() {
        Temperature celsius = new Temperature(100,TemperatureUnit.CELSIUS);
        Temperature fahrenheit = new Temperature(212,TemperatureUnit.FAHRENHEIT);
        Assert.assertEquals(ComparisonResult.EQUAL, celsius.compareTo(fahrenheit));
    }
    
    @Test
    public void shouldCompareGivenTemperatureInCelsiusIsGreaterThanFahrenheit() {
        Temperature celsius = new Temperature(200,TemperatureUnit.CELSIUS);
        Temperature fahrenheit = new Temperature(100,TemperatureUnit.FAHRENHEIT);
        assertEquals(ComparisonResult.GREATER, celsius.compareTo(fahrenheit));
    }
    
    @Test
    public void shouldCompareGivenTemperatureInCelsiusIsLesserThanFahrenheit() {
        Temperature celsius = new Temperature(1,TemperatureUnit.CELSIUS);
        Temperature fahrenheit = new Temperature(212,TemperatureUnit.FAHRENHEIT);
        assertEquals(ComparisonResult.LESSER, celsius.compareTo(fahrenheit));
    }
}
