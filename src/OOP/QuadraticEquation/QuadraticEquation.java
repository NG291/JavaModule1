package OOP.QuadraticEquation;

public class QuadraticEquation {
    double a, b, c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
   public  double getDiscriminant(){
        return b*2-a*c;
   }
   public double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/(2*a);
   }
   public double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/(2*a);
   }
   public double getRoot(){
        return -b/(2*a);
   }

    @Override
    public String toString() {
        return "Enter "+ "a,"+"b,"+"+c: "+ a+","+b+","+c+ "delta"+getDiscriminant();
    }



}
