/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;
import java.time.LocalDate;
import locadora.dados.*;
/**
 *
 * @author Giovanni
 */
public class Main {
    static GerenciadorDeDados gerenciadorDeDados = new GerenciadorDeDados();
    
    public static void main(String[] args) {
        // A idéia é todo o código rolar aqui, dai a gente abre as janelas por aqui
        gerenciadorDeDados.CadastrarCliente("Giovanni", "Correia", "999.999.999-99", gerenciadorDeDados.Data(), "Quase Sertãozinho, SP", "99999-9999");        
        gerenciadorDeDados.CadastrarCliente("Marco", "Cornazieri", "999.999.999-99", gerenciadorDeDados.Data(), "Terra do Galizé, SP", "99999-9999");
        gerenciadorDeDados.CadastrarCliente("Serafim", "Francisco", "999.999.999-99", gerenciadorDeDados.Data(), "Jaboticabalandia, SP", "99999-9999");
        
        gerenciadorDeDados.PrintClientes();
    }
}
