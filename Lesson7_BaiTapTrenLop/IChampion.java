package Lesson7_BaiTapTrenLop;

interface IChampion {
    void setName(String name);

    void setRole(String role);

    void attackDamge(Hero hero);

    int setAbilitiPower(int abilitiPower);

    int setManaPoints(int manaPoints);

    void displayStats();

    void ultimateAbility();

    void Reduce();
}
