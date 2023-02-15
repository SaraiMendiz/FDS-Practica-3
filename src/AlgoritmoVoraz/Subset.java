
package AlgoritmoVoraz;

import java.util.ArrayList;

public class Subset {
    private ArrayList<String> nodes;
    
    public Subset(){
    this.nodes = new ArrayList<String>();
    }
    public Subset(Subset subset1, Subset subset2){
        this();
        for(String node : subset1.nodes){
            this.nodes.add(node);
        }
        for(String node : subset2.nodes){
            this.nodes.add(node);
        }
    }
    
    public void AddNode(String node){
        this.nodes.add(node);
        
        
    }
    //si pertenece al fragmento
    public boolean Find(String node){
        return this.nodes.contains(node);
    }
    //si ambos pertenecen al fragmento
    public boolean FindBoth(String node1, String node2){
        return this.nodes.contains(node1) && this.nodes.contains(node2);
    }
    public ArrayList<String> getArrayList(){
        return nodes;
    }
}
