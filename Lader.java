package Homework;

public class Lader extends Geometry{
    double a,b,h;
    Lader(double a,double b,double h){
        this.a=a;
        this.b=b;
        this.h=h;
    }

    @Override
    public double getArea() {
        return((1/2.0)*(a+b)*h);
    }
}
