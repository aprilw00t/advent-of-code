import java.util.Arrays;
import java.util.List;

public class DayTwo {
    //can we remove this state?
    int totalFuel =0;

    //choice of parameter type?
    public int getFuel(String fuels) {

        List<String> listOfFuels = Arrays.asList(fuels.split("\n"));
        for (String fuel:
                listOfFuels) {
            int addedFuel =0;
            //interesting typing as before plus duplication
            addedFuel+=(int)(Math.floor(Integer.valueOf(fuel.replace("\n", ""))/3)-2);
            totalFuel += (int)(Math.floor(Integer.valueOf(fuel.replace("\n", ""))/3)-2);
            if((addedFuel/3)-2>0){
                getFuel(String.valueOf(addedFuel));
            }
        }

        //indentation
            return totalFuel;
    }
}
