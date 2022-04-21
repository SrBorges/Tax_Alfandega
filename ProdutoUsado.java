package com.company;
import com.company.Produto;
import java.util.Date;

public class ProdutoUsado extends Produto{

    private Date dataProduto;

    public ProdutoUsado(String nome, Double preco, Date dataProduto) {
        super(nome, preco);
        this.dataProduto = dataProduto;
    }

    @Override
    public void pmarcado(){

        System.out.println("Produto: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Data de fabricação: " + dataProduto);

    }


    public Date getDataProduto() {
        return dataProduto;
    }

    public void setDataProduto(Date dataProduto) {
        this.dataProduto = dataProduto;
    }


    @Override
    public String toString() {
        return "ProdutoUsado{" +
                "dataProduto=" + dataProduto +
                '}';
    }
}


