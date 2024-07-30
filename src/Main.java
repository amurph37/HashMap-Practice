import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a new HashMap<String, String> object
        HashMap<String, String> nicknames = new HashMap<>();

        // Step 2: Store the names and nicknames in the HashMap
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        // Step 3: Retrieve Matthew's nickname from the HashMap
        String matthewsNickname = nicknames.get("matthew");

        // Step 4: Print Matthew's nickname
        System.out.println(matthewsNickname);
    }
}
