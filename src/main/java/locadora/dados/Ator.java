/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dados;

import java.time.LocalDate;    
        
/**
 *
 * @author Giovanni
 */
public class Ator implements java.io.Serializable {
    int codigo;
    String nome;
    LocalDate dataNascimento;
  
    Ator (int codigo, String titulo, LocalDate dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;     
    }    
}
