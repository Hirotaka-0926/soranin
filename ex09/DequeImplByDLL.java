class DequeImplByDLL implements Deque{
    private SimpleDoublyLinkedList list;
    private int n; // the number of elements in the deque
    DequeImplByDLL(){
    list = new SimpleDoublyLinkedList();
    n = 0;
    }


    public void insertFront(int key){
        list.addFront(key);
    }

    public void insertBack(int key){
        list.addBack(key);
    }

    public void removeFront(){
        list.removeFront();
    }

    public void removeBack(){
        list.removeBack();
    }

    public int front(){
        return list.front();
    }

    public int back(){
        return list.back();
    }


    /* your codes */
}