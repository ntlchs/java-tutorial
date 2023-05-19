class Shape {
    void draw() {
        System.out.println("Drawing a shape"); // method
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle"); // overwritten method
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// In this example, we have a base class Shape that defines a method draw() to
// print a generic shape.
// The Circle and Rectangle classes are derived (or sub) classes of the Shape
// class, inheriting the draw() method.
// Both Circle and Rectangle classes override the draw() method with their own
// implementation specific to the shape they represent.
// In the Main class, we create objects of the Circle and Rectangle classes, but
// store them in variables of the base class Shape.
// This demonstrates polymorphism, as we can treat the derived objects as
// instances of the base class, allowing us to call the draw() method on them
// without knowing their specific types.
// The actual implementation of the draw() method that gets executed is
// determined at runtime based on the type of the object, resulting in different
// outputs when invoking the draw() method on the shape1 and shape2 objects.