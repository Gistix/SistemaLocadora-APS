/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dados;

/**
 *
 * @author Giovanni
 */
public class Estoque implements java.io.Serializable {
    private int codigo;
    private DVD dvd;
    private int quantidade;
    
    Estoque (int codigo, DVD dvd, int quantidade) {
        this.codigo = codigo;        
        this.dvd = dvd;
        this.quantidade = quantidade;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }    
    
    /**
     * @return the dvd
     */
    public DVD getDvd() {
        return dvd;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    
    public void AdicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
}
