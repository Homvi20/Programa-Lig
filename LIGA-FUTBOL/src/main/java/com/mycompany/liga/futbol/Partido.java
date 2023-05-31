
package com.mycompany.liga.futbol;

import java.util.Random;


public class Partido {
    
    public void partid(Equipo A, Equipo B){
        Random random = new Random();
        int i = random.nextInt(2) + 1;
        
        switch(i){
               case 1 -> {
                   A.setVictoria(1 + A.getVictoria());
                   B.setDerrota(1 + B.getDerrota());
                   
            }
               case 2 -> {
                   B.setVictoria(1 + B.getVictoria());
                   A.setDerrota(1 + A.getDerrota());
                  
            }

        }
        
            
    }
            
            
    
}
