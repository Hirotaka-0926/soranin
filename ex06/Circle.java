class Circle extends Shape{
    private int r;
    Point P;
    public Circle(Point p, int r){
        this.r=r;
        P=p;
    }
    public int getr(){
        return r;
    }
    public void move(int dx, int dy){
        Point newp=new Point(P.getx()+dx, P.gety()+dy);
        P=newp;
    }
    public void print(){
        super.print();
        System.out.print("("+P.getx()+", "+P.gety()+") radius = "+r);
        System.out.println();
    }
}