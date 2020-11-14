import org.junit.Assert;
import org.junit.Test;

public class Main {

    public int concat(int a){

        if(a>2)
            System.out.println(a);

        return a;

    }

    public String concat1(int year){

        String days;

        if (year % 400 == 0) {
            System.out.println("Количество дней 366");
            days = "Количество дней 366";
        }
        else if ( year % 100 == 0) {
            System.out.println("Количество дней 365");
            days = "Количество дней 365";
        }
        else if (year % 4 == 0){
            System.out.println("Количество дней 366");
            days = "Количество дней 366";
        }
        else {
            System.out.println("Количество дней 365");
            days = "Количество дней 365";
        }
        return days;
    }

    public String concat2(int a){

        String b;

        if(a % 2 == 0)
            b = "Четное число";

        else
            b = "Не Четное число";

        return b;
    }

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
