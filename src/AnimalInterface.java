interface AnimalInterface {

    public void sound();
    public void sleep();
}

class Dog implements AnimalInterface{

    public void sound() {
        System.out.println("wof wof wof!!!");
    }


    public void sleep() {
        System.out.println("I am sleeping");
    }
}