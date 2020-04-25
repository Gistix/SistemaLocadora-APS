/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Giovanni
 */
public class Dados implements java.io.Serializable {   
    List<DVD> dvds = new ArrayList<DVD>();
    List<Cliente> clientes = new ArrayList<Cliente>();
    List<Estoque> estoque = new ArrayList<Estoque>();
}
