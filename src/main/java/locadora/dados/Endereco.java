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
public class Endereco implements java.io.Serializable {
    public String logradouro;
    public int numero;
    public String complemento;
    public String cidade;
    public String bairro;
    public String cep;

    public Endereco (String logradouro, int numero, String complemento, String cidade, String bairro, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;        
    }

    public void Print () {
        System.out.println("Endereço: " + logradouro + ", " + numero);
        
        if (!complemento.equals(""))
            System.out.println("Complemento: " + complemento); 
        
        System.out.println("Cidade: " + cidade);
        
        if (!bairro.equals(""))
            System.out.println("Bairro: " + bairro); 
                
        System.out.println("cep: " + cep);      
    }     
}
