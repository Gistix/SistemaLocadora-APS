/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import locadora.dados.*;
import locadora.ui.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Giovanni
 */
public class Main {
    static GerenciadorDeDados gerenciadorDeDados = new GerenciadorDeDados();
    static InterfaceInicio interfaceInicio;
    
    public static void main(String[] args) {
        // A idéia é todo o código rolar aqui, dai a gente abre as janelas por aqui
        gerenciadorDeDados.CadastrarCliente("Giovanni", "Correia", "999.999.999-91", gerenciadorDeDados.Data(), 
                new Endereco("logadouro", 1, "", "Quase Sertãozinho", "", "14000-000"), "99999-9999");   
        
        gerenciadorDeDados.CadastrarCliente("Marco", "Cornazieri", "999.999.999-92", gerenciadorDeDados.Data(), 
                new Endereco("logadouro", 2, "", "Terra do galizé", "", "00000-000"), "99999-9999");
        
        gerenciadorDeDados.CadastrarCliente("Serafim", "Francisco", "999.999.999-93", gerenciadorDeDados.Data(), 
                new Endereco("logadouro", 3, "", "Jaboticabalândia", "", "00000-000"), "99999-9999");
        
        //gerenciadorDeDados.Salvar();
        
        //gerenciadorDeDados.Abrir();
        
        gerenciadorDeDados.CadastrarDVD("Matrix", LocalDate.of(1999, 5, 21), 3);    
        gerenciadorDeDados.CadastrarDVD("Matrix", LocalDate.of(1999, 5, 21), 1);         
        gerenciadorDeDados.CadastrarDVD("Mad Max: Estrada da Fúria", LocalDate.of(2015, 05, 14), 2);
        gerenciadorDeDados.CadastrarDVD("Shrek", LocalDate.of(2001, 6, 22), 1); 
        gerenciadorDeDados.CadastrarDVD("V de Vingança", LocalDate.of(2005, 4, 7), 1);         
        gerenciadorDeDados.CadastrarDVD("Eu, Robo", LocalDate.of(2004, 8, 6), 2); 
        gerenciadorDeDados.CadastrarDVD("Exterminador do Futuro 2: O Julgamento Final", LocalDate.of(1991, 8, 30), 2);
        gerenciadorDeDados.CadastrarDVD("Interstellar", LocalDate.of(2014, 11, 6), 2);
        gerenciadorDeDados.CadastrarDVD("Os Incríveis", LocalDate.of(2004, 12, 10), 1); 
        gerenciadorDeDados.CadastrarDVD("Toy Story", LocalDate.of(1995, 12, 22), 1);        
        //gerenciadorDeDados.PrintClientes();
        gerenciadorDeDados.PrintDVDs();
        
        // Mudar o tema
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf"); // FlatLightLaf
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        //com.formdev.flatlaf.FlatLaf.updateUI();        
        
        interfaceInicio = new InterfaceInicio();
        interfaceInicio.setLocationRelativeTo(null);
        interfaceInicio.setVisible(true);            
        
        interfaceInicio.AtualizarListaClientes(gerenciadorDeDados.TabelarClientes());
        interfaceInicio.AtualizarListaFilmes(gerenciadorDeDados.TabelarDVDs());        
    }
    
    public static void BotaoNovo (int aba) {
        if (aba == 0) {
            DialogoAddCliente dialogoAddCliente = new DialogoAddCliente(interfaceInicio, true);
            dialogoAddCliente.setLocationRelativeTo(interfaceInicio);
            dialogoAddCliente.setVisible(true);
        } else {           
            DialogoAddFilme dialogoAddFilme = new DialogoAddFilme(interfaceInicio, true);
            dialogoAddFilme.setLocationRelativeTo(interfaceInicio);
            dialogoAddFilme.setVisible(true);           
        }
    }
    
    public static void BotaoExcluir (int aba, JTable tabelaClientes, JTable tabelaFilmes) {
        if (aba == 0) {
            int row = tabelaClientes.convertRowIndexToModel(tabelaClientes.getSelectedRow());
            String cpf = tabelaClientes.getModel().getValueAt(row, 1).toString();
            
            gerenciadorDeDados.RemoverCliente(cpf);
            
            interfaceInicio.AtualizarListaClientes(gerenciadorDeDados.TabelarClientes());
        } else {  
            int row = tabelaFilmes.convertRowIndexToModel(tabelaFilmes.getSelectedRow());           
            String nome = tabelaFilmes.getModel().getValueAt(row, 0).toString();  
            
            gerenciadorDeDados.RemoverDVD(nome);
            
            interfaceInicio.AtualizarListaFilmes(gerenciadorDeDados.TabelarDVDs());  
        }
    }
    
    public static boolean NovoCliente (String nome, String sobrenome, String cpf, LocalDate dataNascimento, Endereco endereco, String telefone) {
        gerenciadorDeDados.CadastrarCliente(nome, sobrenome, cpf, dataNascimento, endereco, telefone);
        return true;
    }    
}
