package br.univille.singleton;

public class Singleton {
    //parece com uma variável global
    private static Singleton instance;
    private String segredo;

    public String getSegredo() {
        return segredo;
    }
    public void setSegredo(String segredo) {
        this.segredo = segredo;
    }
    private Singleton(){
        // construtor que não pode ser chamado externamente, a não ser pela própria classe/por ele mesmo
        System.out.println("Singleton: Construtor");
    }
    public static Singleton getInstance(){
        System.out.println("Singleton: getInstance");
        if (instance == null){
            System.out.println("Singleton: NEW");
            instance = new Singleton();
        }
        return instance;
    }
}

