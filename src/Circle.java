public class Circle extends Shape {

    private Point center;
    private int radius;

    public Circle(Point location, int radius) {
        super(location);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            this.radius = 0;
            System.out.println("Radius can't be negative");
        }else {
            this.radius = radius;

        }
    }

    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return Math.PI*radius*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "location=" + this.getLocation() +
                ", radius=" + radius +
                '}';
    }
}
