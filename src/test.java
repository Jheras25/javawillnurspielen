import java.beans.PropertyVetoException;
public class test {
    public static void main(String args[]){

    Vertex v1= new Vertex(x:34, y:2);

    SimpleTriangle dreieck = new SimpleTriangle(v1, width:100);
    System.out.println(dreieck);
    System.out.println(dreieck.area());
    }
}
