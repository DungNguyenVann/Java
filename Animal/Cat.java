package Animal;

class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("an com");
    }

    @Override
    public void makeSound() {
        System.out.println("meo meo");
    }
    void run(){
        System.out.println("chay");
    }
}
