package com.company;
import com.company.Produto;

public class ProdutoImportado extends Produto{

    private Double alfandega;

    public ProdutoImportado(String nome, Double preco, Double alfandega) {
        super(nome, preco);
        this.alfandega = alfandega;
    }

    public Double totalPreco(){

        return alfandega += getPreco();

    }

    @Override
    public void pmarcado(){

        System.out.println("Produto: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Total: " + totalPreco());

    }



    public Double getAlfandega() {
        return alfandega;
    }

    public void setAlfandega(Double alfandega) {
        this.alfandega = alfandega;
    }

    @Override
    public String toString() {
        return "ProdutoImportado{" +
                "alfandega=" + alfandega +
                '}';
    }

}
