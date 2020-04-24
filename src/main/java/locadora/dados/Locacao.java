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
    
    Locacao (List<DVD> dvds, LocalDate dataLocacao) {
        this.dvds = dvds;
        this.dataLocacao = dataLocacao;       
    }

    /**
     * @return the dvds
     */
    public List<DVD> getDvds() {
        return dvds;
    }

    /**
     * @return the dataLocacao
     */
    public LocalDate getDataLocacao() {
        return dataLocacao;
    }
}
