class StackImplByDeque implements Stack {
    private Deque deque;
    StackImplByDeque(){
    this.deque = new DequeImplByDLL();
    }

    public void push(int key){
        deque.insertBack(key);
    }

    public int pop(){
        int key;
        key=deque.back();
        deque.removeBack();
        return key;
    }

    public int top(){
        return deque.back();
    }
    /* your codes */
    }