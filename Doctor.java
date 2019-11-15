
package helpers;


public class Doctor extends Persona {
    
      public Doctor (){
    
    setNombre("Marcos");
    setApellido("Paz");
    setProfesion("Doctor");
    setEdad(45);
    setPeso(150);
    setEstadocivil("Soltero");
    }
    @Override
     public String getInfoPersona() {
       return "--Informacion Doctor--";
    }   
}
