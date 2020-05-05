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
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giovanni
 */
public class GerenciadorDeDados {
    Dados dados = new Dados();
    
    public LocalDate Data () {
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
    
    /*** DVD ***/   
    public void CadastrarDVD (String titulo, LocalDate dataLancamento, Classificacao classificacao, int quantidade){ 
        DVD dvd = new DVD (titulo, dataLancamento, classificacao);
        
        if (!dados.dvds.containsKey(dvd)) {
            dados.dvds.put(dvd, quantidade);
        } else {
            dados.dvds.replace(dvd, dados.dvds.get(dvd) + quantidade);
        }
    }

    public void RemoverDVD (String nome) {
        for(Map.Entry<DVD, Integer> dvdMap : dados.dvds.entrySet()) {
            DVD dvd = dvdMap.getKey();
            
            if (dvd.titulo.equals(nome)) {
                dados.dvds.remove(dvd, dvdMap.getValue());
                return;
            }
        }
    }    
 
    public void RemoverUmDVD (String nome) {        
        for(Map.Entry<DVD, Integer> dvdMap : dados.dvds.entrySet()) {
            DVD dvd = dvdMap.getKey();
             
            if (dvd.titulo.equals(nome)) {
                dados.dvds.replace(dvd, dvdMap.getValue() - 1);
                return;
            }
        }
    }      
    
    public Object[][] TabelarDVDs () {
        HashMap<DVD, Integer> dvds = dados.dvds; 
        
        Object[][] tabela = new Object[dvds.size()][];
        
        int i = 0;
        
         for(Map.Entry<DVD, Integer> dvdMap : dvds.entrySet()) {
            DVD dvd = dvdMap.getKey();
            int quantidade = dvdMap.getValue();
            
            tabela[i] = new Object[] {dvd.titulo, dvd.dataLancamento, quantidade};
            i++;
        }
        
        return tabela;
    }   
    
    public void PrintDVDs () {
        System.out.println("DVDs:");
        
        for(Map.Entry<DVD, Integer> dvd : dados.dvds.entrySet()) {
            dvd.getKey().Print();
            System.out.println("Quantidade: " + dvd.getValue());            
            System.out.println("");
        }
    }
    
    /*** Cliente ***/   
    public void CadastrarCliente (String nome, String sobrenome, String cpf, LocalDate dataNascimento, Endereco endereco, String telefone){ 
        Cliente cliente = new Cliente(nome, sobrenome, cpf, dataNascimento, endereco, telefone);
        
        if (!dados.clientes.contains(cliente)) {
            dados.clientes.add(cliente);
        } else {
            System.out.println("Cliente " + cliente.nome + " " + cliente.sobrenome + " já cadastrado no sistema.");      
        }
    }
    
    public Cliente ProcurarClienteNome (String nome) {
        for(Cliente cliente : dados.clientes) {
            if (cliente.nome.equals(nome))
                return cliente;
        }
        
        return null;
    }

    public Cliente ProcurarClienteCPF (String cpf) {
        for(Cliente cliente : dados.clientes) {
            if (cliente.cpf.equals(cpf))
                return cliente;
        }
        
        return null;        
    }
    
    public void RemoverCliente (Cliente cliente) {
        for(Cliente cliente2 : dados.clientes) {
            if (cliente2.equals(cliente)) {
                dados.clientes.remove(cliente);
                return;
            }
        }        
    }

    public void RemoverCliente (String cpf) {
        for(Cliente cliente : dados.clientes) {
            if (cliente.cpf.equals(cpf)) {
                dados.clientes.remove(cliente);
                return;
            }
        }
    }
    
    /*public void ClienteAluga (Cliente cliente, List<DVD> dvds, LocalDate dataLocacao) {
        cliente.Alugar(dvds, dataLocacao);    
    }
 
    public void ClienteDevolve (Cliente cliente, List<DVD> dvds, LocalDate dataLocacao) {
        cliente.Devolver(dvds, dataLocacao);      
    }*/

    public Object[][] TabelarClientes () {
        List<Cliente> clientes = dados.clientes; 
        
        Object[][] tabela = new Object[clientes.size()][];
        
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            tabela[i] = new Object[] {cliente.nome + " " + cliente.sobrenome, cliente.cpf, "teste"};
        }
        
        return tabela;
    }       
    
    public List<String> ListarClientes () {
        List<String> nomes = new ArrayList<String>();
        
        for(Cliente cliente : dados.clientes) {
            nomes.add(cliente.nome);
        }
        
        return nomes;
    }      
    
    public void PrintClientes () {
        System.out.println("Clientes:");
        
        for(Cliente cliente : dados.clientes) {
            cliente.Print();
            System.out.println("");
        }
    }    
    
    /*** Dados ***/
    
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
