/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dados;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;
        
/**
 *
 * @author Giovanni
 */
public class DVD implements java.io.Serializable {
    //private int codigo;
    private String titulo;   
    private LocalDate dataLancamento;      
    /*List<Ator> atores;
     
    DVD (int codigo, String titulo, LocalDate dataLancamento, List<Ator> atores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.atores = atores;       
    }*/
    
    DVD (/*int codigo,*/ String titulo, LocalDate dataLancamento) {
        //this.codigo = codigo;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento; 
    }  
    
    /*@Override
    public boolean equals(final Object o) {     
        if (o == null || getClass() != o.getClass()) 
            return false;
 
        if (this == o)
            return true;
        
        DVD dvd = (DVD) o;
        return (getTitulo() == dvd.getTitulo()) && (getDataLancamento() == dvd.getDataLancamento());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getDataLancamento());
    }*/

    /**
     * @return the codigo
     */
    /*public int getCodigo() {
        return codigo;
    }*/

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the dataLancamento
     */
    public LocalDate getDataLancamento() {
        return dataLancamento;
    }
}
