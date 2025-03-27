public class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(Point location,int sideA,int sideB,int sideC) {
        super(location);
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }


    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
