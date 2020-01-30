import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DayOneTest {
    DayOne dayOne;

    @Before
    public void setUp() {
        dayOne = new DayOne();
    }

    @Test
    public void givenOneNumber_factorOfThree_CalculatesFuel() {
        Assertions.assertThat(dayOne.getFuel("9")).isEqualTo(1.0);
    }

    @Test
    public void givenOneNumber_nonFactorOfThree_CalculatesFuel() {
        Assertions.assertThat(dayOne.getFuel("13")).isEqualTo(2.0);
    }

    @Test
    public void givenMoreThanOneNumber_CalculatesFuel() {
        Assertions.assertThat(dayOne.getFuel("9\n9")).isEqualTo(2.0);

    }

    @Test
    public void givenMoreThanOneBiggerNumber_CalculatesFuel() {

        Assertions.assertThat(dayOne.getFuel("9\n9\n99")).isEqualTo(33.0);

    }
}
