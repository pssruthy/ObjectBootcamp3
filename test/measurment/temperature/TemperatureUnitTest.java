package measurment.temperature;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureUnitTest {
    
    @Test
    public void shouldConvertTheGivenTemperatureInToBaseUnit() {
        assertEquals(100,TemperatureUnit.FAHRENHEIT.convertToBase(212),0);
    }
}