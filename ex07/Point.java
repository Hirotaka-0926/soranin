class Point implements Relatable{
    private int x, y;
    
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public boolean isSmallerThan(Relatable other){
        Point p=(Point)other;
        if(x<p.getX()){
            return true;
        } else if(x==p.getX()){
            if(y<p.getY()) return true;
            else return false;
        }
        else return false;

    }
    public void print(){
        System.out.println("("+x+", "+y+")");
    }
}