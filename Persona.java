
package helpers;


public abstract class Persona {
    
      private String nombre; 
      private String apellido;
      private String profesion;
      private int edad;
      private double peso;
      private String estadocivil;
      
public Persona(){

}

 public void setNombre(String nombre) 
 {   this.nombre = nombre; 
 
  }

 public  String getNombre(){
       return this.nombre;
 }
 
 public void setApellido(String apellido) 
 {   this.apellido = apellido; 
 
  }

 public  String getApellido(){
       return this.apellido;
 }

public void setProfesion(String profesion) 
 {   this.profesion = profesion; 
  }

 public  String getProfesion(){
       return this.profesion;
 }
 
  public void setEdad(int edad) 
 {   this.edad = edad; 
 
  }

 public  int getEdad(){
       return this.edad;
 }
 
   public void setPeso(double peso) 
 {   this.peso = peso; 
 
  }

 public  double getPeso(){
       return this.peso;
 }
 
 
 public void setEstadocivil(String estadocivil) 
 {   this.estadocivil = estadocivil; 
  }

 public  String getEstadocivil(){
       return this.estadocivil;
 }
 
 public void MostrarInformacionDoctor(){
    
    System.out.println("Nombre: " + nombre );
    System.out.println("Apellido: " + apellido );
    System.out.println("Edad: " + edad );
    System.out.println("peso: " + peso );
    System.out.println("Profesion: " + profesion );
    System.out.println("Estado Civil: " + estadocivil );
    
    }
 public void MostrarInformacionDeportista(){
     
    System.out.println("Nombre: " + nombre );
    System.out.println("Apellido: " + apellido );
    System.out.println("Edad: " + edad );
    System.out.println("peso: " + peso );
    System.out.println("Profesion: " + profesion );
    System.out.println("Estado Civil: " + estadocivil );
    
    }
    
   abstract String getInfoPersona();
}
 


