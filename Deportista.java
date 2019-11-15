
package helpers;

/**
 *
 * @author Aylin Funez
 */
public class Deportista extends Persona {
    public Deportista (){
        
    setNombre("Andrés");
    setApellido("Iniesta");
    setProfesion("Deportista");
    setEdad(35);
    setPeso(150);
    setEstadocivil("Casado");
    }
    @Override
     public String getInfoPersona() {
       return "\n"+ "--Informacion Deportista--";
    }   
}
