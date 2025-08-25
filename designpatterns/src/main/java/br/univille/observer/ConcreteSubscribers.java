package br.univille.observer;

public class ConcreteSubscribers implements Subscriber{
    
    public void update(String context) {
        System.out.println(context);
    }

}
