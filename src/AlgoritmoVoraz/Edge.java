
package AlgoritmoVoraz;

public class Edge {
    private String source;
    private String destination;
    private int length;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public Edge(){
        this.setSource("");
        this.setDestination("");
        this.setLength(0);
    }
    public Edge(String source, String destination, int length){
        this.setSource(source);
        this.setDestination(destination);
        this.setLength(length);
    }
}
