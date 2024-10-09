
package SistemaSolar;

import Planetas.Planeta;


public class ejecutar {
    
    public static void main(String[] args) {
        
        
        Planeta tierra = new Planeta("tierra");
        Planeta saturno = new Planeta("saturno");
        
        System.out.println("Información del planeta.");
        tierra.mostrarInfo();
        System.out.println("Densidad de jupiter: " 
                + tierra.calcularDensidad() + "Kg/Km³");
        System.out.println("¿Tierra es un planeta exterior? " + 
                (tierra.esPlanetaExterior() ? "Sí" : "No"));
        
        System.out.println("\n----------------------------\n");
        
        System.out.println("Información del planeta.");
        saturno.mostrarInfo();
        System.out.println("Densidad de marte: " 
                + saturno.calcularDensidad() + "Kg/Km³");
        System.out.println("¿Saturno es un planeta exterior? " + 
                (saturno.esPlanetaExterior() ? "Sí" : "No"));
    }
      
}
