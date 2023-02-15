
package AlgoritmoVoraz;

import java.util.ArrayList;

public class SubsetManager {
    private ArrayList<Subset> subsets;
    private Subset subset;
    private int suma = 0;
    public SubsetManager(){
        this.subsets = new ArrayList<Subset>(); 
    }
    public SubsetManager(ArrayList<String> nodes){
        this();
        for(String node : nodes){
             subset = new Subset();
            subset.AddNode(node);
            this.subsets.add(subset);
        }
    }
    
    //saber si puede causar un bucle cerrado
    public boolean FindSourceAndDestinationInSubsets(Edge edge){
        for(Subset subset : this.subsets){
            if(subset.FindBoth(edge.getSource(),edge.getDestination())){
                return true;
            }
        }
        return false;
    }
    //Actualizamos los fragmentos al integrar una nueva arista
    public void UpdateSubsetWithEdge(Edge edge){
        Subset sourceSubset = this.findSubsetOf(edge.getSource());
        Subset destinationSubset = this.findSubsetOf(edge.getDestination());
        Subset union = new Subset(sourceSubset, destinationSubset);
        this.sumarAristas(edge);
        this.subsets.add(union);
        this.subsets.remove(sourceSubset);
        this.subsets.remove(destinationSubset);
    }
    private Subset findSubsetOf(String node){
        for(Subset subset : this.subsets){
            if(subset.Find(node)){
                return subset;
            }
        }
        return new Subset();
    }
    public boolean find(String node){
        for(Subset subset : this.subsets){
            if(subset.Find(node)){
                return true;
            }
        }
        return false;
    }
    public void Add(ArrayList<String> nodes){
        for(String node : nodes){
            
            subset.AddNode(node);
            this.subsets.add(subset);
        }
    }
    public void sumarAristas(Edge edge){
        suma += edge.getLength();
    }
    public int getSuma(){
        return suma;
    }
    public void setSuma(int suma){
        this.suma = suma;
    }
   
}
