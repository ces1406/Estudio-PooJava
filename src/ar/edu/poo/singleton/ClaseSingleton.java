package ar.edu.poo.singleton;

public class ClaseSingleton {
    private String atributo1;

    public static ClaseSingleton claseSingleton = null;//la única singleton instancia
    private ClaseSingleton(){ //"private" para que no se pueda desde afuera instanciar la clase
        this.atributo1 = "valor default inicial";
    }
    public synchronized static ClaseSingleton getSingleton(){ //metodo de acceso a la clase
        if(claseSingleton==null){ // si no está ya instanciada la clase => la creo:
            claseSingleton = new ClaseSingleton();
        }
        return claseSingleton;
    }

    public void metodo1 (String param){
        System.out.println("Aca en metodo1 con -> "+param);
    }
}
