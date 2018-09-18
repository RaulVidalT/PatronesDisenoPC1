package modelos;


import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raul
 */
public class Noria extends Atracción{
   
    private List<Vehiculo> listavehiculos;

    public Noria(List<Vehiculo> listavehiculos, int idAtracción, String calle, String Nombre, int numeroAveriasPendientes) {
        super(idAtracción, calle, Nombre, numeroAveriasPendientes);
        this.listavehiculos = listavehiculos;
    }

    public List<Vehiculo> getListavehiculos() {
        return listavehiculos;
    }

    public void setListavehiculos(List<Vehiculo> listavehiculos) {
        this.listavehiculos = listavehiculos;
    }
    
    
    
}
