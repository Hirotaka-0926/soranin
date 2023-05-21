class Quadrangle extends Shape{
    protected Point[] P;
    public Quadrangle(Point p1, Point p2, Point p3, Point p4){
        P=new Point[4];
        P[0]=p1;
        P[1]=p2;
        P[2]=p3;
        P[3]=p4;
    /*
    your code
    */
    }
    public void print(){
        super.print();
        for(int i = 0 ; i < 4 ; i++){
            System.out.print("("+P[i].getx()+", "+P[i].gety()+")");
            if(i!=3)System.out.print("-");
        }
        System.out.println();
    /*
    your code
    */
    }
    public void move(int dx, int dy){
        for(int i = 0 ; i < 4 ; i++){
            Point newP=new Point(dx+P[i].getx(), dy+P[i].gety());
            P[i]=newP;
        }
    /*
    your code
    */
    }
}