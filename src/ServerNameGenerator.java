import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = new String[10];
        String[] nouns = new String[10];

        adjectives[0] = "shiny";
        adjectives[1] = "smooth";
        adjectives[2] = "greasy";
        adjectives[3] = "brave";
        adjectives[4] = "wistful";
        adjectives[5] = "wacky";
        adjectives[6] = "smelly";
        adjectives[7] = "wimpy";
        adjectives[8] = "femme";
        adjectives[9] = "queer";

        nouns[0] = "library";
        nouns[1] = "park";
        nouns[2] = "fidget";
        nouns[3] = "president";
        nouns[4] = "friend";
        nouns[5] = "frenemy";
        nouns[6] = "sea";
        nouns[7] = "rainbow";
        nouns[8] = "vest";
        nouns[9] = "clerk";

        System.out.println("Here is your server name: ");
        System.out.printf("%s %s", generator(adjectives), generator(nouns));
    }

    public static String generator(String[] array) {
        Random randomizer = new Random();
        int randomElement = randomizer.nextInt(array.length);
        return array[randomElement];
    }
}
