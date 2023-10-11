package Lesson7_Abtract_Interface;

class Chicken extends Animal implements Edible {

    @Override
    String makeSound() {
        return "oooooooooo";
    }

    @Override
    public String howtoEat() {
        return "ran";
    }
}
