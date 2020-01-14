import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DayTwoTest {
    DayTwo dayTwo;
    @Before
    public void setUp(){
        dayTwo = new DayTwo();
    }
    @Test
    public void givenMoreThanOneBiggerNumber_withFactorsOfThree_CalculatesFuel(){

        Assertions.assertThat(dayTwo.getFuel("9\n9\n99")).isEqualTo(41);

    }
    @Test
    public void givenMoreThanOneBiggerNumber_withNonFactorOfThree_CalculatesFuel(){
        Assertions.assertThat(dayTwo.getFuel("400")).isEqualTo(184);

    }
    @Test
    public void givenMoreThanOneBiggerNumber_withMultipleNumbers_CalculatesFuel(){
        Assertions.assertThat(dayTwo.getFuel("9\n9\n9\n9\n9\n9\n9\n9\n9\n9")).isEqualTo(10);

    }

}
