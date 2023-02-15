
package fds3;

import AlgoritmoVoraz.TicketToRide;

public class FDS3 {

    public static void main(String[] args) {
        TicketToRide ticketToRide = new TicketToRide();
        System.out.println("Camino Mínimo");
        ticketToRide.LoadEuropeMap();
        ticketToRide.OrdenarAristas(); //para minimo
       // ticketToRide.imprimir();
        ticketToRide.CalcMinSpannigTree();
        //ticketToRide.imprimirNodos();
        System.out.println();
        System.out.println("Camino Máximo");
         ticketToRide.OrdenarAristasMayor(); //para maximo
         ticketToRide.CalcMinSpannigTreeMax();
        //ticketToRide.imprimirNodos();
        ticketToRide.guardarFichero();
    }
    
}
