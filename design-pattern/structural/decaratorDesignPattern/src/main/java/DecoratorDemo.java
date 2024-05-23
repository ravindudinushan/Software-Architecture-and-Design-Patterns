public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("CIRCLE : Normal Border");
        circle.draw();
        System.out.println("\n CIRCLE : Red Border");
        redCircle.draw();
        System.out.println("\n RECTANGLE : Red Border");
        redRectangle.draw();
    }
}
