package br.com.guilherme.java.io.test;

import java.io.Serializable;

/**
 * Teste de javadoc
 * 
 * @author Guilherme Terriaga
 * @version 1.0
 * 
 */
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String cpf;
    private String profissao;

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


}
