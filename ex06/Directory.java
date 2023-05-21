public class Directory extends Entity{
    
    private Entity[] EntityList = new Entity[100];
    
    private int numberOfEntity = 0;
    
    public Directory(String name){
    this.name = name;
    }
    public String getName(){ return name; }
    public void rename(String name){this.name = name;}
    public int getSize(){
    int total = 0;
    for ( int i = 0; i < numberOfEntity; i++ ){
    total += EntityList[i].getSize();
    }
    return total;
    }
    public void add(Entity entity){
    EntityList[numberOfEntity++] = entity;
    }
    
    public void display(){
    for ( int i = 0; i < numberOfEntity; i++ ){
    System.out.print(EntityList[i].getName() + " ");
    }

    System.out.println();
    System.out.println(this.getSize() + " bytes");
    }
    }