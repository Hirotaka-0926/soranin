abstract class Entity{

    String name;

    public String getName(){ return name; }
    public void rename(String name){this.name = name; }
    public abstract int getSize();

    
}