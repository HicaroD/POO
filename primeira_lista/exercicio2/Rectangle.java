public class Rectangle {
    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return (2 * height) + (2 * width);
    }

    double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)); 
    }
}
