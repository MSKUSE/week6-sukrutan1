public class Main {
    public static void main(String[] args) {
        /*Point p=new Point(3,4);
        Rectangle r1=new Rectangle(p,3,4);
        System.out.println(r1.counterforobject);
        System.out.println(Rectangle.counter);
        Rectangle r2=new Rectangle(p,5,6);
        System.out.println(r1.counterforobject);
        System.out.println(r2.counterforobject);
        System.out.println(Rectangle.counter);
        String a=new String("aaa");
        System.out.println(a);
        System.out.println(r1);*/

        Shape shape=new Shape(new Point(3,5));
        Circle c=new Circle(new Point(3,4),5);

    }
}