package Homework;

public class square extends Geometry{
    double c;
    square(double c){
        this.c=c;
    }
    public double getArea(){
        return(c*c);
    }
}
