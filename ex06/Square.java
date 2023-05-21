class Square extends Shape{
    
    Point P[];
    public Square(Point p1, int w){
        Point p3=new Point(p1.getx()+w, p1.gety()+w);
        Point p2=new Point(p1.getx()+w, p1.gety());
        Point p4=new Point(p1.getx(), p1.gety()+w);
        P=new Point[4];
        P[0]=p1;
        P[2]=p3;
        P[1]=p2;
        P[3]=p4;
        
    }
   
    public void move(int dx, int dy){
        for(int i = 0 ; i < 4 ; i++){
        Point newp=new Point(P[i].getx()+dx, P[i].gety()+dy);
        P[i]=newp;
        }
    }
    public void print(){
        super.print();
        for(int i = 0 ; i < 4 ; i++){
        System.out.print("("+P[i].getx()+", "+P[i].gety()+") ");
        if(i!=3)System.out.print("-");
        }
        System.out.println();
    }
}