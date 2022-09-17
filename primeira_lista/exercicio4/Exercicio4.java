package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static Scanner scanner = new Scanner(System.in);

    static Color getColor() {
        System.out.print("Color (BLACK/BLUE/RED): ");
        return Color.valueOf(scanner.nextLine()); 
    }

    static Shape getShape() {
        System.out.print("Rectangle or Circle (r/c)? ");
        String shapeKind = scanner.nextLine();
        Color color = getColor();
        if(color == null) {
            return null;
        }

        switch(shapeKind) {
            case "r":
                System.out.print("Width: ");
                double width = Double.parseDouble(scanner.nextLine());
                System.out.print("Height: ");
                double height = Double.parseDouble(scanner.nextLine());
                return new Rectangle(width, height); 
            case "c":
                System.out.print("Radius: ");
                double radius = Double.parseDouble(scanner.nextLine());
                return new Circle(radius); 
        }
        return null; 
    }

    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of shapes: ");
        int numberOfShapes = Integer.parseInt(scanner.nextLine());

        ArrayList<Shape> shapes = new ArrayList<>(numberOfShapes);

        while(numberOfShapes > 0) {
            Shape shape = getShape();
            if(shape == null) {
                throw new Exception("Shape invalido!");
            }
            shapes.add(shape);
            numberOfShapes--; 
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapes) {
            System.err.printf("%.2f\n", shape.area());
        }
    }
}