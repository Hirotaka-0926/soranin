import java.util.*;

class Gas{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n, m, s, car;

        n=sc.nextInt();
        m= sc.nextInt();
        Refueling Rs = new Refueling(n, m);

        for(int i = 0 ; i < m ; i++){
            s=sc.nextInt();
            car=sc.nextInt();
            if(s==1)Rs.startGas(car);
            else Rs.stopGas(car);
        }
    }
}