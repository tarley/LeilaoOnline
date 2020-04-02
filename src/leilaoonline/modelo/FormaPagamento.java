/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilaoonline.modelo;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Tarley
 */
public class FormaPagamento {
 
    private String nome;
    private String numero;
    private Calendar criadoEm;

    @Override
    public String toString() {
        return "FormaPagamento{" + "nome=" + nome + ", numero=" + numero + '}';
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the criadoEm
     */
    public Calendar getCriadoEm() {
        return criadoEm;
    }

    /**
     * @param criadoEm the criadoEm to set
     */
    public void setCriadoEm(Calendar criadoEm) {
        this.criadoEm = criadoEm;
    }
    
    
}
