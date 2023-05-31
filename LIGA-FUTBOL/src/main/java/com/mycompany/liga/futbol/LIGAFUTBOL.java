
package com.mycompany.liga.futbol;

import java.util.*;



public class LIGAFUTBOL {

    public static void main(String[] args) {
        
        List<ColoColo> Colo = new ArrayList();
        List<UCatolica> UC = new ArrayList();
        List<MelipillaFC> Meli = new ArrayList();
        List<RencaJR> RJR = new ArrayList();
        Partido P = new Partido();       
        Primera P1 = new Primera();
        Segunda P2 = new Segunda();        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        
        ColoColo Co = new ColoColo("Caseli", 25, "Colo Colo", 5000000);
        Colo.add(Co);
        Colo.add(new ColoColo("Juan Perez", 25, "Colo Colo", 1000000));
        Colo.add(new ColoColo("Luis Ramirez", 30, "Colo Colo", 500000));
        Colo.add(new ColoColo("Carlos Martinez", 22, "Colo Colo", 750000));
        Colo.add(new ColoColo("Diego Gonzalez", 28, "Colo Colo",  1200000));
        
        UCatolica Uc = new UCatolica("Andres Lopez", 31, "UCatolica", 900000);
        UC.add(Uc);
        UC.add(new UCatolica("Javier Castro", 29, "UCatolica", 800000));
        UC.add(new UCatolica("Felipe Torres", 27, "UCatolica", 1100000));
        UC.add(new UCatolica("Gabriel Soto", 24, "UCatolica", 600000));
        UC.add(new UCatolica("Pedro Vargas", 26, "UCatolica", 950000));
        Meli.add(new MelipillaFC("Ricardo Rojas", 23, "MelipillaFC", 700000));
        
        MelipillaFC Me = new MelipillaFC("Cristian Morales", 32, "MelipillaFC", 1500000);
        Meli.add(Me);
        Meli.add(new MelipillaFC("Miguel Ortega", 33, "MelipillaFC", 1800000));
        Meli.add(new MelipillaFC("Jose Valenzuela", 34, "MelipillaFC", 2000000));
        Meli.add(new MelipillaFC("Francisco Romero", 21, "MelipillaFC", 450000));
        
        RencaJR Re = new RencaJR("Manuel Rivera", 20, "RencaJR", 300000);  
        RJR.add(Re);
        RJR.add(new RencaJR("Gonzalo Diaz", 19, "RencaJR", 250000));
        RJR.add(new RencaJR("Hector Sánchez", 35, "RencaJR", 2200000));
        RJR.add(new RencaJR("Mario Fernández", 36, "RencaJR", 2400000));
        RJR.add(new RencaJR("Fernando González", 37, "RencaJR", 2600000));
        
        
        int C = 1;
            while(C <= 5){
              for (ColoColo jugador : Colo) {
                                        
               Co.setValorE(Co.getValorE() + jugador.getValorjugador());
               C = C + 1;
                                        
               }
                                    
            }
            P1.Bonus(Co); 
            
        int U = 1;
            while(U <= 5){
              for (UCatolica jugador : UC) {
                                        
               Uc.setValorE(Uc.getValorE() + jugador.getValorjugador());
               U = U + 1;
                                        
               }
              P1.Bonus(Uc); 
                                    
        int M = 1;
            while(M <= 5){
              for (MelipillaFC jugador : Meli) {
                                        
               Me.setValorE(Me.getValorE() + jugador.getValorjugador());
               M = M + 1;
                                        
               }
                                    
            }
            P2.Bonus(Me); 
        
        int R = 1;
            while(R <= 5){
              for (RencaJR jugador : RJR) {
                                        
               Re.setValorE(Re.getValorE() + jugador.getValorjugador());
               R = R + 1;
                                        
               }
                                    
            }
            P2.Bonus(Re); 
       
      
        while (!salir) {
 
            System.out.println("1. Partido Primera Division");
            System.out.println("2. Partido Segunda Division");
            System.out.println("3. Valores de Equipos");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                System.out.println("");
                switch (opcion) {
                    case 1 -> { P.partid(Uc, Co);
                                
                                
                                if(Uc.getVictoria()== 1){                                    
                                    Uc.setValorE(Uc.getValorE() * 1.4);
                                    System.out.println("Valor de UCatolica es: $" + Uc.getValorE() );
                                    System.out.println("");
                                    
                                }
                                else{Co.setValorE(Co.getValorE()* 1.4);
                                    System.out.println("Valor de Colo Colo es: $" + Co.getValorE() );
                                    System.out.println("");
                                    
                                }
                                
                    
                            }
                    
                    case 2 ->{ P.partid(Me, Re);
                    
                               
                               if(Me.getVictoria() == 1){
                                   Me.setValorE(Me.getValorE() * 1.4);
                                    System.out.println("Valor de MelipillaFC es: $" + Me.getValorE() );
                                     System.out.println("");
                                   
                               }
                               else{
                                   Re.setValorE(Re.getValorE() * 1.4);
                                    System.out.println("Valor de RencaJR es: $" + Re.getValorE() );
                                     System.out.println("");
                               }
                              }
                    
                    case 3 -> {System.out.println("Primera Division");
                               
                               P1.Victoria(Co);
                                                               
                               P1.Victoria(Uc);
                               
                               System.out.println("");
                               
                               System.out.println("Segunda Division");
                                                           
                               P2.Victoria(Me);
                                                             
                               P2.Victoria(Re);
                               
                               System.out.println("");
                              
                        
                              }
                        
                    case 4 -> salir = true;
                    default -> System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
       
    }
    }
}