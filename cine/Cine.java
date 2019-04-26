/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Entradas e=new Entradas(6, 12);
        int menu;
        
        do{
            System.out.println("0:Ver butacas || 1:Comprar entradas || Otro:Salir");
            menu=sc.nextInt();
            switch(menu){
                case 0: e.verButacas();
                    break;
                case 1: e.comprarEntrada();
                    break;
                default:menu=2;
            
            }
        }while(menu!=2);
        
        
    }
    
}
