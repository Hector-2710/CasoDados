package Dominio;

public class Juego {
    private Dado dado1;
    private Dado dado2;
    private Calculadora calculadora;

    public Juego() {
        this.dado1 = new Dado();
        this.dado2 = new Dado();
        this.calculadora = new Calculadora();
    }

    public void jugar() {
        dado1.lanzar();
        dado2.lanzar();
        int suma = calculadora.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());
        imprimirResultado(suma);
    }
    public void imprimirResultado(int resultado){
        if (resultado == 7) {
            System.out.println("---Ganaste---");
        } else {
            System.out.println("---Perdiste---");
        }
    }
}
