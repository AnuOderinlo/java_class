public class Main {
     int x = 5;

//     static method
     static void staticMethod(){
//          System.out.println("This static method can be accessed anywhere");
     }

//     public method
     public void publicMethod(){
//          System.out.println("This public method can only be accessed within an object");
     }

     public static void main(String[] args) {
          staticMethod();
          Main myObj = new Main();
          myObj.publicMethod();

//Encapsulation... get and set method accessing a private variable
          Encapsulate person = new Encapsulate();
          person.setName("Anuoluwapo");
          System.out.println(person.getName());
     }


}
