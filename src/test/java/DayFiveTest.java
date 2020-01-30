import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class DayFiveTest {
    DayFive dayFive;

    @Before
    public void setUp() {
        dayFive = new DayFive();
    }

    @Test
    public void checksUpwardsInstruction() {
        dayFive.findTheVectors("U75,R83,R83,L12,R71,R7,L72");
        Assertions.assertThat(dayFive.verticalEnd).isEqualTo(75);
    }

    @Test
    public void checksDownwardsInstruction() {
        dayFive.findTheVectors("U75,D30");
        Assertions.assertThat(dayFive.verticalEnd).isEqualTo(45);
        Assertions.assertThat(dayFive.verticalStart).isEqualTo(75);
    }

    @Test
    public void checksLeftInstruction() {
        dayFive.findTheVectors("U75,D30,R83,L12,L2");
        Assertions.assertThat(dayFive.horizontalStart).isEqualTo(71);
        Assertions.assertThat(dayFive.horizontalEnd).isEqualTo(69);
        Assertions.assertThat(dayFive.verticalEnd).isEqualTo(45);
        Assertions.assertThat(dayFive.verticalStart).isEqualTo(45);
    }

    @Test
    public void checksRightInstruction() {
        dayFive.findTheVectors("R83,R5");
        Assertions.assertThat(dayFive.verticalEnd).isEqualTo(0);
        Assertions.assertThat(dayFive.verticalStart).isEqualTo(0);
        Assertions.assertThat(dayFive.horizontalStart).isEqualTo(83);
        Assertions.assertThat(dayFive.horizontalEnd).isEqualTo(88);
    }

    @Test
    public void comparesHorizontalVectorsTrue() {
        dayFive.findTheVectors("U75");
        int[] verticalArray = {-1, 1, 7, 7};
        int[] horizontalArray = {0, 75, 0, 0};
        Assertions.assertThat(dayFive.doesItCross(horizontalArray, verticalArray)).isEqualTo(true);
    }

    @Test
    public void comparesHorizontalVectorsFalse() {
        dayFive.findTheVectors("U75");
        int[] verticalArray = {1, 6, 7, 7};
        int[] horizontalArray = {0, 75, 0, 0};
        Assertions.assertThat(dayFive.doesItCross(horizontalArray, verticalArray)).isEqualTo(false);
    }

    @Test
    public void comparesVerticalVectorsTrue() {
        dayFive.findTheVectors("U75");
        int[] horizontalArray = {-1, 1, 7, 7};
        int[] verticalArray = {0, 75, 0, 0};
        Assertions.assertThat(dayFive.doesItCross(horizontalArray, verticalArray)).isEqualTo(true);
        if (dayFive.doesItCross(horizontalArray, verticalArray)) {
            dayFive.addCrossingWireDistancesToMap(horizontalArray, verticalArray);
        }
    }

    @Test
    public void comparesVerticalVectorsFalse() {
        dayFive.findTheVectors("U75");
        int[] horizontalArray = {0, 75, 0, 0};
        int[] verticalArray = {1, 6, 7, 7};
        Assertions.assertThat(dayFive.doesItCross(horizontalArray, verticalArray)).isEqualTo(false);
    }
}
