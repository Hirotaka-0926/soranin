public class SimpleListBackwardIterator implements Iterator{
    private SimpleList simplelist;
    private SimpleNode cur;

    public SimpleListBackwardIterator(SimpleList simplelist){
        this.simplelist=simplelist;
        cur=simplelist.getNil().getPrev();
    }

    public boolean hasNext(){
        return cur!=simplelist.getNil();
    }

    public SimpleNode next(){
        SimpleNode target=cur;
        cur=cur.getPrev();
        return target;
    }
}