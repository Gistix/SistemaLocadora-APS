/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dados;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
/**
 *
 * @author Giovanni
 */
public class Dados implements java.io.Serializable {   
    HashMap<DVD, Integer> dvds = new HashMap<>();
    List<Cliente> clientes = new ArrayList<Cliente>();
}
