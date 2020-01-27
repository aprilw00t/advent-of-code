import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayOne {
    Double totalFuel =0.0;
    public Double getFuel(String fuels) {
        //could just use array
        List<String> listOfFuels = Arrays.asList(fuels.split("\n"));
        for (String fuel:
             listOfFuels) {
            //redundant floor valueOf
            totalFuel += Math.floor(Integer.valueOf(fuel.replace("\n", ""))/3)-2;
            System.out.println(totalFuel);
        }
        return totalFuel;
    }
}
