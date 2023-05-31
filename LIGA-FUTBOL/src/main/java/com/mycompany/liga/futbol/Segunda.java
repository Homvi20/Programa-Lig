
package com.mycompany.liga.futbol;

public class Segunda extends Liga {

    @Override
    public void Bonus(Equipo a) {
        
        a.setValorE(a.getValorE()* 0.8);
         
    }

    @Override
    public void Victoria(Equipo a) {
        System.out.println(a.getEquipo() + " a ganado");
    }
    
    

   

    
    
    
}
