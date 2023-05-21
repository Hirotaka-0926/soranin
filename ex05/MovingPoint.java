class MovingPoint extends Point{
    int vx, vy;

    MovingPoint(int x, int y){
        super(x, y);
    }


    public void setVelocity(int vx, int vy){
        this.vx=vx;
        this.vy=vy;
    }



    public void move(){
        x+=vx;
        y+=vy;
    }

    public double getDistance(MovingPoint p){
        int disX, disY;
        double dis;
        disX=x-p.x;
        disY=y-p.y;
        dis=disX*disX+disY*disY;
        return Math.sqrt(dis);
    }

}