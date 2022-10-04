public class SimpleTriangle extends GeometricObject {
    
    public SimpleTriangle(Vertex pos, double width){
        super(pos, width,Math.sqrt(a:3) / 2*width);
    }
    
    public SimpleTriangle(double x,double y, double width, double height){
        super(new Vertex(x,y), width, height);
    }
    @Override public double area() {
        return (1/2 *width*height); }

    @Override public String toString(){
        return "SimpleTriangle"+super.toString();}

    @Override public double circumference(){
        return (width*3);
    } 
    }
