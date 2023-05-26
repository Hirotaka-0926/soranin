class  AdvancedSortingMachine extends SortingMachine{

    
    public AdvancedSortingMachine(Strategy s){
        super(s);
    }

    public void sort(int[] data){
        long startTime, endTime, countTime;
        
        System.out.println(strategy.getClass().getName());
        startTime=System.currentTimeMillis();
        strategy.sort(data);
        endTime=System.currentTimeMillis();
        countTime=endTime-startTime;
        System.out.println("time: "+countTime);
    }
}