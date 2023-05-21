class Point{

    int X;
    int Y;
    static int X_MIN, X_MAX;
    
    static int Y_MAX, Y_MIN;

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
	if(X+dx<=X_MAX&&X+dx>=X_MIN&&Y+dy<=Y_MAX&&Y+dy>=Y_MIN){
        X+=dx;
        Y+=dy;
    }
	
    }
}