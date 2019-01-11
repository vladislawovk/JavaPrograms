public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){
        value1 = (int)(value1 * 1000); //невозможно произвести вычисление, пока переменная не будет приведена к int
        value2 = (int)(value2 * 1000);

        return(value1 == value2);
    }
}
