package Lesson7_BaiTapTrenLop;

class Garen extends Hero implements IChampion, Tank {


    public Garen(String name, String role, int attackDame, int abilityPower, int healPoint, int manaPoint) {
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
        this.manaPoint -= 0;
        System.out.printf("heal: %d, mana: %d ",hero.healPoint,this.manaPoint);

    }

    @Override
    public String toString() {
        return "heal: " + this.healPoint + "\nmana: " + this.manaPoint;
    }

    @Override
    public int setAbilitiPower(int abilityPower) {
        return 0;
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
        this.healPoint += 200;
        this.manaPoint += 0;
    }

    @Override
    public void Reduce() {

    }

    @Override
    public void amor() {
        this.healPoint = healPoint + 100;
    }
}
