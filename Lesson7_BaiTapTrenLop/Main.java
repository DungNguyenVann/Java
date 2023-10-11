package Lesson7_BaiTapTrenLop;

public class Main {
    public static void main(String[] args) {
        Garen hero = new Garen("Garen", "bbb", 50, 10, 300, 0);
        Lux hero1 = new Lux("lux", "bbb", 100, 10, 150, 100);
        hero.attackDamge(hero1);
        hero1.spell();
    }
}
