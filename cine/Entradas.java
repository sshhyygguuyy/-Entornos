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
public class Entradas {
    
    private int filas, columnas;
    private int [][] butacas;
    private int yaCompradas=0;
    
    public Entradas(int filas, int columnas){
        
        this.filas=filas;
        this.columnas=columnas;
        butacas=new int[filas][columnas];
        for (int i=0; i<filas; i++) {
            for (int j=0; j<columnas; j++) {
                butacas[i][j]=(j+1)+(butacas[0].length*i);
            }
        }
    }
    
    public void verButacas(){
        for (int i=0; i<butacas.length; i++) {
            for (int j=0; j<butacas[0].length; j++) {
                if(butacas[i][j]==0){
                    System.out.print("XX  ");
                }else{
                    if(butacas[i][j]<10){
                        System.out.printf("0%-3d", butacas[i][j]);
                    }else{
                        System.out.printf("%-4d", butacas[i][j]);
                    }
                }
            }
            System.out.println("");
        }
    }
    
    public void comprarEntrada(){
        Scanner sc=new Scanner(System.in);
        int nEntradas;
        int [] nButaca;
        boolean a=false;
        
        do{
            
            System.out.println("¿Cuántas entradas quieres comprar?");
            nEntradas=sc.nextInt();
            System.out.println((butacas.length*butacas[0].length)-yaCompradas);
            
            if(nEntradas>(butacas.length*butacas[0].length)-yaCompradas){
                System.out.println("No quedan tantas butacas");
            }else{
                a=true;
                yaCompradas=yaCompradas+nEntradas;
            }
            
            nButaca=new int [nEntradas];
        }while(a==false);
        
        for (int i=0; i<nEntradas; i++) {
            System.out.printf("¿Qué butaca deseas comprar? %d/%d:\t", i+1, nEntradas);
            nButaca[i]=sc.nextInt()-1;
                
            if(nButaca[i]<0 || nButaca[i]>(butacas.length*butacas[0].length)-1 || 
               butacas[nButaca[i]/butacas[0].length][(nButaca[i]%butacas[0].length)]==0){
                i--;
                System.out.println("Butaca no válida");
            }else{
                butacas[nButaca[i]/butacas[0].length][(nButaca[i]%butacas[0].length)]=0;
            }
        }
        
        for (int i=0; i<nEntradas; i++) {
            
        }
        
    }
}
