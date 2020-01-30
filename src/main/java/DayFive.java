
import java.util.ArrayList;

public class DayFive {
    ArrayList<int[]> horizontalMinMax = new ArrayList<>();
    ArrayList<int[]> verticalMinMax = new ArrayList<>();
    ArrayList<Integer> arrayOfDistances = new ArrayList<>();
    Integer horizontalStart = 0;
    Integer horizontalEnd = 0;
    Integer verticalStart = 0;
    Integer verticalEnd = 0;

    void findTheVectors(String Coords) {


        for (String instruction : Coords.split(",")
        ) {
            verticalStart = verticalEnd;
            horizontalStart = horizontalEnd;

            if (instruction.contains("U")) {
                verticalEnd += convertToInteger(instruction, "U");
                int[] arrayToAdd = {verticalStart, verticalEnd, horizontalStart, horizontalEnd};
                addToCorrectArray(arrayToAdd, verticalMinMax);

            } else if (instruction.contains("D")) {
                verticalEnd -= convertToInteger(instruction, "D");
                int[] arrayToAdd = {verticalStart, verticalEnd, horizontalStart, horizontalEnd};
                addToCorrectArray(arrayToAdd, verticalMinMax);

            } else if (instruction.contains("L")) {
                horizontalEnd -= convertToInteger(instruction, "L");
                int[] arrayToAdd = {horizontalStart, horizontalEnd, verticalStart, verticalEnd};
                addToCorrectArray(arrayToAdd, horizontalMinMax);

            } else if (instruction.contains("R")) {
                horizontalEnd += convertToInteger(instruction, "R");
                int[] arrayToAdd = {horizontalStart, horizontalEnd, verticalStart, verticalEnd};
                addToCorrectArray(arrayToAdd, horizontalMinMax);

            }

            System.out.println(horizontalStart + " " + horizontalEnd + "," + verticalStart + " " + verticalEnd);
        }
    }


    private void addToCorrectArray(int[] arrayToAdd, ArrayList<int[]> correctArray) {
        correctArray.add(arrayToAdd);
    }


    private Integer convertToInteger(String instruction, String l) {
        return Integer.valueOf(instruction.replaceAll("[^0-9.]", ""));
    }


    public boolean doesItCross(int[] vectorArrayToCheck, int[] vectorArrayToCheckFromList) {
        int m = (vectorArrayToCheckFromList[0] + vectorArrayToCheckFromList[1]) / 2;
        int n = (vectorArrayToCheck[0] + vectorArrayToCheck[1]) / 2;
        if ((Math.abs(vectorArrayToCheck[3] - m) <= (Math.abs(vectorArrayToCheckFromList[0] - m))) && (Math.abs(vectorArrayToCheckFromList[3] - n) <= (Math.abs(vectorArrayToCheck[0] - n)))) {
            return true;
        } else {
            return false;
        }
    }

    //if(doesItCross){}
    public void addCrossingWireDistancesToMap(int[] vectorArrayToCheck, int[] vectorArrayToCheckFromList) {
        arrayOfDistances.add(vectorArrayToCheck[3] + vectorArrayToCheckFromList[3]);
        System.out.println(arrayOfDistances.toString());
    }
}
