/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dados;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Map;
import locadora.Main;

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
        if (locacao == null) {
            for (DVD dvd : dvds) {
                Map.Entry<DVD, Integer> dvdEntry = Main.GetDVD(dvd.titulo);
                dvdEntry.setValue(dvdEntry.getValue() - 1);
            }
            
            this.locacao = new Locacao(dvds, dataLocacao); 
        }
    }

    public void Devolver () {
        if (locacao != null) {
            for (DVD dvd : locacao.GetDvds()) {
                Map.Entry<DVD, Integer> dvdEntry = Main.GetDVD(dvd.titulo);
                dvdEntry.setValue(dvdEntry.getValue() + 1);
            }
            
            locacao = null;
        }
    }  
    
    public String Nome () {
        return nome;
    }

    public String CPF () {
        return cpf;
    }    
    
    public Locacao Locacao() {
        return locacao;
    }        
    
    public String Estado () {
        if (locacao != null) {
            long dias = DAYS.between(locacao.DataLocacao(), LocalDate.now());
            
            if (dias > Locacao.tempoMax)
                return "Atrasado (" + (dias - Locacao.tempoMax) + " dias)";
            else
                return "Pendente (" + (Locacao.tempoMax - dias) + " dias restantes)"; 
        }
        
        return "Sem pendências";
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
