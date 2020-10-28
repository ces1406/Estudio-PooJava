package ar.edu.poo.libro.leccion1;

public class PatoRojo extends Pato implements Volable, Quackable{

    public void volar() {
        System.out.println("Soy un PatoRojo volando...");
    }
    public void doQuack(){
        System.out.println("Soy un PatoRojo haciendo quack!...");
    }
}
