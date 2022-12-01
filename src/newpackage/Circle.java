package newpackage;

public class Circle {
    private double PI;
    public void area(double PI){
        double radius = PI;
        double area = Math.PI*(radius*radius);
        System.out.println("Площадь круга ровна: "+area);
        double circumference = Math.PI*2*radius;
        System.out.println("Длины окружности равна: "+circumference);
    }
    public void circumference(){

    }
}