/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;
import java.util.Scanner;
/**
 *
 * @author LINA RAMIREZ
 */
public class FiguraGeo {
    private String figura;
    private double base;
    private double altura;
    private double dM;
    private int nLados;
    
    public FiguraGeo(){
        
    }

    @Override
    public String toString() {
        return "FiguraGeo{" + "figura=" + figura + ", base=" + base + ", altura=" + altura + ", dM=" + dM + ", nLados=" + nLados + '}';
    }
    
    
    public void crearFig(){
        Scanner read = new Scanner (System.in);
        int opt;
        
        do {
            System.out.println("Seleccione la figura que desea calcular");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Circulo");
            System.out.println("5. Hexagono");
            System.out.println("6. Pentagono");
            System.out.println("7. Rombo");
            opt = read.nextInt();

            switch (opt) {
                case 1:
                    figura = "Cuadrado";
                    System.out.println("Escriba el lado del cuadrado");
                    base = read.nextDouble();
                    altura = base;
                    nLados= 4;
                    break;
                case 2:
                    figura = "Rectangulo";
                    System.out.println("Escriba la base del rectangulo");
                    base = read.nextDouble();
                    System.out.println("Escriba la altura del rectangulo");
                    altura = read.nextDouble();
                    nLados= 4;
                    break;
                case 3:
                    figura = "Triangulo";
                    System.out.println("Escriba la base del triangulo");
                    base = read.nextDouble();
                    System.out.println("Escriba la altura del triangulo");
                    altura = read.nextDouble();
                    nLados= 3;
                    break;
                case 4:
                    figura = "Circulo";
                    System.out.println("Escriba el radio del circulo");
                    base = read.nextDouble();
                    
                    nLados= 0;
                    break;
                case 5:
                    figura = "Hexagono";
                    System.out.println("Escriba la longitud del lado del Hexagono");
                    base = read.nextDouble();
                    System.out.println("Escriba la apotema del Hexagono");
                    altura = read.nextDouble();
                    nLados= 6;
                    break;
                case 6:
                    figura = "Pentagono";
                    System.out.println("Escriba la longitud del lado del Pentagono");
                    base = read.nextDouble();
                    System.out.println("Escriba la apotema del Pentagono");
                    altura = read.nextDouble();
                    nLados= 5;
                    break;
                case 7:
                    figura = "Rombo";
                    System.out.println("Escriba la longitud del lado del rombo");
                    base = read.nextDouble();
                    System.out.println("Escriba la diagonal mayor del rombo");
                    altura = read.nextDouble();
                    System.out.println("Escriba la diagonal menor del rombo");
                    dM = read.nextDouble();
                    nLados= 4;
                    break;
                default:
                    System.out.println("Selección equivocada, vuelva a elegir");
            }
            
        } while (opt > 7 || opt < 1);
        
        
    }
    
    public double areaFig(){
        double area = 0;
        switch (figura) {
            case "Cuadrado":
            case "Rectangulo":
                area = base*altura;
                break;
            case "Triangulo":
            case "Pentagono":
            case "Hexagono":
                area = base*altura/2;
                break;
            case "Rombo":
                area = dM*altura/2;
                break;
            case "Circulo":
                area = Math.PI*(Math.pow(base,2));
                break;
            default:
                break;
        }
        return area;
    }
    
    public double perimFig(){
        Scanner read = new Scanner (System.in);
        double perim = nLados*base;
        if (figura.equals("Circulo")){
            perim = 2*Math.PI*base;
        } else if(figura.equals("Triangulo")){
            System.out.println("Indique la longitud del primer lado");
            double L1 = read.nextDouble();
            System.out.println("Indique la longitud del segundo lado");
            double L2 = read.nextDouble();
            System.out.println("Indique la longitud del tercer lado");
            double L3 = read.nextDouble();
            perim = L1 + L2 + L3;
        }else if (figura.equals("Rectangulo")){
            perim = 2*(base+altura);
        }else{
            perim = nLados*base;
        }
        
        return perim;
         
    }
}
