import java.util.ArrayList;

public class ValueKeeper {
    private ArrayList<Integer> values = new ArrayList<>();

    // Method to add values to the list
    public void addValue(int value) {
        values.add(value);
    }

    // Method to get values from the list
    public ArrayList<Integer> getValues() {
        return values;
    }

    public static void main(String[] args) {
        ValueKeeper keeper = new ValueKeeper();

        // Adding values to the keeper
        keeper.addValue(10);
        keeper.addValue(20);
        keeper.addValue(30);

        // Getting values from the keeper
        ArrayList<Integer> retrievedValues = keeper.getValues();

        // Displaying retrieved values
        System.out.println("Retrieved Values:");
        for (int value : retrievedValues) {
            System.out.println(value);
        }
    }
}
