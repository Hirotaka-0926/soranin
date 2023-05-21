class SimpleNode{
    private SimpleNode next;
    private SimpleNode prev;
    private int key;

    public SimpleNode(int key){
        this.key=key;
        this.prev=null;
        this.next=null;
    }
    public void setNext(SimpleNode next){
        this.next=next;
    }
    public void setPrev(SimpleNode prev){
        this.prev=prev;
    }

    public SimpleNode getPrev(){
        return prev;
    }
    public SimpleNode getNext(){
        return next;
    }
    public int getkey(){
        return key;

    }

   
}