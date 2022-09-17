package exercicio4;

public abstract class Shape { 
    protected Color color; 

    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }

    public double area() {
        return -1;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}