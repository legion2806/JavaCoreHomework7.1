import org.junit.Assert;
import org.junit.Test;

public class mainTest extends Main{

    @Test
    public void testConcat2_validArgument_success() {

        // given:
        final int original = 10;
        final String expected = "Четное число";

        // when:
        final String result = concat2(original);

        // then:
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testConcat1_validArgument_success() {

        // given:
        final int original = 2000;
        final String expected = "Количество дней 366";

        // when:
        final String result = concat1(original);

        // then:
        Assert.assertEquals(expected, result);
    }


    @Test
    public void testConcat_validArgument_success() {

        // given:
        final int expected = 3;

        // when:
        final int result = concat(expected);

        // then:
        Assert.assertEquals(expected, result);
    }

}
