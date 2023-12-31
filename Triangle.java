public class Triangle extends Shape{
    private double height;

    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }







    public double calculateArea() {

        return (height * base)*1/2;
    }

    public double calculateCircumference() {
        double triangleCircumference = (2 * height) + base;
        return triangleCircumference;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                '}';
    }
}
