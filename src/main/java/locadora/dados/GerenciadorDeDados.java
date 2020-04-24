/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dados;

import java.util.List;        
import java.io.*;
import java.time.LocalDate; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giovanni
 */
public class GerenciadorDeDados {
    Dados dados = new Dados();
    
    LocalDate Data () {
        return LocalDate.now();
    }
    
    int GerarCodigo (List<Integer> codigos) {
        if (codigos == null || codigos.isEmpty())
            return 0;
        
        List<Integer> ordenada = new ArrayList<>(codigos);
                
        Collections.sort(ordenada); 
        
        int maior = ordenada.get(ordenada.size() - 1); 

        for (int i = 0; i < maior+1; i++) {
            if (!codigos.contains(i)) {
                return i;
            }
        }
        
        return 0;
    }
 
    /*** Estoque ***/    
    /**
    * Cria uma lista com a todos os codigos dos estoques cadastrados.
    */
    List<Integer> CodigosEstoque () { // C
        List<Integer> codigos = new ArrayList<>();
        
        for(Estoque estoque : dados.estoque) {
            codigos.add(estoque.getCodigo());
        }
        
        return codigos;
    }   
     
    /**
    * Procura e retorna a instância de estoque que possui tal dvd.
    */    
    private Estoque ProcurarEstoque (DVD dvd){
        for (Estoque estoque : dados.estoque) {
            if (dvd == estoque.getDvd())
                return estoque;
        }
        
        return null;
    }   
    
    public void AdicionarEstoque (DVD dvd, int quantidade){ 
        Estoque estoque = ProcurarEstoque(dvd); // Procura qual instancia do Estoque é referente a este DVD
            
        if (estoque == null)  {
            int codigo = GerarCodigo(CodigosEstoque()); // Gera um menor codigo novo possível
            
            dados.estoque.add(new Estoque(codigo, dvd, quantidade));
        } else
            estoque.AdicionarQuantidade(quantidade);    
    }    
    
    /*** DVD ***/
    
    public void CadastrarDVD (String titulo, LocalDate dataLancamento, int quantidade){ 
        DVD dvd = new DVD (titulo, dataLancamento);
        
        if (!dados.dvds.contains(dvd)) {
            dados.dvds.add(dvd);
        } else {
            // O DVD já existe, nesse caso vamos a dicionar ao estoque (ao invez de 1, teremos 2 disponíveis)
        }
        
        AdicionarEstoque(dvd, quantidade);
    }

    /*** Cliente ***/
    
    public void CadastrarCliente (String nome, String sobrenome, String cpf, LocalDate dataNascimento, String endereço, String telefone){ 
        Cliente cliente = new Cliente(nome, sobrenome, cpf, dataNascimento, endereço, telefone);
        
        if (!dados.clientes.contains(cliente)) {
            dados.clientes.add(cliente);
        } else {
            System.out.println("Cliente " + cliente.nome + " " + cliente.sobrenome + " já cadastrado no sistema.");      
        }
    }
    
    public void ClienteAluga (Cliente cliente, List<DVD> dvds, LocalDate dataLocacao) {
        cliente.Alugar(dvds, dataLocacao);    
    }
 
    public void ClienteDevolve (Cliente cliente, List<DVD> dvds, LocalDate dataLocacao) {
        cliente.Devolver(dvds, dataLocacao);      
    }    
    
    public void Abrir() {
        try {
            FileInputStream fileIn = new FileInputStream("dados.bin");
            ObjectInputStream in = new ObjectInputStream(fileIn);
           
            try {  
                dados = (Dados) in.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GerenciadorDeDados.class.getName()).log(Level.SEVERE, null, ex);
            }
             
           in.close();
           
           fileIn.close();
           System.out.printf("Dados foram carregados de dados.bin");
        } catch (IOException ioExecept) {
           ioExecept.printStackTrace();
        }        
    }
    
    public void Salvar() {
        try {
           FileOutputStream fileOut = new FileOutputStream("dados.bin");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           
           out.writeObject(dados);
           out.close();
           
           fileOut.close();
           System.out.printf("Dados foram salvos em dados.bin");
        } catch (IOException ioExecept) {
           ioExecept.printStackTrace();
        }        
    }
}
