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
public class Produto {
    
    private String descricao;
    private double vlcusto;
    private double vlvenda;
    private int estoque;
    private boolean ativo;
    
    public Produto(String descricao, int estoque, boolean ativo, double custo, double venda) {
        setDescricao(descricao);
        setEstoque(estoque);
        setAtivo(ativo);
        setVlcusto(custo);
        setVlvenda(venda);
    }
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the vlcusto
     */
    public double getVlcusto() {
        return vlcusto;
    }

    /**
     * @param vlcusto the vlcusto to set
     */
    public void setVlcusto(double vlcusto) {
        this.vlcusto = vlcusto;
    }

    /**
     * @return the vlvenda
     */
    public double getVlvenda() {
        return vlvenda;
    }

    /**
     * @param vlvenda the vlvenda to set
     */
    public void setVlvenda(double vlvenda) {
        this.vlvenda = vlvenda;
    }

    /**
     * @return the estoque
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String toString() {
        String ret;
        if (isAtivo()) ret = "[Ativo] ";
        else ret = "[Fora de Linha] ";
        ret = ret + getDescricao() + " [" +
                    getEstoque() + " peças] " +
                    "Preços=> Custo: " + getVlcusto() +
                    "   Venda: " + getVlvenda();
        return ret;
    }
    
}
