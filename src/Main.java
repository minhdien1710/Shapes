public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);


        Circle circle = new Circle(2,"white",false);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(20,10,"blue", true);
        System.out.println(rectangle);

        Square square = new Square(15,"black",true);
        System.out.println(square);
    }
}
