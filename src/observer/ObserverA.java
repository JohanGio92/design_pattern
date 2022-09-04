package observer;


import observable.Observer;
import observable.Subject;

public class ObserverA implements Observer {
    private Subject subject;

    public ObserverA(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName() + ": sujeto a cambiado: " + this.subject.getState());
    }
}