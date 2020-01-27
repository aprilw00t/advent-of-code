import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayThree {
    public    List<String>  opcodeProgram(String listOfCodes) {
        //name?
        Integer numberToCheck = 0;
        //Choice of list type?
        List<String> resultList = Arrays.asList(listOfCodes.split(","));

       while(numberToCheck<resultList.size()){
        if(resultList.get(numberToCheck).equals("99")){
            return resultList;
        }
        else{
            if(resultList.get(numberToCheck).equals("1"))
            {
                //valueOf vs parse plus duplication
               int position = Integer.valueOf(resultList.get(numberToCheck+3));
               Integer firstNumberToAdd = Integer.valueOf(resultList.get(Integer.valueOf(resultList.get(numberToCheck+1))));
                Integer secondNumberToAdd = Integer.valueOf(resultList.get(Integer.valueOf(resultList.get(numberToCheck+2))));
                String numberToAdd = String.valueOf(firstNumberToAdd+secondNumberToAdd);

                resultList.set(position, numberToAdd);
            }
            else{
                //ever false?
                if(resultList.get(numberToCheck).equals("2"))
                {
                    int position = Integer.valueOf(resultList.get(numberToCheck+3));
                    //naming
                    Integer firstNumberToAdd = Integer.valueOf(resultList.get(Integer.valueOf(resultList.get(numberToCheck+1))));
                    Integer secondNumberToAdd = Integer.valueOf(resultList.get(Integer.valueOf(resultList.get(numberToCheck+2))));
                    String numberToAdd = String.valueOf(firstNumberToAdd*secondNumberToAdd);

                    resultList.set(position, numberToAdd);
                }
            }

        //indentation
        }
           numberToCheck = numberToCheck + 4;

       }

        return resultList;

    }}
