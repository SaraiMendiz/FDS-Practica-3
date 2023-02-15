
package AlgoritmoVoraz;

import java.util.Comparator;

//para ordenar las aristas
public class EdgeComparator implements Comparator<Edge>{
    public int compare(Edge edge1, Edge edge2){
        if(edge1.getLength() == edge2.getLength())
            return 0;
        else if(edge1.getLength() > edge2.getLength())
            return 1;
        else
            return -1;
    }
}
