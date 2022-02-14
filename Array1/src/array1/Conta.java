/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author dam1
 */
public class Conta {
    
  public static int[] numeros(int[]numeros){
     
        for(int i=0; i<numeros.length;i++){
        
            numeros[i]= (int) (Math.random()*31);
            
         
            
            
            
            }
            
           return numeros;
        
        
        }
        
        
   public static int[] numerosVerdadero(int[]numeros){
   int cont3 = 0;
   for (int i = 0; i < numeros.length; i++){
      
  if(numeros[i]==3){
   
    cont3++;
  }
  
       System.out.println("El numero de 3:" +cont3);
}
   
   
   
   return numeros ;
   
   
   
   }
  
  
   public static void ordenar (float numeros []){
  float aux = 0 ;
  for (int i =0;i<numeros.length-1;i++){
  
  for (int j = i+1;j<numeros.length;j++){
  
  if (numeros [i] >numeros[j]){
  
  aux = numeros [i];
  numeros [i]= numeros [j];
  numeros [j] = aux ;
  
  }
  
  
  
  }
  
  
  }
  
  
  
  }
  
  
  
  
    
    }
    
    
    
    
    
  
