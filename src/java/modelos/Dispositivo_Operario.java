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
public class Dispositivo_Operario {
    
    private String CedulaOperario;
    private String nombreOperario;
    private boolean operarioLibre;

    public Dispositivo_Operario(String CedulaOperario, String nombreOperario, boolean operarioLibre) {
        this.CedulaOperario = CedulaOperario;
        this.nombreOperario = nombreOperario;
        this.operarioLibre = operarioLibre;
    }

    public void indicarFinRevision(){
        
    }
    
    public void indicarOcupado(){
        
    }
    
    public String getCedulaOperario() {
        return CedulaOperario;
    }

    public void setCedulaOperario(String CedulaOperario) {
        this.CedulaOperario = CedulaOperario;
    }

    public String getNombreOperario() {
        return nombreOperario;
    }

    public void setNombreOperario(String nombreOperario) {
        this.nombreOperario = nombreOperario;
    }

    public boolean isOperarioLibre() {
        return operarioLibre;
    }

    public void setOperarioLibre(boolean operarioLibre) {
        this.operarioLibre = operarioLibre;
    }
    
    
    
    
}
