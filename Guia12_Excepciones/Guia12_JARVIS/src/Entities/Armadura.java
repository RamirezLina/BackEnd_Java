/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author LINA RAMIREZ
 */
public class Armadura {
    protected String colorPrimario;
    protected String colorSecundario;
    protected double botasEnergia;
    protected double guantesEnergia;
    protected double consolaEnergia;
    protected double sintetizadorEnergia;
    protected double generadorEnergia;
    protected int resistencia;
    protected int nivelSalud;

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, double botasEnergia, double guantesEnergia, double consolaEnergia, double sintetizadorEnergia, double generadorEnergia, int resistencia, int nivelSalud) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.botasEnergia = botasEnergia;
        this.guantesEnergia = guantesEnergia;
        this.consolaEnergia = consolaEnergia;
        this.sintetizadorEnergia = sintetizadorEnergia;
        this.generadorEnergia = generadorEnergia;
        this.resistencia = resistencia;
        this.nivelSalud = nivelSalud;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public double getBotasEnergia() {
        return botasEnergia;
    }

    public double getGuantesEnergia() {
        return guantesEnergia;
    }

    public double getConsolaEnergia() {
        return consolaEnergia;
    }

    public double getSintetizadorEnergia() {
        return sintetizadorEnergia;
    }

    public double getGeneradorEnergia() {
        return generadorEnergia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public void setBotasEnergia(double botasEnergia) {
        this.botasEnergia = botasEnergia;
    }

    public void setGuantesEnergia(double guantesEnergia) {
        this.guantesEnergia = guantesEnergia;
    }

    public void setConsolaEnergia(double consolaEnergia) {
        this.consolaEnergia = consolaEnergia;
    }

    public void setSintetizadorEnergia(double sintetizadorEnergia) {
        this.sintetizadorEnergia = sintetizadorEnergia;
    }

    public void setGeneradorEnergia(double generadorEnergia) {
        this.generadorEnergia = generadorEnergia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }
    
    public void crearArmadura (String colorPrimario, String colorSecundario, double botasEnergia, double guantesEnergia, double consolaEnergia, double sintetizadorEnergia, double generadorEnergia, int resistencia, int nivelSalud) throws ArmaduraEx {
        try{
            if ( nivelSalud>100 || nivelSalud<0) {
                throw new ArmaduraEx("El valor de nivel de salud indicado está fuera del rango de 0 - 100");
            }
            setColorPrimario(colorPrimario);
            setColorSecundario(colorSecundario);
            setBotasEnergia(botasEnergia);
            setGuantesEnergia(guantesEnergia);
            setConsolaEnergia(consolaEnergia);
            setSintetizadorEnergia(sintetizadorEnergia);
            setGeneradorEnergia(generadorEnergia);
            setResistencia(resistencia);
            setNivelSalud(nivelSalud);
            
            
        } catch (ArmaduraEx e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            throw new ArmaduraEx("El valor ingresado no es un número");
            
        }
        
            
        
    }
    
}
