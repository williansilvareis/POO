/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Mauro Hemerly (Hämmerli) Gazzani <mauro.hemerly@gmail.com>
 */
public class Pessoa {
    //Atributos
    private String nome;
    private String cpf;
    
    //Construtor Default
    public Pessoa() {
        nome = "Luis Alberto";
        cpf = "456.345.798-00";
    }
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // Métodos Getters
    public String getNome() {
        return nome;
    }
    
     public String getCpf() {
        return cpf;
    }
    
     
     // Setters
     public void setNome(String novoNome) {
         nome = novoNome;
     }
     
      public void setCpf(String novoCpf) {
         cpf = novoCpf;
     }
}
