import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debts;

    // Constructor to create a new IOU
    public IOU() {
        this.debts = new HashMap<>();
    }

    // Method to save the amount owed and the person owed to the IOU
    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount);
    }

    // Method to return the amount owed to the person whose name is given as a parameter
    public double howMuchDoIOweTo(String toWhom) {
        return this.debts.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        // Testing the IOU class
        IOU myIOU = new IOU();
        myIOU.setSum("Arthur", 50.5);
        myIOU.setSum("Michael", 30.0);

        System.out.println("How much do I owe to Arthur? " + myIOU.howMuchDoIOweTo("Arthur")); // Output: 50.5
        System.out.println("How much do I owe to Michael? " + myIOU.howMuchDoIOweTo("Michael")); // Output: 30.0
        System.out.println("How much do I owe to John? " + myIOU.howMuchDoIOweTo("John")); // Output: 0.0
    }
}
