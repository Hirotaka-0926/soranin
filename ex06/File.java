public class File extends Entity{
    
    private int size;
    public File(String name, int size){
    this.name = name;
    this.size = size;
    }
    
    
    public int getSize(){
    return size;
    }
    }