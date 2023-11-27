/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta.restaurante;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CONTARESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        double conta; 
        double dose;
        double valorTot = 0;
        double taxa = 1.10;
        
        System.out.println("Qual o valor da conta?");
        conta = sc.nextDouble();
        
      System.out.println("Qual o valor da dose?"); 
      dose = sc.nextDouble();
      
      while (count ==1){
          System.out.println("Ouvir mais um modao?\n1 - sim\n2 - nao");
          count = sc.nextInt();
          
          if (count == 1){
              conta = conta + dose;
              valorTot = conta * taxa;
          }
          
          System.out.println("Valor da conta: "+conta);
           System.out.println("Valor coms 10% : "+valorTot);
      }
      sc.close();
          }
      }
    
    

