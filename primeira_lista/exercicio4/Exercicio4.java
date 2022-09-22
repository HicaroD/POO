package exercicio4;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio4 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of shapes: ");
        int quantidadeDeShapes = scanner.nextInt();
        ArrayList<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < quantidadeDeShapes; i++) {
            System.out.printf("Shape %d data: \n", i + 1);
            System.out.print("Rectangle or Circle (r/c)? ");
            scanner.nextLine(); 
            String tipoDoShape = scanner.nextLine();
            System.out.print("Color (RED/BLACK/BLUE)? ");
            String colorName = scanner.nextLine();
            Color color = Color.valueOf(colorName);

            if(tipoDoShape.equals("r")) {
                System.out.println("Choose width and height: ");
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                Rectangle rect = new Rectangle(color, width, height);
                shapes.add(rect);
            } 
            else if (tipoDoShape.equals("c")) {
                System.out.println("Choose radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(color, radius);
                shapes.add(circle);
            } 
            else {
                break;
            }
        }

        System.out.println("SHAPE AREAS:");
        for(Shape shape : shapes) {
            System.out.println(shape.area());
        }
        scanner.close(); 
    }
}
