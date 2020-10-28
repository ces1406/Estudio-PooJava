package ar.edu.poo.libro.leccion1;

public class PatoCriollo extends Pato implements Volable, Quackable{
    public String color;
    public void volar(){
        System.out.println("Soy un patoCriollo volando...");
    }
    public void doQuack(){
        System.out.println("Soy un patoCriollo haciendo quack...");
    }
}
