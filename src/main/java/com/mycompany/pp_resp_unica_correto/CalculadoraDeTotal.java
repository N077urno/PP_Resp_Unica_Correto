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
public class CalculadoraDeTotal {
     public double calcularTotal(List<Item> itens) {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}
