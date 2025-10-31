package week8;

public class ConcreteObserverB implements Observer {
    @Override
    public void update(String state) {
        System.out.println("[ObserverB] Notified. New state length: " + (state == null ? 0 : state.length()));
    }
}

