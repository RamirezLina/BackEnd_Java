import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class BarajaServ{
  BarajaServ(){
    
  }

  public void crearBaraja (Baraja baraja){
    
    ArrayList<Carta> cartas = new ArrayList();
    ArrayList<String>palos = new ArrayList();
    palos.add("Espadas");
    palos.add("Bastos");
    palos.add("Oros");
    palos.add("Copas");
    
    for (int i = 0; i < 4; i++) {

      for (int j = 1; j < 11; j++) {
        if (j<8) {
          Carta c = new Carta();
          c.setnum(j);
          c.setpalo(palos.get(i));
          cartas.add(c);
        }else{
          Carta c = new Carta();
          c.setnum(j+2);
          c.setpalo(palos.get(i));
          cartas.add(c);
        }
        
      } 
        
    }
    baraja.setbaraja(cartas);
      
  }

  public void barajar(Baraja b){
    Collections.shuffle(b.getbaraja());
  }

  public void siguienteCarta(Baraja b, Baraja salido){
    if (b.getbaraja().size()==0) {
      System.out.println("No hay más cartas para devolver");
      
    }if (b.getbaraja().size()==1) {
      
      salido.getbaraja().add(b.getbaraja().get(0));
      b.getbaraja().remove(0);
      
      System.out.println("Esta era la última carta, no hay más cartas en la baraja");
      
    } else {
      
      salido.getbaraja().add(b.getbaraja().get(0));
      b.getbaraja().remove(0);
      
    }
    
  }

  public void cartasDisponibles(Baraja b){
    System.out.println("Quedan "+b.getbaraja().size()+" cartas disponibles por repartir.");
    System.out.println();
  }

  public void darCartas(Baraja b, Baraja bs){
    Scanner read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n"); 
    System.out.println("Cuantas cartas desea pedir?");
    int numCartas = read.nextInt();
    for (int i = 0; i < numCartas; i++) {
      siguienteCarta(b, bs);
    }
    System.out.println("Se han repartido "+numCartas+" carta(s)");
    
  
    
  }

  public void cartasMonton(Baraja bs){

    if (bs.getbaraja().size()==0) {
      System.out.println("No ha salido ninguna carta");
    } else{
      for (int i = 0; i < bs.getbaraja().size(); i++) {
        System.out.println(bs.getbaraja().get(i)); 
      }
    } 
      
  }

  public void mostrarBaraja(Baraja b){

    if (b.getbaraja().size()==0) {
      System.out.println("Ya no quedan cartas");
    } else{
      for (int i = 0; i < b.getbaraja().size(); i++) {
        System.out.println(b.getbaraja().get(i)); 
      }
    } 
      
  }

  


  
}

    
  



  
