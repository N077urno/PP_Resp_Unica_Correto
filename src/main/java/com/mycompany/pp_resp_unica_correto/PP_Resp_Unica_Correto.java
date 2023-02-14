/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_resp_unica_correto;

/**
 *
 * @author nando
 */
public class PP_Resp_Unica_Correto {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(new Item("Camisa", 50.0));
        carrinho.adicionarItem(new Item("Calça", 100.0));
        
        ImpressoraDeItens impressora = new ImpressoraDeItens();
        impressora.imprimirItens(carrinho.getItens());
        
        
        CalculadoraDeTotal calculadora = new CalculadoraDeTotal();
        double total = calculadora.calcularTotal(carrinho.getItens());
        System.out.println("Total: " + total);
    }
}
