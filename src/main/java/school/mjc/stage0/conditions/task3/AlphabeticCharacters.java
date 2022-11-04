package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String nowy = Character.toString(character);
        if(nowy.matches("[^a-zA-Z]")) {
            System.out.println("wrong alphabet!");
        } else if (nowy.matches("[aeiouy]")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

    }
}
