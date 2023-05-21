class SortingMachine {
    private Point origin;
    public SortingMachine(){
      
    }
    public void sort(Relatable [] p){
        
        boolean jud=true;
        Relatable al;
        while(jud){
            jud=false;
            for(int i = 0 ; i < p.length-1 ; i++){
                if(p[i+1].isSmallerThan(p[i])){
                    al=p[i];
                    p[i]=p[i+1];
                    p[i+1]=al;
                    jud=true;
                }
            }
        }
    }

}