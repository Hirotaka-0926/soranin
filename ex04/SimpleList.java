class SimpleList{
    private SimpleNode nil;
    SimpleList(){
    init();
    }
    void init(){
    nil = new SimpleNode(0);
    nil.setNext(nil);
    nil.setPrev(nil);
   }
    SimpleNode listSearch(int key){
        SimpleNode currentNode=nil.getNext();
        while(currentNode!=nil){
            if(currentNode.getkey()==key){
                return currentNode;
            }
            currentNode=currentNode.getNext();
        }
        return null;
        

    /* your code */
    }
    void printList(){
        SimpleNode currentNode=nil.getPrev();
        while(currentNode!=nil){
            System.out.print(currentNode.getkey()+" ");
            currentNode=currentNode.getPrev();
        }
        System.out.println();
        
    /* your code */
   }
    void delete(int key){
    
        SimpleNode A=listSearch(key);
        if(A!=null){
        A.getPrev().setNext(A.getNext());
        A.getNext().setPrev(A.getPrev());
        }
    /* your code */
    }
    void insert(int key){
        SimpleNode newNode = new SimpleNode(key);
        newNode.setPrev(nil.getPrev());
        newNode.setNext(nil);
        nil.getPrev().setNext(newNode);
        nil.setPrev(newNode);

    /* your code */
    }
   }