public class Vertex {
   public double x;
   public double y;
   public Vertex(double x, double y){
       this.x=x;
       this.y=y;
   }
   public String toString(){return "("+x+","+y+")";}
   public Double distance(){return Math.sqrt(x*x + y*y);}
   public Vertex skalarMult(double s){return new Vertex(x*s, y*s);}
   public void skalarMultMod(double s){this.x=s*x; this.y=s*y;}


   public void addMod(Vertex v2){
    this.x=x+v2.x;
   }

   public Vertex add(Vertex v2){
    return new Vertex(x+v2.x, y+v2.y);
   }
   public double getX(){return x;}
   public double getY(){return y;}

   public void setX(double x){
    this.x=x;
   }
   

   public void setY(double y){
    this.y=y;}
    public boolean equals(Object thatObject){
    if(thatObject instanceof Vertex){
        Vertex that = (Vertex)thatObject;
        return this.x==that.x && this.y == that.y;
    }
    return false;}

    public Vertex sub(Vertex that){
        return new Vertex(x-that.x,)
    }



