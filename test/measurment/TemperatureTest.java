package measurment;

import measurment.unit.TemperatureUnit;
import org.junit.Test;

public class TemperatureTest {
    @Test
    public void shouldCompareGivenTemperaturesInFahrenheitGreaterThanCelsius() {
        new Temperature(100, TemperatureUnit.CELSIUS);
    }
}
