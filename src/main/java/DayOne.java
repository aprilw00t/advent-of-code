public class DayOne {
    Double totalFuel = 0.0;

    public Double getFuel(String fuels) {
        String[] listOfFuels = (fuels.split("\n"));
        for (String fuel :
                listOfFuels) {
            totalFuel += (Integer.parseInt(fuel.replace("\n", "")) / 3) - 2;
            System.out.println(totalFuel);
        }
        return totalFuel;
    }
}
