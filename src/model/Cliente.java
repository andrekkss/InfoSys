/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.ClienteDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import util.Checa;

/**
 *
 * @author linux
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String cpf;
    private String fone;
    private String celular;
    private String email;

    public Cliente(String nome, String cpf, String fone, String celular, String email) {
        setNome(nome);
        setCpf(cpf);
        setFone(fone);
        setCelular(celular);
        setEmail(email);
    }
    
    public Cliente(int codigo, String nome, String cpf, String fone, String celular, String email) {
        this.codigo = codigo;
        setNome(nome);
        setCpf(cpf);
        setFone(fone);
        setCelular(celular);
        setEmail(email);
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    
    private void setCodigo(int codigo){
        this.codigo = codigo;
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
        if (!Checa.nome(nome)) throw new RuntimeException("Nome inválido.");
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public void gravar(){
        ClienteDAO.getInstance().insert(this);
    }
 
    public static DefaultTableModel getTableModel(){
        List<Cliente> lista = ClienteDAO.getInstance().select();  
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Telefone");
        modelo.addColumn("Celular");
        modelo.addColumn("Email");
        for (Cliente c: lista){
            String[] s = {c.getNome(), c.getFone(), c.getCelular(), c.getEmail(), c.getCpf()};
            modelo.addRow(s);
        }
        return modelo;
    }
    
    public String toString() {
        String ret;
        ret = "Nome....: [" + getNome() +
              "]\nCPF.....: [" + getCpf() +
              "]\nTelefone: [" + getFone() +
              "]\nCelular.: [" + getCelular() +
              "]\nEmail...: [" + getEmail() +
              "]";
        return ret;
     }
    
    
}
