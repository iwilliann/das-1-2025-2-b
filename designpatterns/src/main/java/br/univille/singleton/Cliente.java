package br.univille.singleton;

public class Cliente {
    public static void main(String[] args) {
    var segredo = "Palmeiras não tem mundial";

    var singleton = Singleton.getInstance(); // enderchest no chão
    singleton.setSegredo(segredo);

    System.out.println(Singleton.getInstance().getSegredo());
    }
}
