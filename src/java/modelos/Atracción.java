package modelos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raul
 */
public class Atracción {
    
    private int idAtracción;
    private String calle;
    private String Nombre;
    private int numeroAveriasPendientes;
    
    public void anularAveriaPendiente(){
        
    }
    
    public void registrarAveriaPendiente(){
        
    }

    public Atracción(int idAtracción, String calle, String Nombre, int numeroAveriasPendientes) {
        this.idAtracción = idAtracción;
        this.calle = calle;
        this.Nombre = Nombre;
        this.numeroAveriasPendientes = numeroAveriasPendientes;
    }

    public int getIdAtracción() {
        return idAtracción;
    }

    public void setIdAtracción(int idAtracción) {
        this.idAtracción = idAtracción;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroAveriasPendientes() {
        return numeroAveriasPendientes;
    }

    public void setNumeroAveriasPendientes(int numeroAveriasPendientes) {
        this.numeroAveriasPendientes = numeroAveriasPendientes;
    }
    
    
    
}
