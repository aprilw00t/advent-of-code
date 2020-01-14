import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayFour {
    public String findInputs(Integer total, String listOfCodes) {
        List<String> codesList = Arrays.asList(listOfCodes.split(","));
String toCheck;
        String result = "";
        ArrayList<String> replacementNumbers = new ArrayList<>();
        DayThree dayThree = new DayThree();
        for (int noun = 12; noun < 100; noun++) {

            for (int verb = 0; verb < 100; verb++) {
                codesList.set(1, String.valueOf(noun));
                codesList.set(2, String.valueOf(verb));
                toCheck = dayThree.opcodeProgram(codesList.toString().replace(" ", "").replaceAll("\\[", "").replace("]", "")).get(0);
          if(toCheck.equals(total.toString())){
              return String.valueOf((noun*100) + verb);
          }
            }
        }
return result;
    }
}
