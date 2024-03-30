interface Character {
    void attack();
}

interface Weapon {
    void use();
}

class Warrior implements Character, Weapon {
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword");
    }
    @Override
    public void use() {
        System.out.println("Warrior uses a sword");
    }
}

