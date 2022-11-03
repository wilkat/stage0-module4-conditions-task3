package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {

        String nowy = String.valueOf(symbol);
        if (nowy.equals("[a-zA-Z]")) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
