package br.univille.observer;

public class Publisher implements Subscriber{
    private Subscriber[] subscriber;

    public Subscriber[] getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber[] subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void update(String message) {
    }
    
    public void subscribe(Subscriber s){}
    public void unsubscribe(Subscriber s){}
    public void notifySubscribers(){}
    public void mainBusinessLogic(){}

}
