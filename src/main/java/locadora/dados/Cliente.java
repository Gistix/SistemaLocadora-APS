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
    String endereço;
    String telefone;
    
    List<Locacao> locacoes;
    
    Cliente (String nome, String sobrenome, String cpf, LocalDate dataNascimento, String endereço, String telefone) {   
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;        
        this.dataNascimento = dataNascimento; 
        this.endereço = endereço;
        this.telefone = telefone;  
    }
    
    public void Alugar (List<DVD> dvds, LocalDate dataLocacao) {
        Locacao locacao = new Locacao(dvds, dataLocacao);
        
        if (locacoes == null)
            locacoes = new ArrayList<Locacao>();
        
        if (!locacoes.contains(locacao)) {
            locacoes.add(locacao);
        } else {
            System.out.println("Cliente " + nome + " " + sobrenome + " já alugou o(s) DVD.");  
        }
    }
    
    public void Devolver (List<DVD> dvds, LocalDate dataLocacao) {
        Locacao locacao = new Locacao(dvds, dataLocacao);
        
        if (locacoes.contains(locacao))
            locacoes.remove(locacao);
    }    
}
