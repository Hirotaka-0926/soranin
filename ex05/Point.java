class Point{
    int x, y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void print(){
        System.out.println("("+x+", "+y+")");
    }

    public double getDistance(Point p){
        int disX, disY;
        double dis;
        disX=x-p.x;
        disY=y-p.y;
        dis=disX*disX+disY*disY;
        return Math.sqrt(dis);

    }
}