import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ru.yandex.Calculate;

public class CalculateTest {

    @ParameterizedTest
    @CsvSource({
        "1,1",
        "0,0",
        "10,1",
        "12,3",
        "101,2",
        "123,6",
        "1010,2",
        "1111111,7",
        "9999999,9"
    })
    public void CalculateTest(Long number, Long expected ){
        Assertions.assertEquals(Calculate.calculate(number),expected);
    }
}
