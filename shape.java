public interface shape {
    double getArea();

} 
class rectangle implements shape{
    private double lenght;
    private double width;
    public rectangle(double lenght, double width){
        this.lenght=lenght;
        this.width=width;
    }
    public double getArea(){
        return this.lenght * this.width;

    }
}

class circle implements shape{
    private double radius;
    public circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return 3.14 * this.radius * this.radius;

    }
}

class program{
    public static void main(String[] args) {
        rectangle r=new rectangle(3,4);
        System.out.println("Area of rectangle is " + r.getArea());

        circle c=new circle(3);
        System.out.println("Area of circle is " + c.getArea());
    }
}