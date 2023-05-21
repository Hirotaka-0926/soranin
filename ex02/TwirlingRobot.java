
class TwirlingRobot{

    int x,y,dir;
    
    void initialize(int a, int b, int c){
	x=a;
	y=b;
	dir=c;
    }

    void turnLeft(){
	if(dir==0)dir=3;
	else dir--;
    }
    void turnRight(){
	if(dir==3)dir=0;
	else dir++;
    }
    void move(){
	if(dir==0){
	    if(y!=-4)y--;
	}
	else if(dir==1){
	    if(x!=4)x++;
	}
	else if(dir==2){
	    if(y!=4)y++;
	}
	else{
	    if(x!=-4)x--;
	}
	
    }

    void printLocation(){
	System.out.println("("+x+", "+y+")");
    }

}
