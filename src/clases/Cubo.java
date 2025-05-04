package clases;


public class Cubo {
    private int lado;

    /** Constructor por defecto = lado = 1 */
    public Cubo() {
        this.lado = 1;
    }

    
    public Cubo(int lado) {
        this.lado = lado;
    }

    
    public int superficie() {
        return 6 * (lado * lado);
    }

    
    public int volumen() {
        return lado * lado * lado;
    }
}
