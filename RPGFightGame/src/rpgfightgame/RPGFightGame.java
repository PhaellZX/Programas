
package rpgfightgame;

import java.util.Random;
import java.util.Scanner;


public class RPGFightGame {  
    
    
    
    static int ataqueUsuario(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha seu ataque:");
        System.out.println("(1) - Soco");
        System.out.println("(2) - Especial");
        System.out.println("(3) - Curar");
        return leitor.nextInt();
        
    }
      
    static int ataqueComputador(){
        Random gerador = new Random();
        return gerador.nextInt(3)+1; // Retorno entre 1 e 3
    }
    
    static void imprimeHp(int hpUsuario,int hpComputador, int contagemEspeciais ,int contagemCura){
        System.out.println("=====================");
        System.out.println(" - HP USUÁRIO: " + hpUsuario);
        System.out.println(" - HP COMPUTADOR: " + hpComputador);
        System.out.println(" * CONTAGEM DO ESPECIAL: " + contagemEspeciais);
        System.out.println(" * CONTAGAGEM DA CURA: " + contagemCura);
        System.out.println("=====================");
    }
    
    static int batalha(){    
        
        int hpUsuario = 150;
        int hpComputador;
        int contagemEspecial = 5;
        int contagemCura = 3;
        int escolhaAtaque;
        int i = 0;
        
        while(hpUsuario > 0){
            hpComputador = 10 + i;
            
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("INIMIGO Nível:" + i);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=\n");
            
            while(hpUsuario > 0 && hpComputador > 0){ 
            imprimeHp(hpUsuario, hpComputador, contagemEspecial, contagemCura);
            escolhaAtaque = ataqueUsuario();
            switch(escolhaAtaque){
               case 1:
                   System.out.println("Usuario aplicou um soco!");
                   hpComputador -= 7;
                   break;
               case 2:
                   System.out.println("Usuario aplicou um ESPECIAL!");
                   hpComputador -= 20;
                   contagemEspecial --; // contagemEspecial = contagemEspecial - 1
                   break;
               case 3:
                   System.out.println("Usuario aplicou Curar!");
                   hpUsuario += 60;
                   contagemCura--;
                   if(hpUsuario > 150){
                   hpUsuario = 150; 
                   } 
                   System.out.println("Vida recuperada em 60 HP!");
                   break;
               default:
                   System.out.println("Opção Inválida!");
                   break;
           }
           if(hpComputador > 0){
              escolhaAtaque = ataqueComputador();
               switch(escolhaAtaque){
                   case 1:
                       System.out.println("Computador aplicou um soco!");
                       hpUsuario -= 2 + (int)(i / 10);
                       break;
                   case 2:
                       System.out.println("Computador aplicou um chute!");
                       hpUsuario -= 3 + (int)(i / 10);
                       break;
                   case 3:
                       System.out.println("Computador aplicou um ESPECIAL!");
                       hpUsuario -= 4 + (int)(i / 20);
                       break;
               }
           }
           else{
               System.out.println("Inimigo Derrotado!");
           }    
        } 
        if(hpUsuario > 0){
               hpUsuario += 5;
               if(hpUsuario > 150){
                   hpUsuario = 150; 
               } 
               if(i % 10 == 0){
                   contagemEspecial++;
                  if(contagemEspecial > 5){
                      contagemEspecial = 5;
                  } 
                  if(i % 30 == 0){
                      contagemCura++;
                      if(contagemCura > 3){
                          contagemCura = 3;
                      }
                  }
              }
        }
        i++; 
          
    }
        return i;
         }
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int continua = 1;
        int recorde = 0;
        while(continua == 1){
        
           int pontos = batalha();
           System.out.println("Usuário chegou no nível " + pontos );
           if(pontos < recorde){
                recorde = pontos;
           }
            System.out.println("RECORDE ATUAL = Nível " + recorde);
            
           System.out.println("Fim de Jogo! Deseja continuar? (1) Sim (2) Não.");
           continua = leitor.nextInt();
               
            
            
        
        }
}
    }
    

