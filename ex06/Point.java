class Point{
    private int x;
    private int y;
    public Point(int x, int y){
    this.x = x;
    this.y = y;
    }
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    public boolean equals(Object obj){
        if(obj==null)return false;
        else if(super.equals(obj))return true;
        else if(getClass()==obj.getClass()){
            Point p=(Point)obj;
            return p.getx()==x && p.gety()==y;
        }
        else return false;
    }
}
    class EqualPointApplication{
    public static void main(String[] args){
    Point p1 = new Point(1, 2);
    Point p2 = new Point(1, 2);
    if ( p1 == p2 ) {
    System.out.println("p1 == p2");
    } else {
    System.out.println("p1 != p2");
    }
    if ( p1.equals(p2) ){
    System.out.println("p1 and p2 is equal");
    } else {
    System.out.println("p1 and p2 is not equal");
    }
    }
    }