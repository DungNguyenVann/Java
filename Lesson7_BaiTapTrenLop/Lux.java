package Lesson7_BaiTapTrenLop;

class Lux extends Hero implements IChampion, Magic {

    public Lux(String name, String role, int attackDame, int abilityPower, int healPoint, int manaPoint) {
        super(name, role, attackDame, abilityPower, healPoint, manaPoint);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void attackDamge(Hero hero) {
        hero.healPoint -= this.attackDame;
        this.manaPoint -= 20;
        System.out.printf("heal: %d, mana: %d ", hero.healPoint, this.manaPoint);
    }

    @Override
    public String toString() {
        return "heal: " + this.healPoint + "\nmana: " + this.manaPoint;
    }

    @Override
    public int setAbilitiPower(int abilityPower) {
        return 100;
    }

    @Override
    public int setManaPoints(int manaPoints) {
        this.manaPoint = manaPoints;
        return 0;
    }

    @Override
    public void displayStats() {
        System.out.println("mana: " + this.manaPoint);
        System.out.println("heal: " + this.healPoint);
    }

    @Override
    public void ultimateAbility() {
        this.attackDame = attackDame + 100;
        this.manaPoint += 50;
        this.healPoint += 150;
    }

    @Override
    public void Reduce() {

    }

    @Override
    public void spell() {
        this.attackDame = attackDame + 100;
    }
}
