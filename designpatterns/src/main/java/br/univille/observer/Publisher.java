package br.univille.observer;

import java.util.ArrayList;

public class Publisher implements Subscriber{
    
    // public Subscriber[] subscriber = new Subscriber[10]; -> Limite de 10 posições
    private ArrayList<Subscriber> subscribers = new ArrayList<>(); // se adequa ao tamanho que o usuário necessita
    private String mainState;

    public String getMainState() {
        return mainState;
    }

    public void setMainState(String mainState) {
        this.mainState = mainState;
    }

    @Override
    public void update(String context) {
    }
    
    public void subscribe(Subscriber s){
        subscribers.add(s);
    }
    public void unsubscribe(Subscriber s){

    }
    public void notifySubscribers(){
        for(Subscriber umAssinante : subscribers){
            umAssinante.update(mainState);
        }
    }
    public void mainBusinessLogic(){
    
    }

}
