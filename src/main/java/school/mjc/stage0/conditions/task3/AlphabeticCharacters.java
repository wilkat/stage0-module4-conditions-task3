package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String nowy = String.valueOf(character);
        if(nowy.equals("^[a-zA-Z]")) {
            System.out.println("wrong alphabet!");
        } else if (nowy.equals("[aeiouy")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
