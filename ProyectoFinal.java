
package proyectofinal;

import helpers.Deportista;
import helpers.Doctor;


public class ProyectoFinal {

   
    public static void main(String[] args) {
        
         Doctor dc= new Doctor();
         System.out.println(dc.getInfoPersona());
         dc.MostrarInformacionDoctor();
         
         Deportista dp= new Deportista();
         System.out.println(dp.getInfoPersona());
         dp.MostrarInformacionDeportista();
         
    }
    
}
