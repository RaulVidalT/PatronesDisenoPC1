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
public class MontanaRusa extends Atracción{
    
    private List<Vagon> listaVagones;

    public MontanaRusa(List<Vagon> listaVagones, int idAtracción, String calle, String Nombre, int numeroAveriasPendientes) {
        super(idAtracción, calle, Nombre, numeroAveriasPendientes);
    }

    public List<Vagon> getListaVagones() {
        return listaVagones;
    }

    public void setListaVagones(List<Vagon> listaVagones) {
        this.listaVagones = listaVagones;
    }
    
    
    
    
    
    
    
    
}
