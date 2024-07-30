import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    // Constructor
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    // Method to add a new abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    // Method to check if an abbreviation has already been added
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    // Method to find the explanation for an abbreviation
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation);
    }

    public static void main(String[] args) {
        // Testing the Abbreviations class
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("HTML", "HyperText Markup Language");
        abbreviations.addAbbreviation("CSS", "Cascading Style Sheets");
        abbreviations.addAbbreviation("JS", "JavaScript");

        System.out.println(abbreviations.hasAbbreviation("HTML")); // true
        System.out.println(abbreviations.hasAbbreviation("XML")); // false

        System.out.println(abbreviations.findExplanationFor("HTML")); // HyperText Markup Language
        System.out.println(abbreviations.findExplanationFor("XML")); // null
    }
}
