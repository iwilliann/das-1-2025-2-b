package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        var grupoFamilia = new Publisher();

        var huguinho = new ConcreteSubscribers();
        var zezinho = new ConcreteSubscribers();
        var tia = new ConcreteSubscribers();

        // entoru no grupo da familia
        grupoFamilia.subscribe(zezinho);
        grupoFamilia.subscribe(huguinho);
        grupoFamilia.subscribe(tia);

        // mensagem no grupo da família
        grupoFamilia.setMainState("Hoje é dia de festa!");

        // botão enviar
        grupoFamilia.notifySubscribers();
    }
}
