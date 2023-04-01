// Animal.java

 class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

// Cat.java

 class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says meow");
    }
}

// Dog.java

 class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says woof");
    }
}

// Main.java

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.animalSound();
        myAnimal = new Cat();
        myAnimal.animalSound();
        myAnimal = new Dog();
        myAnimal.animalSound();    
    }
}
