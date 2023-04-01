class Animal {
    public void sound() {
      System.out.println("Animal sound");
    }
  }
  
  class Dog extends Animal {
    public void sound() {
      System.out.println("Dog sound");
    }
  }
  
  class Cat extends Animal {
    public void sound() {
      System.out.println("Cat sound");
    }
  }
  
  public class Test {
    public static void main(String[] args) {
      Animal myAnimal = new Animal(); // Animal object
      Animal myDog = new Dog(); // Dog object
      Animal myCat = new Cat(); // Cat object
  
      // Call the sound() method for each object
      myAnimal.sound();
      myDog.sound();
      myCat.sound();
    }
  }
  