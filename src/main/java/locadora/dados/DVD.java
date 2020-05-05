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
    Classificacao classificacao;
    /*List<Ator> atores;
     
    DVD (int codigo, String titulo, LocalDate dataLancamento, List<Ator> atores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.atores = atores;
    }*/
    
    DVD (/*int codigo,*/ String titulo, LocalDate dataLancamento, Classificacao classificacao) {
        //this.codigo = codigo;
        this.titulo = titulo;
        this.dataLancamento = dataLancamento; 
        this.classificacao = classificacao;
    } 
    
    public void Print () {
        System.out.println("Nome: " + titulo);
        System.out.println("Data de Lançamento: " + dataLancamento);
        System.out.println("Classificação: " + ClassificacaoToString());        
    } 
    
    public String ClassificacaoToString () {
        switch (classificacao) {
            case Livre:
                return "L (Livre para todas as idades).";
            case Proibido10:    
                return "Proibido para menores de 10 anos de idade.";
            case Proibido12:    
                return "Proibido para menores de 12 anos de idade.";
            case Proibido14:    
                return "Proibido para menores de 14 anos de idade.";
            case Proibido16:    
                return "Proibido para menores de 16 anos de idade.";
            case Proibido18:    
                return "Proibido para menores de 18 anos de idade.";
            default:
                return "";
        }
    }
    
    @Override
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 

        if (o == null)
            return false;
 
        if (!(o instanceof DVD))
            return false;        
        
        /*if (!(o instanceof DVD)) { 
            return false; 
        }         if (!(o instanceof DVD)) { 
            return false; 
        }*/
        
        // typecast o to Complex so that we can compare data members  
        DVD d = (DVD) o; 
          
        // Compare the data members and return accordingly  
        return titulo.equals(d.titulo) && dataLancamento.equals(d.dataLancamento); 
    } 

    @Override
    public int hashCode() {
        return Objects.hash(titulo, dataLancamento);
    }    
}
