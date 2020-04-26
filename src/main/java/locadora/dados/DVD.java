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
    String titulo;   
    LocalDate dataLancamento;      
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
    
    public void Print () {
        System.out.println("Nome: " + titulo);
        System.out.println("Data de Lançamento: " + dataLancamento);      
    } 
}
