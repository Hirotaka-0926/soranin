class Refueling{
    private int n, m;
    int tail=1, top=1;
    int [] car;
    int [] linelist;
    int []stoplist;
    

    public Refueling(int n, int m){
        this.n=n;
        this.m=m;
        car=new int[n+1];
        linelist=new int[n+1];
        stoplist=new int[m+1];
        for(int i = 0 ; i <= n ; i++){
            car[i]=0;
            linelist[i]=0;
        }
    }

  



    public void startGas(int carnum){
        int i, a=0;
        for(i = 1 ; i <= n ; i++){
            if(linelist[i]==0)break;
            if(i==n)a=-1;
        }
        if(a==-1){
            push(carnum);
        } else {
        car[i]=carnum;
        linelist[i]=1;
        }

    }

    public void stopGas(int lean){
        int i;
        linelist[lean]=0;
        System.out.println(car[lean]);
        car[lean]=0;
        if(top!=tail){
            linelist[lean]=1;
            car[lean]=pop();
        }
    }

    void push(int key){
        stoplist[tail]=key;
        if(tail%m==0)tail=0;
        else tail++;
    }

    int pop(){
        if(top%m==0){top=0;
            return stoplist[n];
        } else {
        top++;
        return stoplist[top-1];
        }
    }
}