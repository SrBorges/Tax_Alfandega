package com.company;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import com.company.Produto;
public class main {

    Date data = new Date();

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o produto: ");
        String nome = sc.nextLine();
        System.out.println("Informe o preco: ");
        double preco = sc.nextDouble();
        System.out.println("Informe a taxa: ");
        double taxa = sc.nextDouble();

        List<Produto> list = new ArrayList<>();

        System.out.println("1 - Produto. ");
        System.out.println("2 - Produto importado. ");
        System.out.println("3 - Produto usado. ");

        System.out.println("Informe o operador: ");
        int operador = sc.nextInt();

        switch(operador){

            case 1:
                list.add(new Produto(nome, preco));

                for(Produto prod : list){

                    prod.pmarcado();

                }
                break;
            case 2:
                list.add(new ProdutoImportado(nome, preco, taxa));

                for(Produto prod : list){

                    prod.pmarcado();
                }
                break;
            case 3:

                list.add(new ProdutoUsado(nome, preco, new Date()));

                for(Produto prod : list){

                    prod.pmarcado();

                }
                break;
            default:
                System.out.println("Opção inválida. ");

        }



        sc.close();

    }

}
