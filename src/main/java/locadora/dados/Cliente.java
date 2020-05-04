/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dados;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Giovanni
 */
public class Cliente implements java.io.Serializable {
    String nome;
    String sobrenome;
    String cpf;
    LocalDate dataNascimento;
    Endereco endereço;
    String telefone;
    
    Locacao locacao;

    Cliente (String nome, String sobrenome, String cpf, LocalDate dataNascimento, Endereco endereço, String telefone) {   
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;        
        this.dataNascimento = dataNascimento; 
        this.endereço = endereço;
        this.telefone = telefone;  
    }
    
    public void Alugar (List<DVD> dvds, LocalDate dataLocacao) {
        if (locacao == null)
            this.locacao = new Locacao(dvds, dataLocacao); 
    }
    
    public void Devolver (List<DVD> dvds, LocalDate dataLocacao) {
        if (locacao == new Locacao(dvds, dataLocacao))
            locacao = null;
    }   
    
    
    public void Print () {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("CPF: " + cpf); 
        System.out.println("Data de Nascimento: " + dataNascimento); 
        System.out.println("Endereço: "); 
        endereço.Print();       
        System.out.println("Telefone: " + telefone);      
    }      
}
