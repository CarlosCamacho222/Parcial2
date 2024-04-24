public class planeta{
    String nombre;
    int numSatelites;
    double masa;
    double volumen;
    int diametro;
    int distanciaSol;
    boolean observable;

    public planeta(String nombre, int numSatelites, double masa, double volumen, int diametro, int distanciaSol,
            boolean observable) {
        this.nombre = nombre;
        this.numSatelites = numSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
    }
    
    public void imprimir(){
        System.out.println("Nombre del Planeta = "+nombre);
        System.out.println("Numero de Satelites = "+numSatelites);
        System.out.println("Masa del Planeta = "+masa);
        System.out.println("Volumen del planeta = "+volumen);
        System.out.println("Diametro del planeta = "+diametro);
        System.out.println("Distancia al sol = "+distanciaSol);
        System.out.println("Es observable = "+observable);
    }
}