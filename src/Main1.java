import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<>();

        party.add(new Warrior("Aragorn"));
        party.add(new Mage("Gandalf"));
        party.add(new Archer("Legolas"));

        for (Character c : party) {
            System.out.print(c.getName() + ": ");
            c.attack();
            c.defend();
            System.out.println("---");
        }
    }
}