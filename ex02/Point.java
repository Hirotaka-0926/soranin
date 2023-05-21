

class Point{

    int X;
    int Y;

    void setX(int N){
	X=N;
    }

    void setY(int N){
	Y=N;
    }

    int getX(){
	return X;
    }

    int getY(){
	return Y;
    }

    void move(int dx, int dy){
	if(X+dx<=100&&X+dx>=-100&&Y+dy<=100&&Y+dy>=-100){
        X+=dx;
        Y+=dy;
    }
	
    }
}


    
