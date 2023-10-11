package Lesson7_BaiTapTrenLop;

abstract class Hero {
    protected String name;
    protected String role;
    protected int attackDame;
    protected int abilityPower;
    protected int healPoint;
    protected int manaPoint;



    public Hero(String name, String role, int attackDame, int abilityPower, int healPoint, int manaPoint) {
        this.name = name;
        this.role = role;
        this.attackDame = attackDame;
        this.abilityPower = abilityPower;
        this.healPoint = healPoint;
        this.manaPoint = manaPoint;
    }
}
