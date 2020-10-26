package ar.edu.poo.singleton;

public class TestSingleton {
    public static void main(String[] args){
        System.out.println("->SINGLETON:");
        ClaseSingleton objSingleton = ClaseSingleton.getSingleton();
        objSingleton.metodo1("hola mundo");
    }
}
