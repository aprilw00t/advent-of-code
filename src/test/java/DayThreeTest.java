import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DayThreeTest {
    DayThree dayThree;

    @Before
    public void setUp() {
        dayThree = new DayThree();
    }

    @Test
    public void opCode99Without4NsDoesntImmediatelyHaltsProgram() {
        Assertions.assertThat(dayThree.opcodeProgram("99")).contains("99");
    }

    @Test
    public void opCode1AddsPostion1And2Together() {
        Assertions.assertThat(dayThree.opcodeProgram("1,2,3,3")).contains("1", "2", "3", "6");
    }

    @Test
    public void opCode2MultipliesPostion1And2Together() {
        Assertions.assertThat(dayThree.opcodeProgram("2,2,3,3")).contains("2", "2", "3", "9");
    }

    @Test
    public void opCode99ImmediatelyHaltsProgramWithMoreThan4Numbers() {
        Assertions.assertThat(dayThree.opcodeProgram("2,4,4,5,99,0")).contains("2", "4", "4", "5", "99", "9801");
    }

    @Test
    public void opCode99ImmediatelyHaltsProgramWithMoreThan4Ns() {
        Assertions.assertThat(dayThree.opcodeProgram("1,0,0,0,99")).contains("2", "0", "0", "0", "99");

    }

}
