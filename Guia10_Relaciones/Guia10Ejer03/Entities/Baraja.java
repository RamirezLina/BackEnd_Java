import java.util.ArrayList;

class Baraja{
  private ArrayList<Carta> baraja;


  Baraja(){
    this.baraja = new ArrayList();
  }
  public ArrayList<Carta> getbaraja(){
    return baraja;

  }

  

  public void setbaraja(ArrayList<Carta> baraja){
    this.baraja=baraja;
  }

  

  @Override
  public String toString(){
    return "Baraja" + baraja;
      
  }

  
}