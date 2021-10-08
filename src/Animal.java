//Abstract class
abstract class Animal {
    //N.B abstract method does not have a body
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Sleeping in awwwwww!!!!");
    }
}

class Pig extends Animal{

    public void animalSound() {
        System.out.println("The pig says: waa waa");
    }
}