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
public class Torniquete {
    
    private int idTorniquete;
    private int numeroPersonas;

    public Torniquete(int idTorniquete, int numeroPersonas) {
        this.idTorniquete = idTorniquete;
        this.numeroPersonas = numeroPersonas;
    }

    public int cuentaPersonas(){
        return 0;
    }
    
    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    
    
}
