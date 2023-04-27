package com.phucdevs.structural.decorator;

/*public class DecoratorStaticComposition {

    public static void main(String[] args) {
        Circle1 circle = new Circle(10);
        System.out.println(circle.info());

        ColoredShape<Square1> blueSquare = new ColoredShape1<>(() -> new Square1(20), "blue");
        System.out.println(blueSquare.info());

        // ugly!
        TransparentShape<ColoredShape<Circle1>> myCircle =
                new TransparentShape<>(() ->
                        new ColoredShape<>(() -> new Circle1(5), "green"), 50
                );
        System.out.println(myCircle.info());
        // cannot call myCircle.resize()
    }
}

interface Shape1 {
    String info();
}

class Circle1 implements Shape1 {
    private float radius;

    Circle1(){}

    public Circle1(float radius)
    {
        this.radius = radius;
    }

    void resize(float factor)
    {
        radius *= factor;
    }

    @Override
    public String info()
    {
        return "A circle of radius " + radius;
    }
}

class Square1 implements Shape
{
    private float side;

    public Square1()
    {
    }

    public Square1(float side)
    {
        this.side = side;
    }

    @Override
    public String info()
    {
        return "A square with side " + side;
    }
}

// we are NOT altering the base class of these objects
// cannot make ColoredSquare, ColoredCircle

class ColoredShape1<T extends Shape> implements Shape {
    private Shape shape;
    private String color;

    public ColoredShape1(Supplier<? extends T> ctor, String color) {
        shape = ctor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape + " has the color " + color;
    }
}

class TransparentShape1<T extends Shape> implements Shape
{
    private Shape shape;
    private int transparency;

    public TransparentShape1(Supplier<? extends T> ctor, int transparency)
    {
        shape = ctor.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape + " has " + transparency + "% transparency";
    }
}*/
