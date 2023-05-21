class Stack{
    int[] S=new int[101];
    int t=0;

    void push(int n){
        t++;
        S[t]=n;
        
    }

    void pop(){
        System.out.println(S[t]);
        t--;
    }
    

}