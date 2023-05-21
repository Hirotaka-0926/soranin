public class SimpleListForwardIterator implements Iterator{
    private SimpleList simpleList;
    private SimpleNode cur;

    public SimpleListForwardIterator(SimpleList simpleList){
        this.simpleList = simpleList;
        cur = simpleList.getNil().getNext();
    }

    public boolean hasNext(){
        return cur != simpleList.getNil();
    }

    public SimpleNode next(){
        SimpleNode target = cur;
        cur = cur.getNext();
        return target;
    }
}