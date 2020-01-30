import java.util.Arrays;
import java.util.List;

public class DayTwo {
    public int getFuel(String fuels, int totalFuel) {

        List<String> listOfFuels = Arrays.asList(fuels.split("\n"));
        for (String fuel :
                listOfFuels) {
            int addedFuel = 0;
            addedFuel += (int) (Math.floor(Integer.valueOf(fuel.replace("\n", "")) / 3) - 2);
            totalFuel += (int) (Math.floor(Integer.valueOf(fuel.replace("\n", "")) / 3) - 2);

            if ((addedFuel / 3) - 2 > 0) {
                return getFuel(String.valueOf(addedFuel), totalFuel);
            }

        }
        return totalFuel;
    }
}
