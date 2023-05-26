class QueueImplByDeque implements Queue{
    
    Deque deque;

    public QueueImplByDeque(){
        this.deque=new DequeImplByDLL();
       
    }

    public void enqueue(int key){
        deque.insertFront(key);
    }

    public int dequeue(){
        int key= deque.back();
        deque.removeBack();
        return key;
    }

    public int front(){
        return deque.front();
    }
}