/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author linux
 */
public class Tecnico {
    private String nome;
    private double vlhora;
    private double salario;
    
    public Tecnico(String nome, double vlhora, double salario) {
        setNome(nome);
        setVlhora(vlhora);
        setSalario(salario);
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
     * @return the vlhora
     */
    public double getVlhora() {
        return vlhora;
    }

    /**
     * @param vlhora the vlhora to set
     */
    public void setVlhora(double vlhora) {
        this.vlhora = vlhora;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return ("Técnico: " + getNome() + 
                "  Valor Venda: " + getVlhora() +
                "  Custo Mensal: " + getSalario());
    }
}
