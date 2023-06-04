class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}
class Triangle extends Shape{
    public void area(int l , int b){
        
        System.out.println("Area of Triangle");
        System.out.println(0.5*l*b);
    }
}
public class SingleLevelInheritance{
    public static void main(String args[]){
        Shape s=new Shape();
        s.area();
        Triangle t=new Triangle();
        t.area(2,3);
        
    }
}