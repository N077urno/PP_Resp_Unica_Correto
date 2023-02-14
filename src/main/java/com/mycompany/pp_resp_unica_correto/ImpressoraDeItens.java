/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_resp_unica_correto;

import java.util.List;
/**
 *
 * @author nando
 */
public class ImpressoraDeItens {
    public void imprimirItens(List<Item> itens) {
        for (Item item : itens) {
            System.out.println(item.getNome() + " - " + item.getPreco());
        }
    }
}
