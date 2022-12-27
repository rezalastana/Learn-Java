package tech;
public class ShapeApp {
    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println(shape.getCorner());


        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());//Nilai mengambil dari parent class menggunakan super

    }
}
