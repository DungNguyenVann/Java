package Animal;

class Bird extends Animal {
    @Override
    public void eat(){
        System.out.println("chim an cam");
    }
    @Override
    public void makeSound(){
        System.out.println("chip chip");
    }
     public void fly(){
         System.out.println("chim dang bay");
     }
}
