/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dados;

import java.util.List;

/**
 *
 * @author Giovanni
 */
public class Dados implements java.io.Serializable {   
    List<DVD> dvds;
    List<Cliente> clientes;
    List<Estoque> estoque; 
}
