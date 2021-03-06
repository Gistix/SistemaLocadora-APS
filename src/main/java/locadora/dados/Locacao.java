/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dados;
        
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Giovanni
 */
public class Locacao implements java.io.Serializable {   
    private List<DVD> dvds;
    private LocalDate dataLocacao;
    
    public static int tempoMax = 7;
    public static int quantidadeMax = 3;
    
    Locacao (List<DVD> dvds, LocalDate dataLocacao) {
        this.dvds = dvds;
        this.dataLocacao = dataLocacao;       
    }

    /**
     * @return the dvds
     */
    public List<DVD> GetDvds() {
        return dvds;
    }

    public LocalDate DataLocacao() {
        return dataLocacao;
    }
    
    public String ToString() {
        String string = "";
        
        int count = dvds.size();
        
        for (int i = 0; i < dvds.size(); i++) {
            DVD dvd = dvds.get(i);
            
            String titulo = dvd.titulo;
            
            if (i == 0)
                string += titulo;
            else if (count > 1 && i == count-1)
                string += " e " + titulo;
            else
                string += ", " + titulo;
        }
        
        return string;
    }
}
