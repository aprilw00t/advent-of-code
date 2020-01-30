import java.util.Arrays;
import java.util.List;

public class DayThree {
    public List<String> opcodeProgram(String listOfCodes) {
        Integer numberToCheck = 0;
        List<String> listAfterApplyingCodes = Arrays.asList(listOfCodes.split(","));

        while (numberToCheck < listAfterApplyingCodes.size()) {
            if (listAfterApplyingCodes.get(numberToCheck).equals("99")) {
                return listAfterApplyingCodes;
            } else {
                if (listAfterApplyingCodes.get(numberToCheck).equals("1")) {
                    int position = Integer.valueOf(listAfterApplyingCodes.get(numberToCheck + 3));
                    Integer firstNumberToAdd = getNumberToAdd(numberToCheck, listAfterApplyingCodes, 1);
                    Integer secondNumberToAdd = getNumberToAdd(numberToCheck, listAfterApplyingCodes, 2);
                    String numberToAdd = String.valueOf(firstNumberToAdd + secondNumberToAdd);

                    listAfterApplyingCodes.set(position, numberToAdd);
                } else {
                    if (listAfterApplyingCodes.get(numberToCheck).equals("2")) {
                        int position = Integer.valueOf(listAfterApplyingCodes.get(numberToCheck + 3));
                        Integer firstNumberToAdd = getNumberToAdd(numberToCheck, listAfterApplyingCodes, 1);
                        Integer secondNumberToAdd = getNumberToAdd(numberToCheck, listAfterApplyingCodes, 2);
                        String numberToAdd = String.valueOf(firstNumberToAdd * secondNumberToAdd);

                        listAfterApplyingCodes.set(position, numberToAdd);
                    }
                }


            }
            numberToCheck = numberToCheck + 4;

        }

        return listAfterApplyingCodes;

    }

    private Integer getNumberToAdd(Integer numberToCheck, List<String> listAfterApplyingCodes, int i) {
        return Integer.valueOf(listAfterApplyingCodes.get(Integer.valueOf(listAfterApplyingCodes.get(numberToCheck + i))));
    }
}
