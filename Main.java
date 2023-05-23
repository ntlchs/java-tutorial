// run the command:
// javac Main.java && java Main

public class Main {
    int x = 9; // an attribute of the class Main

    // #### METHODS ####
    static void myMethod() {
        System.out.println("The method just got executed!");
    }

    static void myArgsMethod(String fname) {
        System.out.println(fname + " - this is the string used as arg when calling the method");
    }

    static int myReturnMethod(int x, int y) {
        return x + y;
    }

    // ==== Method Overloading ====
    // With method overloading, multiple methods can have the same name with
    // different parameters:
    static int plusOverloadingMethod(int x, int y) {
        return x + y;
    }

    static double plusOverloadingMethod(double x, double y) {
        return x + y;
    }

    // ==== Recursion ====
    public static int sum(int k) { // Making a function call itself
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    // When the sum() function is called, it adds parameter k to the sum of all
    // numbers smaller than k and returns the result. When k becomes 0, the function
    // just returns 0.

    // Static method
    static void myStaticMethod() { // Class method, doesn't change with object
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    void myPublicMethod() { // Instance method, can change with object
        System.out.println("Non static methods must be called by creating objects");
    }

    // ==== Classes and Objects ====
    // A class is a template for objects, and an object is an instance of a class.

    public static void main(String[] args) {
        myMethod(); // calls myMethod
        myArgsMethod("Alice"); // calls MyArgsMethod

        int z = myReturnMethod(5, 3);
        System.out.println("Returning method: " + z);

        int myNum1 = plusOverloadingMethod(8, 5); // overloading
        double myNum2 = plusOverloadingMethod(4.3, 6.26);

        System.out.println("overloading: " + myNum1 + " " + myNum2 + '\n');

        int result = sum(10);
        // 10 + sum(9)
        // 10 + ( 9 + sum(8) )
        // 10 + ( 9 + ( 8 + sum(7) ) )
        // ...
        // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
        // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
        System.out.println(result);

        Main myObj = new Main(); // creates an instance of Main
        System.out.println("Main attribute: " + myObj.x); // prints the x attribute from Main
        myObj.x = 40; // You can also modify attribute values
        System.out.println("Modified Main attribute" + myObj.x);

        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        Main myObj2 = new Main(); // Create an object of Main
        myObj2.myPublicMethod(); // Call the public method on the object

        // #### DATA TYPES ####

        // ==== Integers ====
        int myNum = 5; // int data type can store whole numbers from -2147483648 to 2147483647
        byte myByteNum = 100; // byte data type can store whole numbers from -128 to 127
        short myShortNum = 5000; // short data type can store whole numbers from -32768 to 32767
        long myLongNum = 15000000000L; // long data type can store whole numbers from -9223372036854775808 to
                                       // 9223372036854775807. Note that you should end the value with an "L"

        // ==== Float and Double ====
        float myFloatNum = 5.99f; // floating point number. The precision is only six or seven decimal digits
        double myDoubleNum = 19.99d; // double variables have a precision of about 15 digits
        float f1 = 35e3f; // can also be a scientific number with an "e" to indicate the power of 10
        double d1 = 12E4d;

        // ==== Casting ====
        int myManualInt = (int) myDoubleNum; // Manual casting: double to int
        double myAutoDouble = myNum; // Automatic casting: int 5 to double

        // Operator | Name .......... | Description ...................... | Example
        // -------- | --------------- | ---------------------------------- | -------
        // ...+.... | Addition ...... | Adds together two values ......... | x + y
        // ...-.... | Subtraction ... | Subtracts one value from another.. | x - y
        // ...*.... | Multiplication | Multiplies two values ............ | x * y
        // .../.... | Division ...... | Divides one value by another ..... | x / y
        // ...%.... | Modulus ....... | Returns the division remainder ... | x % y
        // ...++... | Increment ..... | Increases the value of a var by 1 | ++x
        // ...--... | Decrement ..... | Decreases the value of a var by 1 | --x

        // ==== Chars ====
        char myLetter = 'D'; // Character. Must be surrounded by single quotes like 'A'
        char myChar1 = 65, myChar2 = 66; // 65=A, 66=B. You can use ASCII values

        // ==== Booleans ====
        boolean myBool = true; // Boolean type - true or false

        // ==== Strings ====
        String myText = "Hello"; // String, used to store a sequence of characters (text)
        // It's a non-primitive data type because it refers to an object.

        /*
         * ==== Primitive vs non-primitive types ====
         * - Primitive types are predefined (already defined) in Java. Non-primitive
         * types are created by the programmer and are not defined by Java (except for
         * String).
         * - Non-primitive types can be used to call methods to perform certain
         * operations, while primitive types cannot.
         * - A primitive type always has a value, while non-primitive types can be null.
         * - A primitive type starts with a lowercase letter, while non-primitive types
         * start with an uppercase letter.
         * - The size of a primitive type depends on the data type, while non-primitive
         * types all have the same size.
         */

        // ==== Prints ====
        System.out.println("int: " + myNum);
        System.out.println("byte: " + myByteNum);
        System.out.println("short: " + myShortNum);
        System.out.println("long: " + myLongNum);

        System.out.println("float: " + myFloatNum);
        System.out.println("double: " + myDoubleNum);
        System.out.println("sci float: " + f1);
        System.out.println("sci double: " + d1);
        System.out.println("manual double to int: " + myManualInt);
        System.out.println("auto int to double: " + myAutoDouble);

        System.out.println("char: " + myLetter);
        System.out.println("ASCII char 65: " + myChar1);
        System.out.println("ASCII char 66: " + myChar2);

        System.out.println("boolean: " + myBool);
        System.out.println("string: " + myText);

        // ==== Keyboard inputs ====
        System.out.println("Enter your name:");
        String str = Keyboard.readString();
        System.out.println("Your name is " + str);

        // #### EXAMPLE CLASS ####
        ExampleClass example = new ExampleClass(1, "John", true);
        // Get values using the getter methods
        int id = example.getId();
        String name = example.getName();
        boolean active = example.isActive();

        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Active: " + active);

        // Set values using the setter methods
        example.setId(2);
        example.setName("Alice");
        example.setActive(false);

        // Get the updated values
        id = example.getId();
        name = example.getName();
        active = example.isActive();

        System.out.println("Updated Id: " + id);
        System.out.println("Updated Name: " + name);
        System.out.println("Updated Active: " + active);

        // #### INHERITANCE AND POLIMORPHISM ####

        // ==== Inheritance ====
        Animal animal = new Animal();
        animal.makeSound(); // Output: "The animal makes a sound"

        Animal dog = new Dog(); // This is polimorphism, dog is an Animal with Dog instances. "dog" don't know
                                // that Cat and Dog exist, and since its only an Animal, the defined methods are
                                // only the ones declarated in variable type
        animal = new Dog(); // This would be the most common way to declare this, since animal is an Animal
                            // with Animal methods, and if Dog object has own method overwritten (without

        // constructor) by the Dog object created - Dog must extend Animal for this to
        // work.
        // object type = related to data
        // var type = related to which objects it can point to (in the example, only
        // "MakeSound")
        dog.makeSound(); // Output: "The dog barks"
        // dog.play(); this wont work because dog is an Animal, not a Dog
        Dog dog2 = new Dog();
        dog2.play(); // this works :)

        Cat cat = new Cat(); // cat is just an instance of Cat
        cat.makeSound(); // Output: "The cat meows"

        // ==== Polimorfism ====
        Shape shape1 = new Circle();
        shape1.draw(); // Output: "Drawing a circle"

        Shape shape2 = new Rectangle();
        shape2.draw(); // Output: "Drawing a rectangle"

        // #### SUPERCLASS #####
        Car car = new Car("Toyota", "Camry");
        car.displayInfo();

        // #### ARRAYS ####
        // To declare an array, define the variable type with square brackets
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" }; // this is an array of strings, called cars.
        System.out.println("Array length: " + cars.length); // array length
        System.out.println("First element of array: " + cars[0]); // first item of array

        for (int i = 0; i < cars.length; i++) { // standard for to loop through all elements
            System.out.println("car " + (i + 1) + ": " + cars[i]); // i+1 because starts in 0
        }
        for (String i : cars) { // short for-each loop, used exclusively to loop through elements in arrays
            System.out.println(i); // here, i is not the position in array, but the element itself
        }

        // ==== Multidimensional arrays ====
        // A multidimensional array is an array of arrays
        // To create a two-dimensional array, add each array within its own set of {}
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println(myNumbers[1][2]); // Outputs 7
        myNumbers[1][2] = 9; // changing element value
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
        for (int i = 0; i < myNumbers.length; ++i) { // for loop
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println("array " + i + ", position " + j + ": " + myNumbers[i][j]);
            }
        }
        for (int[] i : myNumbers) { // using for-each
            for (int j : i) {
                System.out.println(j);
            }

        }

    }
}
