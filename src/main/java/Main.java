public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Blue", 10);
        Figure rectangle = new Rectangle("Red", 5, 4);
        Figure triangle = new Triangle("Black", 5, 5, 5);
        System.out.println("Периметр круга - " + circle.calculatePerimeter());
        System.out.println("Площадь круга - " + circle.calculateArea());
        System.out.println("Периметр прямоугольника - " + rectangle.calculatePerimeter());
        System.out.println("Площадь прямоугольника - " + rectangle.calculateArea());
        System.out.println("Периметр треугольника - " + triangle.calculatePerimeter());
        System.out.println("Площадь треугольника - " + triangle.calculateArea());
        circle.draw();
        CompareFigure compareFigure = new SimpleCompareFigure();
        System.out.println(compareFigure.compare(circle, rectangle));
        Cube cube = new Cube("White", 5);
        System.out.println("Периметр куба - " + cube.calculatePerimeter());
        System.out.println("Площадь поверхности куба - " + cube.calculateArea());
        System.out.println("Объем куба - " + cube.calculateVolume());
        cube.draw();
    }
}
