
package AlgoritmoVoraz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class TicketToRide {
    private ArrayList<Edge> edges; //aristas;
    private ArrayList<String> nodes; //nodos
    private ArrayList<String> nodos = new ArrayList<String>();
    private ArrayList<String> nodosMax = new ArrayList<String>();
    private ArrayList<Edge> edgesMin = new ArrayList<>();
    private ArrayList<Edge> edgesMax = new ArrayList<>();
    private int minimo = 0;
    private int maximo = 0;
    public TicketToRide(){
        this.edges = new ArrayList<Edge>();
        this.nodes = new ArrayList<String>();
    }
    public void LoadEuropeMap(){
        this.edges.add(new Edge("Madrid","Lisboa",3));
        this.edges.add(new Edge("Madrid","Cádiz",3));
        this.edges.add(new Edge("Madrid","Barcelona",2));
        this.edges.add(new Edge("Madrid","Pamplona",6));
        
        this.edges.add(new Edge("Lisboa","Cádiz",2));
        
        this.edges.add(new Edge("Barcelona","Pamplona",4));
        this.edges.add(new Edge("Barcelona","Marsella",4));
        
        this.edges.add(new Edge("Pamplona","París",4));
        this.edges.add(new Edge("Pamplona","Brest",4));
        this.edges.add(new Edge("Pamplona","Marsella",4));
        
        this.edges.add(new Edge("Brest","Dieppe",2));
        this.edges.add(new Edge("Brest","París",3));
        
        this.edges.add(new Edge("Dieppe","París",1));
        this.edges.add(new Edge("Dieppe","Londres",2));
        this.edges.add(new Edge("Dieppe","Bruselas",2));
        
        this.edges.add(new Edge("Edimburgo","Londres",4));
        
        this.edges.add(new Edge("Londres","Ámsterdam",2));
        
        this.edges.add(new Edge("Ámsterdam","Bruselas",1));
        this.edges.add(new Edge("Ámsterdam","Frankfurt",2));
        this.edges.add(new Edge("Ámsterdam","Essen",3));
        
        this.edges.add(new Edge("París","Bruselas",2));
        this.edges.add(new Edge("París","Frankfurt",3));
        this.edges.add(new Edge("París","Zurich",6));
        this.edges.add(new Edge("París","Marsella",4));
        
        this.edges.add(new Edge("Bruselas","Frankfurt",2));
        
        this.edges.add(new Edge("Marsella","Roma",8));
        this.edges.add(new Edge("Marsella","Zurich",4));
        
        this.edges.add(new Edge("Copenhague","Essen",3));
        this.edges.add(new Edge("Copenhague","Estocolmo",3));
        
        this.edges.add(new Edge("Essen","Berlín",2));
        this.edges.add(new Edge("Essen","Frankfurt",2));
        
        this.edges.add(new Edge("Zurich","Munich",4));
        this.edges.add(new Edge("Zurich","Venecia",4));
        
        this.edges.add(new Edge("Venecia","Roma",2));
        this.edges.add(new Edge("Venecia","Munich",4));
        this.edges.add(new Edge("Venecia","Zagreb",2));
        
        this.edges.add(new Edge("Frankfurt","Munich",2));
        this.edges.add(new Edge("Frankfurt","Berlín",3));
        
        this.edges.add(new Edge("Roma","Palermo",4));
        this.edges.add(new Edge("Roma","Brindisi",2));
        
        this.edges.add(new Edge("Palermo","Brindisi",3));
        this.edges.add(new Edge("Palermo","Esmirna",6));
        
        this.edges.add(new Edge("Brindisi","Atenas",4));
        
        this.edges.add(new Edge("Munich","Viena",3));
        
        this.edges.add(new Edge("Berlín","Danzig",4));
        this.edges.add(new Edge("Berlín","Varsovia",4));
        this.edges.add(new Edge("Berlín","Viena",3));
        
        this.edges.add(new Edge("Estocolmo","San Petersburgo",16));
        
        this.edges.add(new Edge("Danzig","Riga",3));
        this.edges.add(new Edge("Danzig","Varsovia",2));
        
        this.edges.add(new Edge("Viena","Budapest",1));
        this.edges.add(new Edge("Viena","Zagreb",2));
        this.edges.add(new Edge("Viena","Varsovia",4));
        
        this.edges.add(new Edge("Zagreb","Sarajevo",3));
        this.edges.add(new Edge("Zagreb","Budapest",2));
        
        this.edges.add(new Edge("Sarajevo","Budapest",3));
        this.edges.add(new Edge("Sarajevo","Atenas",4));
        this.edges.add(new Edge("Sarajevo","Sofía",4));
        
        this.edges.add(new Edge("Atenas","Esmirna",2));
        this.edges.add(new Edge("Atenas","Sofía",3));
        
        this.edges.add(new Edge("Esmirna","Estambul",4));
        this.edges.add(new Edge("Esmirna","Ankara",6));
        
        this.edges.add(new Edge("Sofía","Estambul",3));
        this.edges.add(new Edge("Sofía","Bucarest",4));
        
        this.edges.add(new Edge("Budapest","Bucarest",8));
        this.edges.add(new Edge("Budapest","Kiev",12));
        
        this.edges.add(new Edge("Bucarest","Kiev",4));
        this.edges.add(new Edge("Bucarest","Estambul",3));
        this.edges.add(new Edge("Bucarest","Sebastopol",4));
        
        this.edges.add(new Edge("Estambul","Sebastopol",4));
        this.edges.add(new Edge("Estambul","Ankara",4));
        
        this.edges.add(new Edge("Ankara","Erzurum",3));
        
        this.edges.add(new Edge("Erzurum","Sebastopol",4));
        this.edges.add(new Edge("Erzurum","Sochi",6));
        
        this.edges.add(new Edge("Sochi","Sebastopol",2));
        this.edges.add(new Edge("Sochi","Rostov",2));
        
        this.edges.add(new Edge("Sebastopol","Rostov",4));
        
        this.edges.add(new Edge("Rostov","Kharkov",2));
        
        this.edges.add(new Edge("Kharkov","Kiev",4));
        this.edges.add(new Edge("Kharkov","Moscú",4));
        
        this.edges.add(new Edge("Moscú","Smolensk",2));
        this.edges.add(new Edge("Moscú","San Petersburgo",4));
        
        this.edges.add(new Edge("San Petersburgo","Vilna",4));
        this.edges.add(new Edge("San Petersburgo","Riga",4));
        
        this.edges.add(new Edge("Vilna","Kiev",2));
        this.edges.add(new Edge("Vilna","Smolensk",3));
        this.edges.add(new Edge("Vilna","Riga",4));
        this.edges.add(new Edge("Vilna","Varsovia",3));
        
        this.edges.add(new Edge("Kiev","Smolensk",3));
        this.edges.add(new Edge("Kiev","Varsovia",4));
       /* this.edges.add(new Edge("Madrid","Barcelona",2));
        this.edges.add(new Edge("Madrid","Lisboa",3));
        this.edges.add(new Edge("Madrid","Cádiz",3));
        this.edges.add(new Edge("Lisboa","Cádiz",2));
        this.edges.add(new Edge("Pamplona","Barcelona",4));
        this.edges.add(new Edge("Madrid","Pamplona",6));
        this.edges.add(new Edge("Barcelona","Marsella",2));
        this.edges.add(new Edge("Pamplona","Marsella",4));*/


        
        this.fillNodes();
    }
    
    public void fillNodes(){
        for(Edge edge : this.edges){
            if(!this.nodes.contains(edge.getSource())){
                this.nodes.add(edge.getSource());
            }
            if(!this.nodes.contains(edge.getDestination())){
                this.nodes.add(edge.getDestination());
            }
        }
        System.out.println("NODES: "+this.nodes.size());
    }
    
    public void OrdenarAristas(){
        Collections.sort(edges, new EdgeComparator());
    }
    public void OrdenarAristasMayor(){
        Collections.sort(edges, new EdgeComparator());
        Collections.reverse(edges);
    }
    public void imprimir(){
        for(int i = 0; i < edges.size(); i++){
            System.out.println(edges.get(i).getSource()+"----"+edges.get(i).getDestination());
            System.out.println(edges.get(i).getLength());
        }
    }

   
    public void CalcMinSpannigTree(){
        nodos.add(edges.get(0).getDestination());
        nodos.add(edges.get(0).getSource());
        SubsetManager subsetManager = new SubsetManager(nodos);
        //añadimos el primer fragmento de todos
        subsetManager.UpdateSubsetWithEdge(edges.get(0));
        System.out.println("Arista: "+edges.get(0).getSource()+"-----"+edges.get(0).getDestination()+" = "+edges.get(0).getLength());
        for(int i = 0; i < edges.size(); i++){
                if(nodos.contains(edges.get(i).getSource()) || nodos.contains(edges.get(i).getDestination())){   
                    
                        if(!subsetManager.FindSourceAndDestinationInSubsets(edges.get(i))){
                            
                            System.out.println("Arista: "+edges.get(i).getSource()+"-----"+edges.get(i).getDestination()+" = "+edges.get(i).getLength());
                            edgesMin.add(edges.get(i));
                            subsetManager.UpdateSubsetWithEdge(edges.get(i));
                            if(!nodos.contains(edges.get(i).getSource())){
                                nodos.add(edges.get(i).getSource()); 
                            }
                            
                            else if(!nodos.contains(edges.get(i).getDestination())){
                                nodos.add(edges.get(i).getDestination());     
                            }
                            subsetManager.Add(nodos);
                            i= 0;
                        }
                    
                }
                else if(nodos.size() == edges.size()){
                 i = 48;
                }
        } 
        System.out.println("Suma total de las aristas = "+subsetManager.getSuma());
        minimo = subsetManager.getSuma();
        
    }
    public void CalcMinSpannigTreeMax(){
        nodosMax.add(edges.get(0).getDestination());
        nodosMax.add(edges.get(0).getSource());
        SubsetManager subsetManager = new SubsetManager(nodosMax);
        //añadimos el primer fragmento de todos
        subsetManager.UpdateSubsetWithEdge(edges.get(0));
        System.out.println("Arista: "+edges.get(0).getSource()+"-----"+edges.get(0).getDestination()+" = "+edges.get(0).getLength());
        for(int i = 0; i < edges.size(); i++){
                if(nodosMax.contains(edges.get(i).getSource()) || nodosMax.contains(edges.get(i).getDestination())){   
                    
                        if(!subsetManager.FindSourceAndDestinationInSubsets(edges.get(i))){
                            
                            System.out.println("Arista: "+edges.get(i).getSource()+"-----"+edges.get(i).getDestination()+" = "+edges.get(i).getLength());
                            edgesMax.add(edges.get(i));
                            subsetManager.UpdateSubsetWithEdge(edges.get(i));
                            if(!nodosMax.contains(edges.get(i).getSource())){
                                nodosMax.add(edges.get(i).getSource()); 
                            }
                            
                            else if(!nodosMax.contains(edges.get(i).getDestination())){
                                nodosMax.add(edges.get(i).getDestination());     
                            }
                            subsetManager.Add(nodosMax);
                            i= 0;
                        }
                    
                }
                else if(nodosMax.size() == edges.size()){
                 i = 48;
                }
        } 
        System.out.println("Suma total de las aristas = "+subsetManager.getSuma());
        maximo = subsetManager.getSuma();
    }
    public void imprimirNodos(){
        for(int i = 0; i < nodos.size(); i++){
            System.out.println(nodos.get(i));
        }
    }
    public void guardarFichero(){
        try {
            FileWriter fw = new FileWriter("Caminos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            bw.write(""); 
                salida.println("NODES: 47");
                salida.println("\nCamino Mínimo:\n");
                for(int i = 0; i < edgesMin.size(); i++){
                    salida.println("Arista: "+edgesMin.get(i).getSource()+"-----"+edgesMin.get(i).getDestination()+" = "+edgesMin.get(i).getLength());
                    
                }
                salida.println("Total: "+minimo);
                salida.println();
                salida.println("\nCamino Máximo:\n");
                for(int i = 0; i < edgesMax.size(); i++){
                    salida.println("Arista: "+edgesMax.get(i).getSource()+"-----"+edgesMax.get(i).getDestination()+" = "+edgesMax.get(i).getLength());
                    
                }
                salida.println("Total: "+maximo);
                    salida.close();
        }
            catch(java.io.FileNotFoundException fnfex) {
            System.out.println("Archivo no encontrado: " + fnfex);
            }
        catch(java.io.IOException ioex) {
        System.out.println("Excepción de E/S: " + ioex);}
    }
}
        
    

