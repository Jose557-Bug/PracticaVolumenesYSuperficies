package clases;


public class Cilindro {
    private int radio;
    private int altura;

    /** Constructor por defecto = radio = 1, altura = 1 */
    public Cilindro() {
        this.radio = 1;
        this.altura = 1;
    }

    
    public Cilindro(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }

    
    public double superficie() {
        double pi = 3.14;
        return 2 * pi * radio * radio + 2 * pi * radio * altura;
    }

    
    public double volumen() {
        double pi = 3.14;
        return pi * radio * radio * altura;
    }
}
