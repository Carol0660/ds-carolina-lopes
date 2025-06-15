/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import com.sun.jdi.connect.spi.Connection;

import java.sql.*; 

import java.util.*; 

public class Teste {
     public static void main(String[] args) { 
        var con = (Connection) Conexao.abrirConexao();
        
        CarroBean cb = new CarroBean(); 
 
        CarroDAO cd = new CarroDAO(con); 
 
        //Testando método inserir 
        cb.setPlaca("JKL2897"); 
        cb.setCor("Verde"); 
        cb.setDescricao("Carro 3"); 
 
        System.out.println(cd.inserir(cb)); 
 
        //Testando método alterar 
        cb.setPlaca("JKL2897"); 
        cb.setCor("Amarelo"); 
        cb.setDescricao("Carro 3"); 
 
        System.out.println(cd.alterar(cb));
 
        cb.setPlaca("JKL2897"); 
        System.out.println(cd.excluir(cb));

        List<CarroBean> lista = cd.listarTodos(); 
 
        if(lista != null){ 
            for(CarroBean carro : lista){ 
                System.out.println("Placa: "+carro.getPlaca()); 
                System.out.println("Cor: "+carro.getCor()); 
                System.out.println("Descrição: "+carro.getDescricao()); 
            } 
        } 
        Conexao.fecharConexao(con);
     }
}