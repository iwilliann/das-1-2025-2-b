package br.univille.singleton;

public class Singleton {
    // parece variáveia globais
    private static Singleton instance;

    private Singleton() {
        // construtor que não pode ser chamado externamente, a não ser pela própria classe/por ele mesmo
    }

    public static Sinsgleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
