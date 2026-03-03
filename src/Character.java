public class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attack() {
        System.out.println("Character attacks");
    }

    public void defend() {
        System.out.println("Character defends");
    }
}
class Warrior extends Character {
    public Warrior(String name) { super(name); }
    @Override
    public void attack() { System.out.println("Warrior swings sword"); }
}

class Mage extends Character {
    public Mage(String name) { super(name); }
    @Override
    public void attack() { System.out.println("Mage casts fireball"); }
}

class Archer extends Character {
    public Archer(String name) { super(name); }
    @Override
    public void attack() { System.out.println("Archer shoots arrow"); }
}