// #### INHERITANCE ####

// ==== Superclass Example ====
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// ==== Subclass Examples ====
class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks");
    }

    void play() {
        System.out.println("The dog is playing");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("The cat meows");
    }
}

// In this example, we have a base class Animal that has a method makeSound() to
// print a generic sound.
// The Dog and Cat classes are derived (or sub) classes of the Animal class,
// which means they inherit the makeSound() method from the Animal class.
// However, both Dog and Cat classes override the makeSound() method with their
// own implementation specific to the respective animal.
// When we create objects of the Animal, Dog, and Cat classes and call the
// makeSound() method, the overridden version of the method is invoked,
// resulting in different outputs based on the actual type of the object.

// this class also uses polimorphism