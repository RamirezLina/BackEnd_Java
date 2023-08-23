class Main {
  public static void main(String[] args) {
    BarajaServ bs = new BarajaServ();
    System.out.println("Bienvenido a un nuevo juego de cartas");
    System.out.println();
    Baraja baraja = new Baraja();
    Baraja hanSalido = new Baraja();
    
    System.out.println("Baraja completa");
    bs.crearBaraja(baraja);
    System.out.println(baraja);

    System.out.println();
    System.out.println("Baraja mezclada...");
    bs.barajar(baraja);
    
    System.out.println("");
    bs.darCartas(baraja, hanSalido);
    System.out.println();

    
    bs.cartasDisponibles(baraja);

    System.out.println("Han salido las siguientes cartas");
    bs.cartasMonton(hanSalido);
    System.out.println();
    
    bs.darCartas(baraja, hanSalido);
    System.out.println();
    
    bs.cartasDisponibles(baraja);
    System.out.println("Las cartas disponibles son:");
    bs.mostrarBaraja(baraja);
    
  }
}