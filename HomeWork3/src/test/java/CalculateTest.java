import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ru.yandex.Calculate;

public class CalculateTest {

    @ParameterizedTest
    @CsvSource({
        "1,1",
        "12,3",
        "9999999,9",
        "0,0",
        "123,6",
        "1111111,7"
    })
    public void CalculateTest(Long number, Long expected ){
        Assertions.assertEquals(Calculate.calculate(number),expected);
    }
}
