package Dominio;

public class Dado {
    private int caraSuperior;

    public Dado() {
        lanzar();
    }

    public void lanzar() {
        caraSuperior = (int) (Math.random() * 6) + 1;
    }

    public int getCaraSuperior() {
        return caraSuperior;
    }
}
