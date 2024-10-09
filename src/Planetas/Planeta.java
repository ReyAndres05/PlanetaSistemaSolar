
package Planetas;


public class Planeta {
    
    private String nombre;
    private int satelites;
    private double masa; 
    private double volumen;
    private int diametro;
    private int DistanciaMediaSol;
    private TipoPlaneta tipo;
    private boolean esObservable;
    
    enum TipoPlaneta{
        GASEOSO, ENANO, TERRESTRE}

public Planeta(String nombre) {
    this.nombre = nombre;
    this.iniciarPlatena();
}

private void iniciarPlatena(){
    switch (this.nombre.toLowerCase()){
        case "mercurio":
            this.satelites = 0;
            this.masa = 3.302E26;
            this.volumen = 6.083E10;
            this.diametro = 4879;
            this.DistanciaMediaSol = 58;
            this.tipo = TipoPlaneta.TERRESTRE;
            this.esObservable = true;
           break;
        case "venus":
            this.satelites = 0;
            this.masa = 4.867E27;
            this.volumen = 9.28E11;
            this.diametro = 12104;
            this.DistanciaMediaSol = 108;
            this.tipo = TipoPlaneta.TERRESTRE;
            this.esObservable = true;
            break;
        case "tierra":
            this.satelites = 1;
            this.masa = 5.972E24;
            this.volumen =  1.08332E12;
            this.diametro = 12742;
            this.DistanciaMediaSol = 150;
            this.tipo = TipoPlaneta.TERRESTRE;
            this.esObservable = true;
            break;
        case "marte":
            this.satelites = 2;
            this.masa = 6.4185E23;
            this.volumen =  1.6318E11;
            this.diametro = 6779;
            this.DistanciaMediaSol = 228;
            this.tipo = TipoPlaneta.TERRESTRE;
            this.esObservable = true;
            break;
        case "jupiter":
            this.satelites = 95;
            this.masa = 1.898E27;
            this.volumen =  1.899E27;
            this.diametro = 139820;
            this.DistanciaMediaSol = 750;
            this.tipo = TipoPlaneta.GASEOSO;
            this.esObservable = true;
            break;
        case "saturno":
            this.satelites = 146;
            this.masa = 5.683E26;
            this.volumen =  8.27E23;
            this.diametro = 116460;
            this.DistanciaMediaSol = 1418;
            this.tipo = TipoPlaneta.GASEOSO;
            this.esObservable = true;
            break;
        case "urano":
            this.satelites = 27;
            this.masa = 8.681E25;
            this.volumen =  6.833E13;
            this.diametro = 50724;
            this.DistanciaMediaSol = 3000;
            this.tipo = TipoPlaneta.GASEOSO;
            this.esObservable = false;
            break;
        case "neptuno":
            this.satelites = 16;
            this.masa = 1.024E26;
            this.volumen =  6.254E13;
            this.diametro = 49244;
            this.DistanciaMediaSol = 4500;
            this.tipo = TipoPlaneta.GASEOSO;
            this.esObservable = false;
            break;
    }
}

public void mostrarInfo(){
    if (nombre !=null){
        System.out.println("El nombre del planeta es: " + nombre);
        System.out.println("Cantidad de satélites: " + satelites);
        System.out.println("Masa del planeta: " + masa + "Kg");
        System.out.println("Volumen del planeta: " + volumen + "Km³");
        System.out.println("Diámetro del planeta: " + diametro + "Km");
        System.out.println("Distancia al sol: " + DistanciaMediaSol + "Millones"
                + "Km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("¿Es observable? " + esObservable);
    }
}
    
public double calcularDensidad(){
    return masa/volumen;
}   
    
public boolean esPlanetaExterior(){
    
    double limiteMax = 3.4 * 149597870;
    
    double distanciaPlaneta = DistanciaMediaSol * 1_000_000;
    
    if (distanciaPlaneta>limiteMax){
        return true;
    } else {
        return false;
    }
}  
}
